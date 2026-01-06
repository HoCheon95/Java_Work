/*
 * 클래스와 클래스 간 직접연결하는 방식 -> 자바 프로젝트나 스프링 프로젝트 개발에서 별로 권하고 싶지 않은 방식
 */
class A07{
	public void methodA(B07 b) {// B07 b = new B07()
		b.methodB();
	}
}

class B07{
	public void methodB() {
		System.out.println("methodB() 호출 ~");
	}
}
public class InterEx07 {

	public static void main(String[] args) {
		
		A07 a = new A07();
		a.methodA(new B07());

	}

}
