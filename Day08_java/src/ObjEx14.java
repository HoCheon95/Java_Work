/**
 * 매개변수가 int[] arr이면 이것은 배열이라서 참조타입에 해댱된다. 주소값을 공유해서 배열원소값도 공유할 수 있다.
 */
public class ObjEx14 {

	static void change(int[] arr) {// int[] arr 배열 참조타입 매개변수
		arr[0] = 1000; // 첫번째 배열원소값을 100에서 1000으로 변경
		System.out.println("change() 메서드의 arr[0] = " + arr[0]); // 1000
	}

	public static void main(String[] args) {
		int[] x = { 100 }; // 첫번째 배열원소값을 100으로 저장
		System.out.println("main() 메서드의 x[0] = " + x[0]); // 100
		
		change(x); // 배열주소를 공유
		System.out.println("change() 메서드 호출 후 x[0] = " + x[0]); // 1000
	}

}
