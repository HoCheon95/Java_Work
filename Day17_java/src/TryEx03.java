/*
 * try ~ catch 문에서 예외가 발생하든 발생하지 않든 무조건 마지막에 실행해야 하는 문장을 넣을 때는
 * finally{ } 블록문에 기술한다.
 */
public class TryEx03 {

	public static void main(String[] args) {

		int a = 10, b01 = 0, b02 = 2, result = 0;

		try {
			result = a / b02;
			System.out.println("[1] result = " + result);

			result = a / b01;// 예외발생 -> 아래 문장 수행안하고 해당 catch{} 블록문으로 이동
			System.out.println("[2] result = " + result);// 이 문장 수행안함.
		} catch (ArithmeticException ae) {
			ae.printStackTrace();// 예외족적을 남김
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e);
		} finally {
			System.out.println("예외가 발생하든 발생하지 않든 무조건 마지막에 실행");
		}

	}

}
