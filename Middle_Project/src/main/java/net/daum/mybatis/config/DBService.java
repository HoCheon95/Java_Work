package net.daum.mybatis.config;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBService {

	/*   SqlSession은 DB에 SQL문을 실행하기 위해 필요한 모든 메소드를 가지고 있다.
	 *   SqlSession은 JDBC에서 개발자가 직접 Connection을 생성하고 PreparedStatement를
	 *   이용해서 SQL을 실행하던 모든 작업을 내부적으로 자동으로 처리해 준다. 
	 *   SqlSession 인스턴스를 만들기 위해서는 SqlSessionFactory가 필요하다.  
	 */
	
	//정적 필드
	private static SqlSessionFactory factory = null;

	//정적 초기화 변수 (클래스가 로드될때 자동으로 실행되는 코드라고 보면 됨)	
	static {
		try {
			// 클래스 패스에서 위치한 sqlmap (마이바티스 설정 관련 xml)을 읽어오기 위한 경로를 설정
			String resource = "net/daum/mybatis/config/sqlmap.xml";			;			
			// 설정된 경로의 파일을 읽어들어와 is 입력스트림에 저장
			InputStream is = Resources.getResourceAsStream(resource);
			// 마이바티스의 세션 팩토리를 생성한 뒤 factory 필드에 할당
			factory = new SqlSessionFactoryBuilder().build(is);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//정적 초기화 블록

	//getFactory() 메서드를 호출하면 정적 팩토리 반환 
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
