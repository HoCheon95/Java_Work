package com.example.middle_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.middle_spring.dto.AdminDTO;
import com.example.middle_spring.mappers.admin;
import com.example.middle_spring.pwdconv.PwdChange;

import jakarta.servlet.http.HttpSession;

@Controller
public class AdminLoginOKController {

    @Autowired
    private admin adminMapper;

    @PostMapping("/admin_login_ok.do")
    public String admin_login(
        @RequestParam("admin_id") String admin_id,
        @RequestParam("admin_pwd") String admin_pwd,
        HttpSession session,
        RedirectAttributes rttr) {

        System.out.println("loginOK 컨트롤러 도착 : " + admin_id);

        // 1. 입력받은 비밀번호를 MD5로 암호화 (변수에 할당하여 재사용)
        String encryptedPwd = PwdChange.getPassWordToXEMD5String(admin_pwd);

        //[참고] 만약 관리자를 먼저 등록해야 하는 상황이라면 아래 주석을 해제하세요.
        // AdminDTO ab = new AdminDTO();
        // ab.setAdmin_id(admin_id);
        // ab.setAdmin_pwd(encryptedPwd);
        // ab.setAdmin_no(1);
        // ab.setAdmin_name("관리자");
        // adminMapper.insertAdmin(ab);


        // 2. DB에서 관리자 정보 조회
        AdminDTO admin_info = adminMapper.adminLogin(admin_id);

        // 3. 로그인 인증 로직
        if (admin_info == null) {
            // 관리자 아이디가 존재하지 않는 경우
            rttr.addFlashAttribute("msg", "관리자 정보가 없습니다!");
            return "redirect:/admin_login.do";

        } else {
            // 비밀번호 비교 (DB의 암호화된 비번 vs 현재 입력받아 암호화한 비번)
            if (!admin_info.getAdmin_pwd().equals(encryptedPwd)) {
                rttr.addFlashAttribute("msg", "관리자 비번이 다릅니다!");
                return "redirect:/admin_login.do";

            } else {
                // 로그인 성공 시 세션 저장
                session.setAttribute("admin_id", admin_info.getAdmin_id());
                session.setAttribute("admin_name", admin_info.getAdmin_name());

                System.out.println(admin_info.getAdmin_name() + "님 로그인 성공");
                return "redirect:/admin_index.do";
            }
        }
    }
}
