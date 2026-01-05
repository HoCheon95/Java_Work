/*
 * 열거 타입을 사용한 소스 예) 
 */

import java.util.Calendar;

public class ArrEx02 {

	public static void main(String[] args) {

		Week today = null; // Week 열거타입으로 참조 레퍼런스 타입이어서 today라는 참조변수 선언 null로 초기화

		/*
		 * 자바에서 null이란 "아무 객체도 참조하지 않음"
		 */

		Calendar cal = Calendar.getInstance();
		/* Calendar 는 내장 api로 년월일 시분초 값을 반환한다. */

		int week = cal.get(Calendar.DAY_OF_WEEK);
		/*
		 * 일요일은 1,..., 토요일은 7까지 정수숫자 반환. 오늘이 목요일 이니 5를 반환
		 */
		System.out.println("반환된 week 값 : " + week);

		switch (week) {
		case 1: today = Week.SUNDAY;break; // 열거타입변수 today에 열거상수 저장. 열거타입이름. 열거상수
		case 2: today = Week.MONDAY;break;
		case 3: today = Week.TUESDAY;break;
		case 4: today = Week.WEDNESADY;break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}// switch~case
		
		System.out.println("오늘 요일은 " + today);

		if (today == Week.SUNDAY) {// today가 특정열거상수 인지 비교할 떄는 ==(같다 비교연산), !=(같지 않다 비교연산)을 사용한다.
			System.out.println("일요일때는 축구를 합니다.");
		} else {
			System.out.println("자바 열공을 합니다.");
		} // if else
	}
}
