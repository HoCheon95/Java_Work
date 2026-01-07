/*
 * 자바 인터페이스.pdf No.24쪽 1번 문제)
 * 1. net.daum.model01 패키지를 생성하고 부모 인터페이스 IShapeClass.java를 만들고 추상메서드 void draw();를 정의한다.
 * 2. new.daum.model02 패키지를 생성하고 부모 인터페이스 IShapeClass를 구현 상속한 자손 클래스
 *    Circ.java, Rect.java, Tria.java를 생성하고 부모의 추상메서드 draw()를 각각 오버라이딩 한다.
 *    각 오버라이딩 된 출력 실행문장으로 "타원을 그린다", "사각형을 그린다", "삼각형을 그린다"가 출력되게 하는 자바 코드를 기술한다.
 *    
 * 그런 다음 다음과 같은 출력 결과물이 나오게 한다.
 * 타원을 그린다.
 * 사각형을 그린다.
 * 삼각형을 그린다.
 * ===========================
 * 
 */
import net.daum.model01.IShapeClass;
import net.daum.model02.Circ;
import net.daum.model02.Rect;
import net.daum.model02.Tria;


public class Ex19_01 {
	static void pr(IShapeClass ish) {//매개변수 다형성(업캐스팅과 상속 -> 모든 자손 타입을 받을 수 있다.)
		ish.draw();//업캐스팅 이후 오버라이딩 한 메서드 호출
	}

	public static void main(String[] args) {
		
		IShapeClass ref; //부모 인터페이스 타입으로 ref 참조변수 서언
		ref = new Circ();// 업캐스팅
		ref.draw();// 업캐스팅 이후 오버라이딩 한 메서드 호출
		
		ref = new Rect();
		ref.draw();
		
		ref = new Tria();
		ref.draw();
		System.out.println("=========================== \n");
		
		pr(new Circ()); pr(new Rect()); pr(new Tria());
		System.out.println("=========================== \n");

	}

}
