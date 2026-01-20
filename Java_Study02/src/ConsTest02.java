/*
 * 클래스 상속문법 형식)
 *  class 자손클래스 extends 부모클래스{
 *  
 *  }
 *  
 *  extends 키워드로 하나의 부모로 부터 단일 상속만 가능하다.
 */

class Parent02{//extends Object 이 생략됨
	int a = 10;
	int b = 20;
	
	/*
	 * 생성자는 상속되지 않는다.
	 * 생성자가 오버로딩되면 자바 컴파일러는 더 이상 기본생성자 묵시적 제공을 하지 않는다.
	 */
	
	public Parent02(int a, int b) {
		//super(); 가 생략됨 -> 부모클래스 기본생성자를 먼저 호출한다.
		this.a =a;
		this.b =b;
	}//매개변수 개수가 다른 생성자 오버로딩
	
	public void pr() {}
}//부모클래스

class Child02 extends Parent02{
	int c = 30;
	
	public Child02(){		
		super(100, 200);//부모클래스 오버로딩 된 생성자를 호출
	}
	
	public Child02(int a, int b, int c) {
		super(a, b);
		this.c=c;
	}

	@Override
	public void pr() {
		System.out.println("a = "+ a + ",b = " + b + ", c = " + c);
	}
	
}
public class ConsTest02 {

	public static void main(String[] args) {
		
		Child02 ch02  = new Child02();
		ch02.pr();
		new Child02(1000, 2000, 3000).pr();
		
	}

}
