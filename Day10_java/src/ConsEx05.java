/*
 * static 키워드로 정의된 메서드를 정적메서드라고 한다. 정적메서드는 해당 클래스로 직접 접근 가능하다.
 */
class St05{
	private static int a = 10; //정적변수
	private int b = 20; // 인스턴스 변수
	
	public void setA(int new_a) { // 정적메서드 setA() 정의
		a = new_a;
	}
	
	public static int getA() { // 정적메서드 getA() 정의
		return a;
	}
	
}

public class ConsEx05 {

	public static void main(String[] args) {
		
		System.out.println("St05.getA() = " + St05.getA()); // 10
		
		St05 s01 = new St05();
		
		s01.setA(100); // 생성된 객체로도 정적메서드 호출가능 하다.
		int result = St05.getA();
		System.out.println("result = " + result); // 100
		

	}

}
