/*
 * 오버로딩 된 메서드 구분요건 기준은 매개변수이다.
 * 매서드명 앞의 리턴타입을 다르게 한 메서드 오버로딩은 허용하지 않는다.
 */

class Mt03{
	void print(int a) {
		System.out.println(a);
	}
	
	int print(int a) { // print() 메서드 앞의 리턴타입을 다르게 한 오버로딩은 안된다.
		return a;
	}
}

public class ObjEx03 {

	public static void main(String[] args) {

	}

}
