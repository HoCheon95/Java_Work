/*
 * 문제) java.util 패키지의 스캐너를 활용해서 다음과 같이 "Daejeon" 영문 도시이름을 입력 받아서 맨 앞 첫 단일문자를 구한다음
 * 삼항조건연산자와 &&(논리곱연산자)등을 사용해서 구한 첫 영문단일문자가 영문대문자인지 소문자인지 판별하는 자바 프로그램을 만들어 본다.
 */

import java.util.Scanner;

public class ConvEx07{
	public static void main(String[] asge) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("영문 도시이름 : ");
		
		String city = scan.nextLine();
		char firstcityName = city.charAt(0);	// charAt(출력을 원하는 index 숫자 입력) 첫 글자만 읽어 옴
		
		// 첫 영문단일문자가 대문자 or 소문자 판별
		String result = (firstcityName >= 'A' && firstcityName <= 'Z')? "대문자 이다. " : "소문자 이다.";
		
		System.out.println("입력하신 영문도시 이름 \'" + firstcityName + "\' 에서 첫 단일문자 인 \'" + firstcityName + "\' 은(는) " + result);
		
		scan.close();
		
	}
}
