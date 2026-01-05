/*
 * 매개변수 개수가 다른 메서드가 오버로딩이 된 경우 기본타입 매개변수와 참조타입 배열 매개변수와의 차이점)
 * 
 */
public class ClassEx01 {
	void add(int a, int b, int[] result) {
		result[0] = a + b;
	}

	int add(int a, int b) {
		return a + b;
	}// 매개변수 개수가 다른 메서드 오버로딩이 된 경우

	public static void main(String[] args) {
		
		ClassEx01 cex = new ClassEx01();// cex객체 생성
		
		int result = cex.add(3, 5);
		System.out.printf("3 + 5 = %d \n", result);
		
		int[] arr = {0}; //첫번째 배열원소값으로 0 저장
		cex.add(3, 5, arr);// arr배열원소값이 0에서 8로 변경됨
		System.out.println("arr[0] = " + arr[0]);

	}

}
