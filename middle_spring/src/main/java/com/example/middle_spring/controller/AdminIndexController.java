package com.example.middle_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;


/* 관리자 로그인 인증 후 관리자 메인화면으로 이동하는 컨트롤러 */
@Controller 
// 해당 클래스를 Spring의 컨트롤러 객체로 자동 등록하며, 사용자 요청(URL)을 받아
//화면(View)을 연결해 주는 입구 역할을 한다.
public class AdminIndexController {

    @RequestMapping("admin_index.do")
    public String admin_index(HttpSession session, RedirectAttributes rttr) {


        //1. 세션에서 어드민 아이디 구함
        String admin_id = (String)session.getAttribute("admin_id");

        if(admin_id == null){
            //로그인 안된 경우 알림 메시지와 로그인창으로 이동
            rttr.addFlashAttribute("msg", "관리자로 다시 로그인 하세요!");
            return "redirect:admin_login.do";
        }

        //로그인 된 경우 관리자 메인 화면 호출
        return "admin/admin_index";
    }
    
}
