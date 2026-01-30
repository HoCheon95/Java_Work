package com.example.middle_spring.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.middle_spring.dto.MemberDTO;
import com.example.middle_spring.mappers.memberMapper;
import com.example.middle_spring.pwdconv.PwdChange;

@Controller
public class PwdFindOKController {

    /*
     *  비번찾기 결과 컨트롤러 
     */

    @Autowired
    private memberMapper memberMapper; // 서비스 주입

    @RequestMapping("/pwd_find_ok.do")
    public String pwd_find_ok(@RequestParam("pwd_id") String pwd_id, @RequestParam("pwd_name") String pwd_name, org.springframework.ui.Model model) {
		
		MemberDTO member = new MemberDTO();
		member.setMem_id(pwd_id);
		member.setMem_name(pwd_name);
		
		MemberDTO pm = memberMapper.findMemberByIdAndName(member);
		//아이디와 회원이름을 기준으로 디비로 부터 회원정보 검색
		if(pm == null){
			System.out.println("회원정보를 찾을 수 없습니다.");
		}else{
			Random r = new Random();
			int pwd_random = r.nextInt(100000);//0이상 십만 미만 사이의 정수 숫자 난수를 발생
			String ran_pwd = Integer.toString(pwd_random);//임시 정수 비번을 문자열로 변경
			member.setMem_pwd(PwdChange.getPassWordToXEMD5String(ran_pwd));//임시 비번 암호화
			memberMapper.updateMemberPwd(member);//디비에 임시 비번으로 수정
			System.out.println("임시 비번: " + ran_pwd);
			model.addAttribute("ran_pwd", ran_pwd);//뷰로 임시 비번 전달
			
			
		}
		return "member/pwd_find_ok";//뷰 이름 반환
    }

}
