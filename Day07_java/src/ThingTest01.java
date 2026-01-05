/*
 * 11장. 클래스와 객체.pdf No.13쪽 1번 문제)
 * 다음은 하나의 속성(변수 x)을 갖는 Thing 클래스입니다. 다음 예제에서 문제점을 발견하고 이를 수정해 봅시다.
 * 가장 올바른 OOP코드로 변경해야 합니다.
 */

class Thing02 {
	
	private int x;	// private 외부 접근 불가
	
	public void setX(int new_x) {	// 메서드 | int new_x 매개변수
		x = new_x;
		/*
		 * set + 속성명(맴버변수명) 첫 글자는 관례적으로 영문대문자
		 * setter()메서드
		 */
	} // 값 저장 메서드 -> setter() 메서드 정의
	
	public int getX() {		// 메서드		
		return x;
	}// 값 저장 메서드 -> getter() 메서드 정의
}

public class ThingTest01 {

	public static void main(String[] args) {
		Thing02 thing1;	// 객체주소가 저장안된 참조변수
		thing1 = new Thing02();	// 객제추소가 저장된 참조변수 (객체)
		thing1.setX(10);
		System.out.println(thing1.getX());
	}

}
