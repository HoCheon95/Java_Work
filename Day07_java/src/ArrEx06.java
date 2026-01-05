/*
 * 클래스와 객체 지향에 관한 소스 => 객체지향 프로그래밍(OOP:Object-Oriented Programming)
 */

class Animal06{// class 키워드로 Animal06 클래스 정의
	String name;
	int age; // 클래스 소속의 멤버변수(속성) name, age정의. 멤버변수 중 객체 생성해서 접근하는 인스턴스 변수이다.
	
}// Animal06 class

class Thing{// Thing 클래스 정의
	int x;	// 클래스 소속의 멤버변수 
}// Thing class

public class ArrEx06 {

	public static void main(String[] args) {
		
		Animal06 a; 		// 레퍼런스 변수 선언
		a = new Animal06(); // 객체 생성 | new 키워드로 새로운 객체명을 생성하면 비로소 a참조변수에는 객체주소가 저장되어서 객체
						    // 주소가 저장된 참조변수가 된다. 이 a를 객체명이라고도 한다.
		
		a.name = "홍길동"; 	// 객체 멤버 접근 | 객체명.속성으로 접근
		a.age = 20;
		
		System.out.println("이름 : " + a.name + ", 나이 : " + a.age);
		
		System.out.println("\n ===================================== \n");
		
		/*
		 * 문제1) 11장. 클래스와 객체.pdf No.10쪽 1번문제
		 * b 객체를 하나 더 생성해서 b로 접근하도록 하고 이름은 "펭귄", 나이는 12를 저장한 후 출력해 본다.
		 */
		
		// Animal06 b = new Animal06(); 한 줄로 선언해도 됨
		Animal06 b; 		// 레퍼럴스 변수 선언
		b = new Animal06(); // 객체 생성
		b.name = "펭귄";		// 객체 멤버 접근
		b.age = 12;			// 객체 멤버 접근
		
		System.out.println("이름 : " + b.name + ", 나이 : " + b.age);
		
		System.out.println("\n ===================================== \n");
		
		/*
		 * 문제2) 11장. 클래스와 객체.pdf No.10쪽 2번문제
		 * 하나의 속성(int형 x)을 갖는  Thing 클래스를 설계한 후, 객체 thing을 생성해서 멤버변수 x에 값 10을 저장
		 * 해서 출력해 본다.
		 */
		
		Thing thing = new Thing();	// 객체 thing 생성
		thing.x = 10;	// 객체 멤버 변수 x접근 10 저장
		
		System.out.println(thing.x);
		
	}// main
}
