package com.example.middle_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.middle_spring.dto.BbsDTO;
import com.example.middle_spring.mappers.bbsMapper;


/* 사용자 자료실 관리자 답변달기 저장 컨트롤러 */
@Controller
public class BbsReplyOKController {

    //스프링이 미리 생성해둔 bbsMapper 객체를 이 변수에 자동으로 할당(주입)
    @Autowired
    private bbsMapper bbsMapper;

    // bbs_reply_od.do URL 요청이 들어오면 이 메서드가 실행
    @RequestMapping("/bbs_reply_ok.do")
    public String bbsReplyOk(
        // 커맨드 객체 : HTML의 input name과 DTO의 필드명이 같으면 값이 자동으로 세팅되어 들어온다.
        // (즉, request.getParameter와 수동 set 과정이 생략됨)
        BbsDTO bbsdata,

        // @RequestParam: URL이나 hidden으로 전달된 "page" 파라미터 값을 int page 변수에 담는다.
        // 값이 없을 경우 기본값으로 "1"을 사용
        @RequestParam(value = "page", defaultValue = "1") int page) {
        
        /*
        1. 답변글 출력 순서(bbs_step) 조정 
        동일 그룹(bbs_ref) 내에서 새로운 답변이 들어갈 자리를 확보하기 위해
        기존 답변들의 step을 1씩 증가시키는 Update문을 실행
        */
        bbsMapper.updateReplyStep(bbsdata);
        
        /*
        2. 답변글 데이터 Insert 
        원본글의 정보를 바탕으로 계산된 step+1, level+1 값을 적용하여
        최종적으로 DB에 답변 레코드를 생성
        */
        bbsMapper.insertReply(bbsdata);
        
        /*
        3. 목록 페이지로 리다이렉트
        POST 방식의 요청 후 새로고침에 의한 중복 등록을 방지하고
        사용자 경험을 위해 기존 페이징 위치로 이동시킵니다.
        */
        return "redirect:bbs_list.do?page=" + page;
    }


}
