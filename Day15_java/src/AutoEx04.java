/*
 * Object 내장 메서드 중 하나인 equals()를 자손에서 오버라이딩을 한 경우)
 */

class Point04 extends Object{	// Point04 클래스 / extends Object 생략 가능
	int a,b;	// 멤버변수 중 인스턴스변수(속성)
	
	public Point04() {} // 기본 생성자 | 매개변수가 없는 기본 생성자
	
	public Point04(int a, int b) {
		this.a = a;	// 좌측멤버변수와 우측매개변수명이 같을 때 멤버변수 앞에 내 자신 인스턴스 가리키는 참조변수 this.을 붙인다.
		this.b = b;
	}// 생성자 오버로딩

	@Override// Object 클래스의 equals() 메서드를 재정의(오버라이딩) 
	public boolean equals(Object obj) {// Object 는 모든 클래스의 최상위 부모 타입
		
		Point04 pt = null;//지역변수
		
		if(obj instanceof Point04) {// 다운캐스팅이 가능한가?
			pt = (Point04)obj;//명시적인 다운캐스팅
		}
		
		if((a == pt.a) && (b == pt.b)) {// a,b 값만 비교한다.
			return true;
		}else {
			return false;
		}// if else 
	
	}//equals()
	
	
}
public class AutoEx04 {

	public static void main(String[] args) {
		
		Point04 pt01 = new Point04(100,200);// 매개변수 2개짜리 오버로딩 된 생성자를 호출
		Point04 pt02 = new Point04(100,200);// pt01, pt02각 객체주소는 다르다.
		
		if(pt01 == pt02) {//참조타입을 ==로 비교하면 객체주소를 비교한다.
			System.out.println("같다.");
		}else {
			System.out.println("다르다");// 객체주소는 서로 다르므로 else
		}
		
		if(pt01.equals(pt02)) {//값만 비교
			System.out.println("값이 같다.");// 값만 비교하므로 if 조건 성립
		}else {
			System.out.println("값이 다르다.");
		}

	}

}
