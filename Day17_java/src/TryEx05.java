/*
 * 배열주소 인덱스 번호 범위를 벗어나면 ArrayIndexOutOfBoundsException 예외오류를 발생시킨다.
 */
public class TryEx05 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30 };// 배열크기가 3인 arr 배열원소값 초기화 -> 첫번째 배열주소 인덱스 번호는
		// 0 부터 시작해서 마지막 주소 인덱스 번호는 2이다.

		try {
			System.out.println("Test - 1");
			arr[3] = 40;// 배열주소 인덱스 번호 범위를 벗어나서 예외가 발생함 -> 아래문장 수행 안하고
			// 해당 catch 블록문으로 이동해서 예외를 처리
			System.out.println("Test - 2");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
