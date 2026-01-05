/*
 * 생성자 오버로딩에 관한 예제
 */

class Car12{
	String color; // 차 색상 | 멤버변수(속성) 중 인스턴스 변수
	String gearType; // 변속기 종류 | 멤버변수(속성) 중 인스턴스 변수
	int door; //차문 개수 | 멤버변수(속성) 중 인스턴스 변수
	
	/*
	 * 클래스 소속의 멤버변수를 명시적 코드로 초기화를 하지 않으면 자바는 다음과 같은 기본값으로 초기화를 한다.
	 * 참조 즉 레퍼런트 타입 : null, boolean 타입 : false
	 * byte,short,int : 0, long : 0L, float : 0.0f, double : 0.0 또는 0.0d
	 */
	
	Car12(){ // 매개변수가 없는 기본생성자
		this("white", "auto", 4);//같은 클래스내의 매개변수 3개짜리 오버로딩 된 다른 생성자를 호출
	}
	
	Car12(Car12 c){// 생성자를 이용한 객체 복사
		color = c.color;
		gearType = c.gearType;
		door = c.door;// 값만 복사
	}// 생성자 오버로딩
	
	Car12(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	void pr() {
		System.out.printf("차색상 : %s, 변속기 종류 : %s, 차문 개수 : %d \n" , color, gearType, door);
		//%s는 문자열 출력형태 지시자, %d는 십진수 정수형태 지시자
	}
	
}// Car12 class
public class ClassEx12 {

	public static void main(String[] args) {
		Car12 car01 = new Car12(); // car01참조변수 | new Car12(); 객체 생성
		car01.pr();
		
		Car12 car02 = new Car12(car01);// 생성자 인자값으로 car01객체 전달
		
		car01.door = 6;//car01객체에만 차문 개수 6으로 변경
		car01.pr();//차문 개수가 4에서 6으로 변경 출력
		car02.pr();//car01과 car02는 서로 다른 객체주소를 가진다. 그러므로 값도 다른값을 가진다.
	}

}
