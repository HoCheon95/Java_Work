/*
 * java 7버전에서 추가된 AutoCloseable 인터페이스를 구현 상속받는 자손클래스를 try() 내에서 객체를 생성 하면
 * 굳이 finally{} 블록문에서 close() 명시적 코드로 닫지 않아도 자동으로 닫힌다.
 */

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TryEx09 {
	
	

	public static void main(String[] args) throws Exception {
		
		List<String> cityList = new ArrayList<>();
		//문자열만 저장 가능한 컬렉션 제네릭 객체 cityList 생성
		
		
		cityList.add("seoul");
		cityList.add("busan");
		cityList.add("daejeon");
		
		/*
		 * 이클립스(STS)계열의 개발툴에서 기본경로로 인식하는 것은 프로젝트 경로이다. 여기서는 Day17_java 이다.
		 * ./는 현재경로를 뜻하는 상대경로이다. 결국 ./ 는 Day17_java 프로젝트 경로를 의미한다.
		 */		
		
		try(PrintWriter output = new PrintWriter("./src/reslut.txt")){
			/*
			 * PrintWriter 는 java.io 입출력 패키지에 있는 문자출력 스트림 API 이다. 이 클래스는
			 * AutoCloseable 인터페이스를 구현 상속받고 있다.
			 */
			
			for(String cityName:cityList) {
				output.println(cityName.toUpperCase());//생성된 reslut.txt에 영문대문자로 변경 해서 영문도시이름을 기록한다.
			}//for end -> 자바 5버전에서 추가된 향상된 확장 for 반복문
			
		}//try end
		
	}

}
