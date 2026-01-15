package 내장함수형인터페이스람다식과스트림;

import java.util.function.Function;

/*
 * 생성자 참조를 위한 자바 소스 예) 
 */
public class ConstructorReferExample {

	public static void main(String[] args) {
		
		/*
		 * Function 내장 함수형 인터페이스 특징)
		 *  1. 인자값도 있고, 리턴값도 있다. 인자값을 리턴값으로 타입변환을 해준다.
		 */
		
		Function<Integer, Member2> fun01 = Member2 :: new;//생성자 참조
		//첫번째 제네릭 타입 Integer는 입력값 타입이고, 두번째 제네릭 타입 Member2는 반환타입이다.
		Member2 member01 = fun01.apply(7);
		/*
		 * 함수형 인터페이스의 apply(7) 추상메서드의 인자값 7과 동일한 타입 그리고 개수를 가진 Member2 내의 오버로딩 된 생성자를
		 * 호출한다.
		 */

	}

}
