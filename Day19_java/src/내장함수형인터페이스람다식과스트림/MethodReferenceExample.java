package 내장함수형인터페이스람다식과스트림;

import java.util.function.IntBinaryOperator;

/*
 * IntBinaryOper 내장 함수형 인터페이스를 활용해서 람다식을 정적메서드 참조와 인스턴스 메서드
 * 참조로 변환하는 소스이다. 그만큼 코드라인이 줄어들고 간결해 진다.
 */
public class MethodReferenceExample {

	public static void main(String[] args) {
		
		IntBinaryOperator operator;
		
		/*
		 * java.util.function 패키지의 내장 함수형 인터페이스 IntBinaryOperator 특징)
		 *  1. 이 함수형 인터페이스에 정의된 추상메서드 int applyAsInt(int left, int right);는
		 *  int 타입 2개 매개값(인자값)을 가지고 연산한 다음 동일한 int 타입으로 연산 결과를 반환해 준다.
		 */
		
		operator = (left, right) -> Calculator.staticMethod(left, right);//람다식
		System.out.println("덧셈 결과값 = " + operator.applyAsInt(10, 10));
		
		//위의 람다식을 정적메서드 참조로 변경
		operator = Calculator :: staticMethod;// 클래스명 :: 정적메서드 -> 정적메서드 참조
		System.out.println("덧셈 결과값 2 = " + operator.applyAsInt(5, 5));
		
		//람다식을 인스턴스 메서드 참조로 변환
		Calculator cal = new Calculator();
		operator = (left, right) -> cal.instanceMethod(left, right);//람다식
		System.out.println("곱셈 결과값 = " + operator.applyAsInt(7, 7));
		
		operator = cal :: instanceMethod;//객체명 :: 인스턴스 메서드 -> 인스턴스 메서드 참조
		System.out.println("곱셈 결과값2 = " + operator.applyAsInt(6, 6));
	}

}
