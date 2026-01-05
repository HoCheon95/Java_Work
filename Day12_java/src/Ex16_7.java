/*
 * 16장.상속.pdf No.29쪽 6번문제)
 * 문제와 자바소스는 강의교안을 참조하고 이 소스의 실행 결과를 주석문으로 처리해 보자.
 */
class Base{//extends Object 생략
	Base(){
		super();//생략가능함. 최상위 부모클래스 Object의 기본생성자를 호출하면서 끝이 남.
		System.out.print("Base");
	}// 기본 생성자
}// 부모클래스 Base 

class Alpha extends Base{
	//기본생성자 묵시적 생략됨
}// 자손클래스 Alpha
public class Ex16_7 {

	public static void main(String[] args) {
		new Alpha(); // Base
		new Base();  // Base
		/*
		 * 답안) BaseBase
		 * 생성자는 상속되지 않는다.
		 * 자손클래스에서 new Alpha();에 의해서 생성자를 호출하면 자바는 먼저 
		 * 부모클래스 기본생성자를 먼저 호출하도록 설계 되어져 있다.
		 */
	}

}
