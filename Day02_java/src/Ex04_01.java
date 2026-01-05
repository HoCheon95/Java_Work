/*
 * 04장.연산자.pdf No.22 쪽 1번 문제 -> 삼항 조건연산자를 사용한다.
 */
public class Ex04_01 {

	public static void main(String[] args) {
		
		int num01 = 7, num02 = 8;
		String result = "";
		
		result = (num01 % 2 == 0)? "짝수이다." : "홀수이다.";
		System.out.printf("%d은 %s\n",num01, result);
		
		result = (num02 % 2 == 0)? "짝수이다." : "홀수이다.";
		System.out.printf("%d은 %s\n",num02, result);

	}

}
