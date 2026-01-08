/*
 * java.util 패키지에 있는 내장 api 클래스 중에서 StringTokenizer 는 특수문자를 기준으로 문자열을 분리한다.
 * 분리된 문자를 토큰이라고 한다. 주로 회원관리 프로그램에서 정보수정창에서 많이 사용한다.
 * 이 기능과 비슷한 역할을 하는 내장메서드는 String 문자열 클래스 하위의 split()메서드가 있다.
 * 
 * StringTokenizer는 한 방향으로만 순차적으로 토큰문자를 소비하기 때문에 한 번 nextToken()으로 꺼낸 문자는 다시 
 * 접근을 할 수 없다. 다시 사용하고자 한다면 StringTokenizer 객체를 새로 생성해야 한다.
 */

import java.util.StringTokenizer;

public class AutoEx05 {

	public static void main(String[] args) {
		
		StringTokenizer phone = new StringTokenizer("010-7777-9999", "-");
		// -를 기준으로 펀번호를 분리한다.
		
		String phone01 = phone.nextToken();//첫 번째로 분리된 폰번호 저장
		String phone02 = phone.nextToken();//두 번쨰로 분리된 폰번호 저장
		String phone03 = phone.nextToken();//세 번째로 분리된 폰번호 저장
		
		System.out.printf("첫 번째로 분리된 폰번호 : %s \n", phone01);
		System.out.printf("두 번째로 분리된 폰번호 : %s \n", phone02);
		System.out.printf("세 번째로 분리된 폰번호 : %s \n", phone03);
		
		System.out.println("\n =========================== \n");
		
		String phoneNumber = "010-8888-9999";
		StringTokenizer ph02 = new StringTokenizer(phoneNumber,"-");
		
		while(ph02.hasMoreTokens()) {//분리된 다음 토큰이 있다면 참
			System.out.println(ph02.nextToken());//nextToken()내장메서드는 분리된 다음 토큰문자를 가져온다.
		}//while end
		
	}

}
