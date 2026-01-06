/*
 * 일반 클래스나 추상 클래스는 하나 이상의 부모 클래스로 부터 다중 상속을 받을 수 없다. 오직 하나의 부모로 부터 단일 상속만 가능하다.
 */

class Hello02{
	public void sayHello(String name) {
		System.out.println(name + "씨 반가워요!");
	}
}

abstract class GoodBye02{
	public abstract void bye(String name);//추상메서드 정의
}

class SubClass02 extends Hello02, GoodBye02{
	//클래스나 추상클래스는 오직 하나의 부모클래스로 부터 단일상속만 가능하다.
}
public class InterEx02 {

	public static void main(String[] args) {

	}

}
