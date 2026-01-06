/*
 * class 자손클래스 extends 부모클래스 implements 부모인터페이스{
 * 
 * }
 * 부모클래스와 부모 인터페이스를 자손클래스에서 동시 상속받는 법)
 */

interface IHello04{
	public void sayHello(String name);//추상메서드 정의 -> abstract 키워드 생략함
}

abstract class GoodBye04{
	public abstract void goodBye(String name);// 추상 클래스에서는 인터페이스와는 다르게 추상메서드를 정의할 때
	// abstract 키워드 생략 불가
}

class SubClass04 extends GoodBye04 implements IHello04{

	@Override
	public void sayHello(String name) {
		System.out.println(name + "씨 안녕!");
	}

	@Override
	public void goodBye(String name) {
		System.out.println(name + "씨 잘가!");
	}
	
}// 자손클래스 SubClass04
public class InterEx04 {

	public static void main(String[] args) {
		
		SubClass04 sub = new SubClass04();
		sub.sayHello("을지문덕");
		sub.goodBye("강감찬");

	}

}
