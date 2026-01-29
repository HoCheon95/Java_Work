package net.daum.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.daum.dao.GuestBookDAOImpl;
import net.daum.dto.GuestDTO;

/* guest_write_ok 방명록 저장 매핑주소가 실행이 될때 작동하는 서블릿 컨트롤러 클래스 */
@WebServlet("/guest_write_ok")
public class GuestOKController extends HttpServlet {
	
	/*
	 * post로 접근할 때는 doPost()메서드를 오버라이딩 해서 호출
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");//웹브라이저에 응답하는 문자와 태그, 언어코딩 타입 설정
		PrintWriter out = response.getWriter();// 출력스트림 out 생성
		
		request.setCharacterEncoding("UTF-8");//POST 방식으로 전송되는 한글 안꺠지게 한다.
		
		String name = request.getParameter("gname");//gname 네임파라미터 이름에 저장되어 져서 전달된 글쓴이를 가져와서 좌측변수에 저장
		String title = request.getParameter("gtitle");//글제목 저장
		String cont = request.getParameter("gcontent");//글내용 저장
		
		out.println("<h2>서블릿 MVC 방명록 저장</h2>");
		out.println("글쓴이 : " + name + "<hr>");
		out.println("글제목 : " + title + "<hr>");
		out.println("글내용 : " + cont + "<hr>");
		
		out.println("<button type='button' onclick=\"location='guest_write';\">" + "방명록 글쓰기로 이동</button>");
		
		GuestDTO g = new GuestDTO();
		g.setGname(name); g.setGtitle(title); g.setGcontent(cont);
		
		GuestBookDAOImpl gdao = new GuestBookDAOImpl();
		
		int result = gdao.insertGuestBook(g);//방명록 저장 성공후 1을 반환
		
		if(result == 1) {
			out.println("<script>");
			out.println("alert('서블릿 MVC 방명록 저장에 성공했습니다!');");
			out.println("location='guest_list';");//자바스크립트  location객체에 의해서 방명록 목록보기인 guest_list매핑주소로 이동
			out.println("</script>");
		}//if
	}
	
	
}
