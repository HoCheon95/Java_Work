package com.example.middle_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.middle_spring.dto.MemberDTO;
import com.example.middle_spring.service.MemberService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


/* 사용자 회원관리 정보수정 폼 이동 컨트롤러 */
@Controller
public class MemberEditController {
    @Autowired
    private MemberService memberService;
    @RequestMapping("/member_edit.do")
    public String memberEdit(HttpSession session, HttpServletRequest request, RedirectAttributes rttr, Model model) {

        // 1. 세션에서 로그인된 아이디 가져오기
        String id = (String)session.getAttribute("id");

        if(id == null){
            // 2. 로그인 안 된 경우 로그인 페이지로 redirect (컨트롤러 주소로)
            rttr.addFlashAttribute("msg", "다시 로그인 하세요!");
            return "redirect:/member_login.do";
        }else{
            // 3. 폰 번호 및 이메일 배열 설정 (회원가입과 동일한 스타일)
            String[] phone = {"010", "019"};
            String[] email = {"naver.com", "daum.net", "gmail.com", "직접입력"};
            // 4. Model에 데이터 담기 (request.setAttribute 대신 사용)
            model.addAttribute("phone", phone);
            model.addAttribute("email", email);

            // 5. DB에서 회원 정보 가져오기
            MemberDTO m = memberService.getMember(id);
            
            // 6. JSP에서 사용할 키값 "em"으로 저장 (사진 참고)
            model.addAttribute("em", m);

            // 7. 뷰 페이지 경로 설정
            // 실제 파일: /WEB-INF/views/member/member_Edit.jsp
            return "member/member_Edit";
        }
    }
}
