/*
 * String 내장 문자열 클래스 하위의 메서드를 활용한 예제소스)
 */

public class ArrayEx13 {

	public static void main(String[] args) {

		String str = "Java";
		str = str + 21; // 문자열+숫자에서 자바는 문자열을 우선해서 숫자 21이 문자열 "21"로 변경된다.
						// 그래서 +는 문자열 연결하는 연산기능을 수행한다.
		System.out.printf("%s \n", str);

		String str01 = "ABCDE";
		char ch = str01.charAt(3); // charAt(3)메서드는 첫문자를 0부터 시작해서 4번째 단일문자 'D'를 구함
		System.out.println("구해진 단일문자 : \'" + ch + "\'");

		String str02 = "012345";
		String result = str02.substring(1, 4); // substring(1, 4)메서드는 첫문자를 0부터 시작해서 1이상 4미만 사이의 문자를 반환 => "123"
		System.out.println("result : " + result);
		System.out.println("\"012345\"의 문자길이 : " + str02.length()); // 6 | 1부터 카운트

		for (int i = 0; i < str01.length(); i++) {
			char ch02 = str01.charAt(i); // i번쨰 단일문자를 구함
			System.out.println("ch02.charAt(" + i + ") : " + ch02);
		}// for
		
		char[] chArr = str01.toCharArray(); // toCharArray() 내장메서드는 해당 문자열을 단일문자 char[] 배열로 반환
		// 배열로 반환
		System.out.println(chArr); // 단일문자 배열원소값 출력

	}

}
