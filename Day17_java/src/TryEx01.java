/*
 * try ~ catch 문으로 예외 처리)
 * try{
 *  정상구문이 실행되다가 예외가 발생하면 아래 문장을 수행하지 않고 예외 처리 해당 catch 블록문으로
 *  이동해서 예외를 처리한다.
 *  ...
 * }catch(예외처리클래스 매개변수){
 *  예외처리 코드;
 * }
 * 
 * 
 * 자바는 정수숫자를 0으로 나누면 예외가 발생한다.
 * 
 */
public class TryEx01 {

	public static void main(String[] args) {

		int a = 10, b01 = 0, b02 = 2, result = 0;

		try {
			result = a / b02;
			System.out.printf("result = %d \n", result);
			
			result = a / b01;// 예외 에러 발생 -> 아래 문장 수행안하고 해당 
			                 // catch 블록문으로 제어 순서가 이동해서 예외를 처리한다.
			System.out.println("result = "+ result);
			
		} catch (Exception e) {// Exception 은 예외처리 부모클래스
			System.out.println("예외 발생 : " + e);// java.lang.ArithmeticException: /by zero
			// 예외 에러가 정수숫자를 0으로 나누면 발생하는 예외 에러이다.
		}
		
		System.out.println("try 구문 수행후 result = " + result);

	}

}
