/*
 * 예외가 발생했을 때 try ~ catch 블록문 실행순서 : 1 -> 2 -> 4 -> 5
 */
public class TryEx11 {

	public static void main(String[] args) {

		System.out.println(1);

		try {
			System.out.println(2);
			System.out.println(100 / 0);
			/*
			 * 자바언어에서 정수 숫자를 0으로 나누면 예외에러가 발생해서 
			 * 아래문장을 수행하지 않고 해당 catch 블록문으로 제어순서가
			 * 이동해서 예외를 처리한다.
			 * 
			 */			
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4);// 예외가 발생하면 실행
		}
		System.out.println(5);
	}

}
