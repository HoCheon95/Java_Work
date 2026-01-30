package com.example.middle_spring.controller;


// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpServletResponse;

// /* 우편검색 공지창 띄우는 컨트롤러 */
// public class ZipFindController implements Action{

//     @Override
//     public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

//         ActionForward forward = new ActionForward();
//         forward.setRedirect(false);//기본 매핑주소를 유지하면서 해당 뷰페이지로 이동
//         forward.setPath("/WEB-INF/views/member/zip_find.jsp");
//         return forward;
//     }
    
// }
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class ZipFindController {

    @GetMapping("/zip_find.do")
    public String getMethodName() {
        return "member/zip_find";
    }
    
}