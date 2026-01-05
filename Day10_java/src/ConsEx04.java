/*
 * 클래스 소속의 멤버변수 중 정적변수와 인스턴스 변수의 차이점)
 */
class St04{
	static int a = 10; // static 키워드로 정의 변수 a를 정적변수(클래스 변수)라고 한다. 정적변수는 해당클래스로 직접
	// 접근할 수 있다(St04.a) 클래스 소속 내의 멤버변수(속성) 중 정적(static)변수 
	int b = 20; // 클래스 소속 내의 멤버변수(속성) 중 인스턴스 변수
	
	/*
	 * 1. 인스턴스 변수
	 * 2. 정적 변수(static)
	 */
}// st04 class

public class ConsEx04 {

	public static void main(String[] args) {
		System.out.println("St04.a = " + St04.a);
		
		St04 s01 = new St04();
		St04 s02 = new St04();
		
		System.out.println("s01.a = " + s01.a + ", s02.a = " + s02.a);// 생성된 객체로 정적변수 접근 가능
		System.out.println("s01.b = " + s01.b + ", s02.b = " + s02.b);
		
		s01.a = 100;// 변경된 정적변수 a값은 객체에 의해서도 공유된다.
		System.out.printf("s01.a = %d \t s02.a = %d \n", s01.a, s02.a); // 100, 100
		s01.b = 200;// 인스턴스 변수 b는 생성된 객체마다 따라 관리한다. 그러므로 객체주소값이 다르다. 다른값을 가진다.
		System.out.println("s01.b = " + s01.b + "\t s02.b = " + s02.b);// 200, 20 \t는 탭키만큼 수평으로 띄운다.
			
	}

}
