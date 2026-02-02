package com.example.middle_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.middle_spring.dto.MemberDTO;
import com.example.middle_spring.mappers.memberMapper;
import com.example.middle_spring.pwdconv.PwdChange;

import jakarta.servlet.http.HttpSession;


@Controller
public class MemberDeLOKController {

    @Autowired
    private memberMapper memberMapper; // 서비스 주입

    @RequestMapping("/member_del_ok.do")
    public String member_del_ok(String del_pwd, String del_cont, HttpSession session, RedirectAttributes rttr) {

        //1. 세션에서 로그인된 아이디 가져오기
        String id = (String)session.getAttribute("id");

        if(id == null){
            rttr.addFlashAttribute("msg", "다시 로그인 하세요!");
            return "redirect:/member_login.do";
        }else{
            //2. DB에서 현재 비밀번호 가져오기
            MemberDTO db_pwd = memberMapper.getMember(id);
            //3. 입력한 비번(MD5 암호화)과 DB비번 비교
            if(!db_pwd.getMem_pwd().equals(PwdChange.getPassWordToXEMD5String(del_pwd))){
                rttr.addFlashAttribute("msg", "비밀번호가 다릅니다!");
                return "redirect:/member_del.do";
            }else{
                //4. 탈퇴 처리 로직
                MemberDTO dm = new MemberDTO();
                dm.setMem_id(id);
                dm.setMem_delcont(del_cont); //탈퇴 사유 저장

                memberMapper.delMember(dm);

                //5. 세션 로그아웃 처리 및 메인 이동
                rttr.addFlashAttribute("msg", "회원탈퇴 했습니다!");
                session.invalidate();
                return "redirect:/index.do";
            }
        }
    }
}
