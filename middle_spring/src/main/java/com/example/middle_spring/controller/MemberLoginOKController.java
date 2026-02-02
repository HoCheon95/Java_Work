package com.example.middle_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.middle_spring.dto.MemberDTO;
import com.example.middle_spring.mappers.memberMapper;
import com.example.middle_spring.pwdconv.PwdChange;

import jakarta.servlet.http.HttpSession;


@Controller
public class MemberLoginOKController {

    @Autowired
    private memberMapper memberMapper;
    
    @PostMapping("/member_login_ok.do")
    public String member_login(@RequestParam("login_id") String id, @RequestParam("login_pwd") String pwd, HttpSession session, RedirectAttributes rttr) {

        System.out.println("loginOK 컨트롤러 도착 : " + id);

        //1. DB에서 아이디로 회원 정보 조회
        MemberDTO db_id = memberMapper.loginCheck(id);

        //2. 가입 여부 확인
        if(db_id == null){
            rttr.addFlashAttribute("msg", "가입 안 된 회원입니다!");
            return "redirect:/member_login.do";//로그인 페이지로 리다이렉트
        }

        //3. 비밀번호 비교
        if(!db_id.getMem_pwd().equals(PwdChange.getPassWordToXEMD5String(pwd))){
            rttr.addFlashAttribute("msg", "비밀번호가 일치하지 않습니다.");
            return "redirect:/member_login.do";
        }

        //4. 로그인 성공: 세션에 아이디 저장 및 메인으로 이동
        session.setAttribute("id", id);
        return "redirect:/member_login.do";

    }
    
}
