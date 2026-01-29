package net.daum.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.daum.dao.GuestBookDAOImpl;
import net.daum.dto.GuestDTO;

/**
 * guest_list 매핑주소가 실행될때 서블릿 MVC 방명록 목록보기 서블릿 컨트롤러 클래스이다.
 */
@WebServlet("/guest_list")
public class GuestListController extends HttpServlet {
       
    /**
     * get or post에 상관없이 호출되는 service()메서드를 오버라이딩 함
     */
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GuestBookDAOImpl gdao = new GuestBookDAOImpl();
		List<GuestDTO> glist = gdao.getGuestList();//방명록 목록을 가져옴
		
		request.setAttribute("g_list", glist);//g_list 키이름에 방명록 목록이 저장된 컬렉션 제네릭 객체 glist를 저장
		
		RequestDispatcher glistForward = request.getRequestDispatcher("./WEB-INF/views/guestBook/guest_list.jsp");
		//방명록 목록보기 뷰페이지 경로 설정
		glistForward.forward(request, response);
		/*
		 * RequestDispatcher 서블릿 특징)
		 * 	1. 기본 매핑주소를 유지하면서 request.setAttribute(키이름, 값)에 의한 키이름에 저장된 값도 유지하면서 해당 뷰페이지인 guest_list.jsp가 보여지게 된다.
		 */
	}

}
