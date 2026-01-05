/*
 * 삼중 for 반복문
 */
public class CaseEx09 {
	public static void main(String[] args) {
		
		int i,j,k;
		for(i=1; i<=2; i++) {
			for(j=1; j<=2; j++) {
				for(k=1; k<=2; k++) {
					System.out.println("" + i + j + k);	//""+i 에서 자바는 문자를 우선해서 정수숫자 i변수값이 문자열로 치환된다.
														//그래서 덧셈연산을 하지 않고 문자를 서로 연결한다.
				}
			}
		}

	}//main
}
