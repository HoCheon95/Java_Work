/*
 * 1. Object 최고조상 부모클래스의 내장 메서드중에서 문자열 값을 반환해 주는 toString() 메서드를 오버라이딩 해 본다.
 * 
 * java.lang은 기본 패키지 경로이다. 코드상에서 생략해도 된다.
 */

class Point02 extends Object{//extends Object 생략가능
	int x, y;//2개의 클래스 소속 멤버변수 중 인스턴스 변수(속성) 선언
	
	public Point02() {}//매개변수가 없는 기본생성자
	
	public Point02(int x, int y) {
		this.x = x;
		this.y = y;
	}//매개변수 타입을 다르게 한 생성자 오버로딩

	@Override
	public String toString() {
		return "(x좌표값 = " + x + ", y좌표값 = " + y + ")";
	}
	
	
}
public class AutoEx02 {

	public static void main(String[] args) {
		
		Point02 pt02 = new Point02(100,200);//매개변수 2개짜리 오버로딩 된 생성자 호출
		System.out.println(pt02.toString());
		System.out.println(pt02);//to.String()이 생략됨
	}

}
