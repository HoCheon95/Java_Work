/*
 * 자바 5(jdk) 버전에서 추가된 가변인자(Varargs) 문법)
 *  매개변수 개수가 다른 메서드가 오버로딩 되면 그 개수만큼 메서드를 정의해야 한다. 그만큼 코드라인이 길어진다.
 *  이 부분을 해결하기 위해서 자바 5에서 가변인자 문법이 추가되었다.
 *  형식은 메서드명(타입...매개변수) 형태로 하면서 배열로 처리된다.
 */

class Mt04 {
	void pr(int... arr) { // int ... arr이 가변인자이다. arr은 배열로 처리된다.
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println(); // 줄바꿈
	}// pr()
}// Mt04 class

public class ObjEx04 {

	public static void main(String[] args) {

		Mt04 mt = new Mt04();
		mt.pr(100);
		mt.pr(100, 200);
		mt.pr(100, 20, 30, 50, 60);
	}

}
