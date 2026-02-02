package com.example.middle_spring.controller;

import com.example.middle_spring.service.*;
import com.example.middle_spring.dto.*;
import com.example.middle_spring.mappers.memberMapper;

import org.springframework.beans.factory.annotation.Autowired;

// /* 아이디 중복 검색 컨트롤러 */
// public class MemberIDCheckController implements Action{

//     @Override
//     public ActionForward execute(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws Exception {
//         response.setContentType("text/html;charset=UTF-8");//웹브라우저에 출력되는 문자와 태그, 언어코딩 타입을 설정

//         PrintWriter out = response.getWriter();//출력스트림 객체 out생성
//         MemberService memberService = new MemberServiceImpl();//업캐스팅

//         String id = request.getParameter("id");//비동기식 아작스로 post방식으로 전달된 아이디값을 가져와서 저장

//         MemberDTO db_id = memberService.idCheck(id);//DB로 부터 아이디 중복 검색

//         int re = -1;

//         if(db_id != null){//중복 아이디가 있는 경우
//             re = 1;
//         }

//         out.println(re);//값이 반환
//         return null;
//     };
    
// }

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MemberIDCheckController {

    @Autowired
    private memberMapper memberMapper;

    @PostMapping("/member_idcheck.do")  
    @ResponseBody
    public int postMethodName(@RequestParam("id") String id) {
        System.out.println("idCheck 컨트롤러 도착: " + id);
      MemberDTO db_id = memberMapper.idCheck(id);

        int re = -1;
        if (db_id != null) {
            re = 1; // 중복 아이디가 있는 경우
        }
        
        return re;
    }
    
}