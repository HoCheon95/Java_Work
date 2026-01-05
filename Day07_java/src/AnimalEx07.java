/*
 * Animal07 클래스를 설계할 때 클래스 소속 멤버변수인 속성을 private으로 정의하면 외부 클래스에서 접근 못한다.
 * 이런 경우 어떻게 처리하는 지에 대해서 알아보는 소스이다.
 */

class Animal07{
	String name;
	private int age; // age 멤버변수(속성)를 private으로 정의하면 Animal07 클래스 외부에서 접근 못 한다. 이것이 곧 자바의 데이터 보안성이다.
				  	 // 이런 경우 값을 저장할 때는 setter()메서드를 호출해서 사용하고, 값을 반환할 때는 getter() 메서드를 호출해서 사용한다.
	
	public void setAge(int new_age) {// int new_age 에서 new_age는 매개변수명이다.
		/*
		 * set+속성명(멤버변수명으로 가고 첫 글자는 관례적으로 영문대문자로 한다.)
		 * -> 값 저장 메서드이다. 통칭해서 setter()메서드라고 한다.
		 */
		age = new_age;
		
	}
	public int getAge() {// get+속성명(멤버변수명으로 가고 첫글자는 관례적으로 영문대문자로 간다 -> 값 반환 메서드이다.
						 // 통칭해서 getter() 메서드라고 한다.
		return age;	// return에 의해서 메서드 호출한 곳으로 나이를 반환한다(되돌려 준다).
	}
	
}// Animal07 class

public class AnimalEx07 {

	public static void main(String[] args) {
		
		Animal07 a; // 객체주소가 저장안된 참조변수(레퍼런스 변수)
		a = new Animal07(); // 객체주소가 저장된 참조변수 a(객체명)
		
		a.name = "이순신";
		// a.age = 20; // age멤버변수는 private으로 정의했기 때문에 외부클래스에서 접근 못함
		a.setAge(20);
		
		System.out.println("이름 : " + a.name + ", 나이 : " + a.getAge());

	}

}
