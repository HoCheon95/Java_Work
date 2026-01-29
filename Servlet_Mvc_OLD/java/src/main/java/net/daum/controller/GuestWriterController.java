package net.daum.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 서블릿 MVC 방명록 입력폼 뷰페이지 인 guest_write.jsp로 이동하게 하는 컨트롤러 클래스 */
@WebServlet("/guest_write") // /guest_write 매핑주소 등록
public class GuestWriterController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher gw = request.getRequestDispatcher("./WEB-INF/views/guestBook/guest_write.jsp");
		//화면에 보여지는 뷰페이지 경로 설정
		gw.forward(request, response);//기존 매핑주소를 유지하면서 해당 뷰페이지로 이동한다.
	}

}
