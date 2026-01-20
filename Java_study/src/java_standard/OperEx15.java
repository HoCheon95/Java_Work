package java_standard;

public class OperEx15 {

	public static void main(String[] args) {
		
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase - 32);	// 대문자와 소문자 간의 코드값 차이는 10진수로 32이다.
		System.out.println(upperCase);	// A

	}

}
