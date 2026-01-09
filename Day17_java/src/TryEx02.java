/*
 * 하나의 try 문에 여러개의 catch 블록문이 ({}) 오는 경우)
 *  catch 블록문에는 예외 처리 자손클래스를 먼저 기술하고, 예외 처리 부모클래스는 나중에 기술한다.
 *  이유는 자바 런타임이 예외 발생시 catch 블록문을 위에서부터 아래로 순차적으로 검사하면서, 가장 구체적이고
 *  관련성 높은 예외 처리 블록문을 먼저 실행하기 때문이다.
 */
public class TryEx02 {

	public static void main(String[] args) {

		int a = 10, b01 = 0, b02 = 2, result = 0;

		try {
			result = a / b02;
			System.out.println("[1] result = " + result);

			result = a / b01;// 정수숫자를 0으로 나누면 예외발생 -> 실행순서가 예외처리 해당 catch 블록문으로 이동한다.
			System.out.println("[2] result = " + result);// 이 문장 수행안함.
		} catch (ArithmeticException ae) {// 보다 구체적인 예외처리 자손클래스가 먼저 나온다.
			System.out.println("예외 발생 : " + ae);
		} catch (Exception e) {// 예외처리 부모클래스는 나중에 기술
			e.printStackTrace();// 예외 족적을 남김
		}

	}

}
