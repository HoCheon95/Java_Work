package 중첩클래스와중첩인터페이스;

/*
 * 외부클래스 메서드내의 익명객체(익명클래스)를 구현하고 익명클래스 내부에 있는 메서드에서 외부 클래스 메서드 소속의 
 * 매개변수나 지역변수를 사용하고자 할 경우 final 속성을 가진다.
 * 
 * 자바 8부터는 final 은 생략가능하다.
 * 
 */
public class Anonymous3 {
	
	private int field;
	
	public void method(int arg01, int arg02) {
		int var01 = 0;
		int var02 = 0;
		
		
		//arg01 = 10;
		//arg02 = 20;
		
		//var01 = 1000;
		//var02 = 2000;
		
		field = 100;
		
		Calculatable calc = new Calculatable() {
			
			@Override
			public int sum() {
				
				int result = arg01 + arg02 + var01 + var02 + field;
				
				return result;
			}
			
		};//익명클래스(Anonumous3$1.class)
		
		System.out.println("계산 결과값 = " + calc.sum());
	}//method()

}
