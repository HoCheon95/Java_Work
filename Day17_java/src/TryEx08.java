/*
 * for 반복문안에서 try~catch 문 처리
 */
public class TryEx08 {

	public static void main(String[] args) {
		
		int number = 100;
		int result = 0;
		
		for(int i=1; i<=10; i++) {
			try {
				result = number / (int)(Math.random() * 10);
				/*
				 * random() 정적메서드는 0.0이상 1.0미만 사이의 실수숫자 난수 발생 -> *10하면 0.0이상
				 * 10.0미만 사이 실수숫자 난수 -> (int)로 캐스팅 형변환하면 소수점이하는 버리고 정수난수만
				 * 구해서 0이상 10미만 즉 0부터 9사이 정수숫자 난수를 구함.
				 */
				System.out.println("result = " + result);
			}catch(ArithmeticException ae) {
				System.out.println("0"); //정수숫자 난수가 0일떄 예외 에러가 발생해서 출력
				
			}			
		}//for

	}

}
