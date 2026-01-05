/*
 * 16장.상속.pdf No.32쪽 9번문제)
 * 문제와 소스는 강의교안을 참조하고 소스에서 자바 OOP(객체지향 프로그래밍) 언어코드에서 조금 미흡한 부분이 있다.
 * 이 부분을 좀더 나은 OOP 코드로 변경해 본다.
 */

class A2 extends Object {

	@Override
	public String toString() {
		return "4";
	}
}

class B2 extends A2 {

	@Override
	public String toString() {
		return super.toString() + "3"; // "43" 반환

	}
}

public class Ex16_10 {

	public static void main(String[] args) {

		System.out.println(new B2());// .toString()이 생략됨.
		System.out.println(new B2().toString());

		B2 b = new B2();
		System.out.println(b); // .toString()이 생략됨. B2에 오버라이딩 된 메서드를 호출. "43"
		System.out.println(b.toString());
	}

}