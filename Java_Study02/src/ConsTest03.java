/*
 * 레퍼런스 간의 형변환 중 업캐스팅 특징)
 * 	1. 업캐스팅을 할려면 사전에 상속관계를 만들어야 한다.
 * 	2. 업캐스팅이란 자손타입이 부모타입으로 올라가는 것을 말한다. 업캐스팅은 자동형 변환을 해준다.
 * 
 * 레퍼런스간의 형변환 중 다운캐스팅 특징)
 * 	1. 다운캐스팅을 할려면 사전에 상속관계를 만들어야 한다.
 * 	2. 다운캐스팅이란 부모타입을 자손타입으로 내리는 것을 말한다.
 * 	3. 다운캐스팅을 할려면 사전에 업캐스팅을 해야 한다.
 * 	4. 다운캐스팅은 자동형 변환을 해주지 않기 때문에 캐스팅 연산자를 사용해서 명시적인 다운캐스팅을 해야 한다.
 */

class Parent03{
	
	public void p03() { 
		System.out.println("부모클래스에서 정의된 메서드p03()");
	}
	
	
}


class Child03 extends Parent03{
	
	
	public void ch03() { 
		System.out.println("자손클래스에서 정의된 메서드 ch03()");
	}

	@Override
	public void p03() {
		super.p03();//부모클래스 메서드 호출
		System.out.println("오버라이딩 된 메서드 p03()");
	}
}
public class ConsTest03 {

	public static void main(String[] args) {
		Object obj = new Child03();//업캐스팅
		Child03 ch03 = (Child03)obj;//캐스팅 연산자를 사용해서 명시적인 다운캐스팅
		ch03.ch03();//자손에서 정의한 메서드호출
		ch03.p03();//오버라이딩 한 메서드 호출
		
		Parent03 p03;//부모타입으로 참조변수 선언
		p03 = new Child03();//업캐스팅
		p03.p03();//업캐스팅 이후 오버라이딩 한 메서드 호출
		
		/*
		 * 메서드가 오버라이딩이 된 경우 p03참조변수가 실제 가리키는 객체타입(Child03)에 의해서 호출되는 메서드가 결정된다.
		 */
		
	}

}
