/* 
 * 인터페이스 특징)
 *  1. 인터페이스는 하나 이상의 부모 인터페이스로 부터 다중상속을 받을 수 있다.
 *  2. 자손 클래스에서 부모 인터페이스를 implements 키워드로 구현 상속한다.
 *  
 */

interface IHello03{
	void hello(String name);// public abstract 가 생략된 추상메서드
}

interface IGoodBye03{
	void bye(String name);
}

class SubClass03 implements IHello03, IGoodBye03{

	@Override
	public void bye(String name) {
		System.out.println(name + "씨 잘가세요!");
	}

	@Override
	public void hello(String name) {
		System.out.println(name + "씨 안녕하세요!");
	}
	
}//자손클래스 SubClass03

public class InterEx03 {

	public static void main(String[] args) {
		SubClass03 sub = new SubClass03();
		sub.hello("홍길동");
		sub.bye("이순신");
	}

}
