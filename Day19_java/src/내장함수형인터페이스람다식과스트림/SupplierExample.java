package 내장함수형인터페이스람다식과스트림;

import java.util.function.IntSupplier;

/*
 * java.util.function 패키지의 Supplier 계열의 내장 함수형 인터페이스 특징)
 * 	1. 매개값(인자값)은 없고, 리턴(반환)값은 있다.
 */
public class SupplierExample {

	public static void main(String[] args) {
		
		IntSupplier intSupplier = () -> {
			
			/*
			 * 문제) Math.random() 정적메서드를 사용해서 1부터 6사이의 임의의 정수숫자 난수를 발생해
			 * 그 값을 리턴하여 임의의 주사위 눈의 수를 구하는 자바 프로그램 코드를 완성해 본다.
			 */
			
			int tmp = (int)(Math.random() * 6) + 1;
			/**
			 * random()은 0.0이상 1.0미만 사이의 실수숫자 난수발생 -> * 6 하면 0.0이상 6.0미만 사이의 실수숫자 난수
			 * -> (int)형변환하면 반올림 하지 않고 소수점이하는 버리고 0이상 6미만 사이의 정수숫자 난수구함 -> +1을 하면
			 * 1이상 7미만 즉 1부터 6사이의 임의의 정수숫자 난수를 구함.
			 */
			
			return tmp;
		};
		
		
		int resultNumber = intSupplier.getAsInt();//오버라이딩 된 메서드 호출
		System.out.println("임의의 주사위 눈의 수 : " + resultNumber);
	}

}
