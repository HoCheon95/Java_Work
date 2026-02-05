package com.example.middle_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.middle_spring.dto.BbsDTO;
import com.example.middle_spring.dto.FileDTO;
import com.example.middle_spring.mappers.bbsMapper;


/* 사용자 자료실 내용보기 만 조회수 증가 / 답변폼, 수정폼, 삭제폼 -> 조회수 증가 안함 -> BbsContController */
@Controller
public class BbsContentController {

    @Autowired
    private bbsMapper bbsMapper;

    @GetMapping("/bbs_cont.do")
    public String bbsContent(
            @RequestParam("bbs_no") int bbsNo,
            @RequestParam("state") String state,
            @RequestParam(value = "page", defaultValue = "1") int page,
            Model model) {

        BbsDTO bc = null;

        // 1. 조회수 증가 여부에 따른 데이터 호출
        if (state.equals("cont")) {
            bbsMapper.updateHit(bbsNo); // 먼저 조회수 증가
            bc = bbsMapper.getBbsCont(bbsNo); // 그 다음 데이터 호출
        } else {
            bc = bbsMapper.setBbsCont2(bbsNo); // 조회수 증가 미포함 (수정/삭제/답변 폼)
        }

        // 2. 내용 줄바꿈 처리 (textarea 엔터키 대응)
        String bbsCont = bc.getBbs_cont().replace("\n", "<br/>");

        // 3. 첨부파일 정보 조회 (설계 사전 기반 PT_KID 등 활용)
        if (bc.getBbs_attached_file() == 7) { 
            List<FileDTO> fileList = bbsMapper.getFileInfo(bc.getBbs_no());
            model.addAttribute("fileList", fileList);
        }

        // 4. 뷰로 데이터 전달
        model.addAttribute("b", bc);
        model.addAttribute("bcont", bbsCont);
        model.addAttribute("page", page);

        // 5. state 값에 따른 동적 뷰(JSP) 경로 리턴
        return "bbs/bbs_" + state; 
        // state가 'cont'면 bbs/bbs_cont.jsp로 이동
    }
}