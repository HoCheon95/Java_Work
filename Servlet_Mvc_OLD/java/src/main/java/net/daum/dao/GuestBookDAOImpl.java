package net.daum.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import net.daum.dto.GuestDTO;

public class GuestBookDAOImpl {//DBCP 커넥션 풀 관리에 의한 데이터베이스 연결
	
	Connection con = null; //DB연결 con
	PreparedStatement pt = null; //쿼리문 수행 pt
	ResultSet rs = null;//select 검색쿼리문 수행후 결과 레코드를 저장할 rs
	DataSource ds = null;//커넥션 풀 관리 ds
	String sql = null;//쿼리문 저장 변수
	
	public GuestBookDAOImpl() {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/xe");
			//JNDI 디렉토리 서비스를 활용해서 server.xml 에 설정한 xe데이터 베이스를 찾아서 커넥션 풀 관리 ds를 생성
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//기본 생성자
	
	//서블릿 MVC 방명록 저장
	public int insertGuestBook(GuestDTO g) {
		int re = -1;//저장 실패시 반환값
		
		try {
			con = ds.getConnection();//커넥션 풀관리 ds로 con생성
			sql = "insert into guestbook values(gno8_seq.nextval,?,?,?,sysdate)";
			//sysdate는 오라클 날짜함수
			pt = con.prepareStatement(sql);//쿼리문을 미리 컴파일하여 수행할 pt생성
			pt.setString(1, g.getGname());//쿼리문의 첫번째 물음표에 문자열로 글쓴이 저장
			pt.setString(2, g.getGtitle());
			pt.setString(3, g.getGcontent());
			
			re = pt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pt != null) pt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return re;
	}//insertGuestBook()

	public List<GuestDTO> getGuestList() {
		List<GuestDTO> glist = new ArrayList<>();
		
		try {
			con = ds.getConnection();
			sql = "select * from guestbook order by gno desc";//번호를 기준으로 내림차순 정렬한다.
			//-> 큰 숫자번호가 먼저 정렬
			pt = con.prepareStatement(sql);
			rs = pt.executeQuery();//검색 쿼리문 수행후 결과 레코드를 rs에 저장
			while(rs.next()) {//복수개의 레코드가 검색될 때는 while반복문으로 처리한다. next()메서드는 다음 검색된 레코드가 존재하면 참
				GuestDTO g = new GuestDTO();
				g.setGno(rs.getInt("gno"));
				//setter()메서드에 저장
				g.setGname(rs.getString("gname"));//gname컬럼으로 부터 문자열로 글쓴이 레코드를 가져와서 setter() 메서드에 저장
				g.setGtitle(rs.getString("gtitle"));
				g.setGdate(rs.getString("gdate"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pt != null) pt.close();
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return glist;
	}

}
