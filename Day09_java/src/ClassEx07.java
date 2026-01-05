/* this 키워드를 사용하는 이유)
 *  1. 메서드(생성자) {} 중괄호 블록내에서 클래스 소속의 멤버 변수 중 인스턴스 변수와 생성자나 메서드 소속의 매개 변수명이 
 *  같을 때 자바는 어느것이 인스턴스 변수인지 매개 변수인지 구분을 못해서 값이 저장 안된다. 이러한 문제점을 해결하기
 *  위해서 왼쪽의 인스턴스 변수명 앞에 this. 을 붙임으로서 클래스 소속의 인스턴스 변수라는 것을 알려주면 구분이
 *  되어 져서 값이 저장된다.
 * 
 *  2. 여기서는 this.을 인스턴스 변수명 앞에 붙이지 않아서 값이 저장 안되는 경우에 대해서 알아 본다.
 */

class MyDate07{
	private int year;
	private int month;
	private int date; //멤버 변수 중 인스턴스 변수(속성) 3개 정의
	
	public MyDate07() {} // 기본 생성자
	
	public MyDate07(int year, int month, int date) {
		year = year;
		this.month = month;
		this.date = date;
	}// 생성자 오버로딩
	
	public void pr() {
		System.out.println(year + "년 " + month + "월 " + date + "일");
	}
}
public class ClassEx07 {

	public static void main(String[] args) {
		
		MyDate07 md = new MyDate07(2025,12,23);
		md.pr(); //0년 12월 23일

	}

}
