// package com.example.middle_spring.controller;

// /* 서블릿 MVC 회원가입 컨트롤러 클래스 */
// public class MemberJoinController implements Action{

//     @Override
//     public ActionForward execute(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws Exception {

//         String[] phone = {"010","019"};
//         String[] email = {"naver.con", "daum.net", "gmail.com", "직접입력"};

//         request.setAttribute("phone", phone);
//         request.setAttribute("email", email);

//         ActionForward forward = new ActionForward();
//         forward.setRedirect(false);//false로 해야 기존매핑주소를 유지하면서 request.setAttribute("키이름",값); 키이름에 저장된 값도 유지한다.
//         forward.setPath("/WEB-INF/views/member/member_Join.jsp");//뷰페이지 경로 설정
        
//         return forward;
//         //주의할 것은 return null이면 해당 뷰페이지가 안보이고 하얀 화면만 나온다.
//         //꼭 return forward;로 해야 해당 뷰페이지가 보이고, 매핑주소로 이동한다.
//     };

// }

