package 람다식;

/*
 * MyFunInterface5 인터페이스를 메서드 내의 람다식 익명객체 구현해 사용해 본다. 람다식 익명객체내의 오버라이딩 된 메서드내에서
 * 외부 클래스 소속의 메서드의 매개변수나 지역변수를 사용할 경우 final 상수로 인식한다.
 */
public class UsingLocalVariable {
	
	void method(int arg) {// arg 는 final 속성을 가진 상수로 인식
		int localVar = 70;
		
		//arg = 100;//final 상수로 인식되어서 값을 수정못함
		//localVar = 700;//final 상수로 인식됨. 값 수정못함
		
		//람다식 익명객체 구현
		MyFunInterface5 fi = () ->{//오버라이딩 된 메서드 생략
			System.out.println("arg = " + arg);
			System.out.println("localVar = " + localVar);
		};
		
		fi.method();
	}//method()
}
