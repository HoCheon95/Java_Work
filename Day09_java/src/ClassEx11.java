/*
 * this()에 의해서 같은 클래스내에서 오버로딩 된 다른 생성자를 호출해 본다.
 */

class Car11{
	String color; //차 색상 | 멤버변수(속성) 중 인스턴스 변수
	String gearType; //변속기 종류 : auto(자동), 수동 | 멤버변수(속성) 중 인스턴스 변수
	int door; //문의 개수 | 멤버변수(속성) 중 인스턴스 변수
	
	Car11(){
		this("white", "auto", 4); //같은 클래스내에서 매개변수 3개짜리 오버로딩 된 생성자를 호출
	}
	
	Car11(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}// 매개변수 개수가 다른 생성자 오버로딩
	
	void print() {
		System.out.println("차색상 : " + color + ", 변속기 종류 : " + gearType + ", 차문 개수 : " + door);
	}
}//Car11 class
public class ClassEx11 {

	public static void main(String[] args) {
		
		Car11 car = new Car11();
		car.print();

	}

}
