/*
 * 매개변수 타입이 기본타입이면 값이 전달된다. 이것은 값에 의한 전달방식이다. 그러므로 객체주소를 공유하지 못한다.
 * 결국 메서드 호출 후 변경된 값도 공유하지 못한다.
 */

class Vm08 {
	void changeNum(int y) { // int y 매개변수 타입이 기본타입이다. 값만 전달된다.
		y = 2000;
	}
}

public class ObjEx08 {
	public static void main(String[] args) {

		Vm08 vm = new Vm08(); // 참조변수 vm | Vm08()객체 생성
		int x = 1000;
		System.out.println("changeNum() 메서드 호출전 : " + x); // 1000
		vm.changeNum(x);
		System.out.println("changeNum() 메서드 호출후 : " + x); // 1000

	} // main
} // class
