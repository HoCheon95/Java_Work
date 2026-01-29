package net.daum.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 웹브라우저에서 실행되는 주소가 곧 매핑주소이다. 매핑주소인 /servlet_begin 등록
 */
@WebServlet("/servlet_begin")
public class FirstServletController extends HttpServlet {
	
	/**
	 * 1. 서블릿 컨트롤러 클래스는 HttpServlet 클래스로 부터 상속받고, 온라인 웹상에서 누구나 다 접근 가능하게 public 접근권한 제어자로 선언한다.
	 * 2. get으로 접근할 때는 doGet()메서드를 오버라이딩 해서 호출한다.
	 * 3. get방식으로 인식되는 경우 예
	 * 		가. 웹브라이저 주소창에서 직접 실행하거나 직접 입력해서 실행하는 경우
	 * 		나. 폼태그에서 method속성을 생략하거나 method="get"인 경우
	 * 		다. 자바스크립트에서 location 객체에 의해서 이동하거나 jsp 또는 서블릿 자바의 response.sendRedirect()에 의해서 이동하는 경우
	 * 		라. 하이퍼링크로 이동하는 경우 -> <a href="test?id=abc"></a> 처럼 test 매핑주소 뒤에 ?를 붙여 id 네임피라미터 이름에
	 * 			문자데이터 abc를 담아서 get방식으로 전달한다. 이런 방식을 쿼리스트링 방식이라고 한다. 주소창에 자료가 노출되어서 보안상 좋지 않다.
	 * 4. HttpServletRequest 서블릿은 사용자 폼에서 입력한 정보를 서버로 가져올 때 사용한다.
	 * 5. HttpServletResponse 서블릿은 서버의 가공된 정보를 사용자 웹브라우저에 응답할 때 사용한다.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");//웹브라우저에 응답하는 문자와 태그, 언어코딩타입을 설정
		PrintWriter out = response.getWriter();//출력스트림 객체 out 생성
		out.println("<h2>최초 서블릿을 get 방식으로 실행</h2>");
		out.close();
	}

}
