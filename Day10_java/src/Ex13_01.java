/*
 * 13장.생성자.pdf No.19쪽 1번문제)
 * Animal 클래스에 생성자를 추가해 본다.(생성자 오버로딩)
 */

class Animal{
	String name;	// 멤버변수(속성) 중 인스턴스 변수
	int age;		// 멤버변수(속성) 중 인스턴스 변수
	
	Animal(){	// 매개변수가 없는 기본생성자
		
	}
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}// 생성자 오버로딩
	
	public void show() {
		System.out.println(name + "는(은)" + age + "살입니다.");
	}
	
	/** 교수님 문제 풀이
	 * 
	String name;
	int age; // 클래스 소속 멤버변수(중) 인스턴스 변수 2개 정의
	
	// 생성자가 오버로딩이 되면 매개변수가 없는 기본생성자는 더이상 묵시적 제공이 되지 않는다. 즉 생략불가
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}// 매개변수가 다른 생성자 오버로딩
	
	public void show() {
		System.out.println(name + "는(은)" + age + "살 입니다.");
	}// 사용자 정의 메서드
	*/
}
public class Ex13_01 {

	public static void main(String[] args) {
		
		Animal a1 = new Animal("원숭이", 26); // 오버로딩 된 생성자 호출
		a1.show();

	}

}
