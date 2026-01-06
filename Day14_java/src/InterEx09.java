/*
 * 부모 인터페이스에 추가된 추상메서드는 반드시 이를 구현 상속한 자손클래스에서 오버라이딩을 해야 한다.
 * 그래야만 자손클래스 객체 생성이 가능하다. 하지만 이런 경우에는 자손에서 불필요한 부모의 추상메서드까지 무조건 오버라딩을
 * 해야하는 불편함이 존재한다. 이를 해결하기 위해서 자바 8버전에서 추가된 것이 디폴트 메서드이다.
 * 이 디폴트 메서드는 부모 인터페이스에 추가되어도 자손에서 반드시 오버라이딩을 하지 않아도 된다.
 * 필요하면 오버라이딩을 하고 불필요하면 오버라이딩을 하지 않아도 된다. 결국 자손에서 선택적 오버라이딩을 하면 된다.
 * 하지만 부모 인터페이스에 추가된 추상메서드는 꼭 자손에서 무조건 오버라이딩을 해야 한다.
 */

interface ParentInter09{
	void absMethod();//public abstract 가 생략된 추상메서드
	
	public default void defaultMethod() {//디폴트 메서드 정의 -> public 생략가능
		System.out.println("부모 인터페이스에 디폴트 메서드 정의");
	}
}

class ChildClass09 implements ParentInter09{

	@Override
	public void absMethod() {
		System.out.println("부모 인터페이스의 추상메서드가 오버라이딩 됨.");
	}

	@Override// 디폴트 메서드는 선택적 오버라이딩
	public void defaultMethod() {
		System.out.println("부모 인터페이스의 디폴트 메서드가 자손에서 선택적 오버라이딩 함.");
	}

	
}
public class InterEx09 {

	public static void main(String[] args) {
		
		ParentInter09 p09 = new ChildClass09();
		p09.absMethod();// 업캐스팅 이후 오버라이딩 한 메서드 호출
		p09.defaultMethod();

	}

}
