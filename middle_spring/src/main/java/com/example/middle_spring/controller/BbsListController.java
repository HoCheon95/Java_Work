package com.example.middle_spring.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.middle_spring.dto.BbsDTO;
import com.example.middle_spring.mappers.bbsMapper;


/* 사용자 자료실 목록 -> 페이징 목록(검색전 총페이징 목록과 총 레코드 개수/검색후 페이징 목록과 레코드 개수 ) */
@Controller
public class BbsListController {

    @Autowired
    private bbsMapper bbsMapper;

    @RequestMapping("/bbs_list.do")
    public String bbsList(
        @RequestParam(value = "page", defaultValue = "1") int page,
        @RequestParam(value = "find_name", defaultValue = "") String find_name,
        @RequestParam(value = "find_field", defaultValue = "") String find_field,
        Model model) throws IOException {

        int limit = 10; //한페이지에 보여지는 목록개수
        
        // 1. 쿼리에 전달할 검색 조건
        BbsDTO findB = new BbsDTO();
        findB.setFind_field(find_field);
        findB.setFind_name("%" + find_name + "%");
        //SQL문에서 %는 검색에서 하나이상의 모르는 임의의 문자와 매핑 대응하는 와일드 카드문자
        
        // 2. 검색 결과 총 개수 조회
        int totalCount = bbsMapper.getRowCount(findB); //검색전 총레코드 개수,검색후 레코드 개수
        
        // 3. 페이징 계산 (StartRow, EndRow)
        findB.setStartrow((page - 1) * 10 + 1); //시작행번호
        findB.setEndrow(findB.getStartrow() + limit - 1); //끝행 번호

        List < BbsDTO > blist = bbsMapper.getBbsList(findB); //검색 전후 목록

        // 4. 페이지 네비게이션 계산
        int maxpage = (int)((double) totalCount / limit + 0.95);
        //시작페이지(1,11,21 ..)
        int startpage = (((int)((double) page / 10 + 0.9)) - 1) * 10 + 1;
        //현재 페이지에 보여질 마지막 페이지(10,20 ..)
        int endpage = maxpage;
        if (endpage > startpage + 10 - 1) endpage = startpage + 10 - 1;

        // 5. 뷰(JSP)로 데이터 전달
        model.addAttribute("blist", blist); //blist문자열 속성 키이름에 자료실 목록을 저장
        model.addAttribute("page", page); //쪽번호 -> 내가 본 쪽번호로 바로 이동하기 위한 책갈피 기능 구현
        model.addAttribute("startpage", startpage); //시작페이지
        model.addAttribute("endpage", endpage); //마지막 페이지
        model.addAttribute("maxpage", maxpage); //최대 페이지
        model.addAttribute("listcount", totalCount); //검색전후 레코드 개수
        model.addAttribute("find_field", find_field); //검색 필드
        model.addAttribute("find_name", find_name); //검색어

        return "bbs/bbs_list";
    }


}
