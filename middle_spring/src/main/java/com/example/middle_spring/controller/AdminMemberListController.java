package com.example.middle_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.middle_spring.dto.MemberDTO;
import com.example.middle_spring.mappers.admin;

import jakarta.servlet.http.HttpSession;

@Controller
public class AdminMemberListController {

    @Autowired
    private admin adminMemberService;

    @RequestMapping("/admin_member_list.do")
    public String adminMemberList(
            HttpSession session, 
            RedirectAttributes rttr, 
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value="find_name", defaultValue = "") String find_name,
            @RequestParam(value="find_field", defaultValue = "") String find_field,
            Model model) {

        String admin_id = (String)session.getAttribute("admin_id");

        if (admin_id == null) {
            rttr.addFlashAttribute("msg", "관리자로 다시 로그인 하세요!");
            return "redirect:/admin_login.do";
        } else {
            /* 1. 검색 및 기본 설정 */
            int limit = 10; // 한 페이지에 보여지는 목록 개수
            
            MemberDTO findB = new MemberDTO();
            findB.setFind_field(find_field);
            if (find_name != null && !find_name.isEmpty()) {
                findB.setFind_name("%" + find_name + "%"); // 오라클 와일드카드 적용
            }

            /* 2. 페이징 시작/끝행 계산 */
            int listcount = adminMemberService.getMemberCount(findB); // 검색 전후 레코드 개수
            int startrow = (page - 1) * limit + 1; 
            int endrow = startrow + limit - 1;
            
            findB.setStartrow(startrow);
            findB.setEndrow(endrow);

            /* 3. DB 데이터 조회 */
            List<MemberDTO> mlist = adminMemberService.getMemberList(findB);

            /* 4. 상세 페이징 연산 (이미지 3 내용 반영) */
            // 총 페이지 수
            int maxpage = (int)((double)listcount / limit + 0.95);
            // 현재 페이지에 보여줄 시작 페이지 수 (1, 11, 21...)
            int startpage = (((int)((double)page / 10 + 0.9)) - 1) * 10 + 1;
            // 현재 페이지에 보여줄 마지막 페이지 수 (10, 20, 30...)
            int endpage = startpage + 10 - 1;

            if (endpage > maxpage) endpage = maxpage;

            /* 5. 뷰로 데이터 전달 (Model 사용) */
            model.addAttribute("mlist", mlist);             // mlist키이름에 검색전, 후 회원목록 저장
            model.addAttribute("page", page);               // page키이름에 쪽번호인 페이지 번호 저장
            model.addAttribute("startpage", startpage);     // 시작페이지 저장
            model.addAttribute("endpage", endpage);
            model.addAttribute("maxpage", maxpage);
            model.addAttribute("listcount", listcount);     // 검색 전 총회원수, 검색 후 회원수 저장
            model.addAttribute("find_field", find_field);   // 검색 필드 저장
            model.addAttribute("find_name", find_name);     // 검색어 저장
            
            // 6. 뷰페이지 이동
            return "admin/admin_member_list"; 
        }
    }
}