/*
 * 자바 OOP에서 클래스 소속의 사용자 정의 메서드)
 * 1. return 키워드로 값을 반환하는 메서드
 * 2. 메서드명 앞에 리턴타입을 void형으로 해서 값을 반환하지 않고 구구단을 출력하는 메서드
 */

class Obj12 {

	int add(int a, int b) { // 메서드 | 매게변수
		return a + b;
	}

	void printGu() { // 메서드
		System.out.println("\n\n ============== \n");
		// 구구단 내용 출력
		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
				System.out.print(i + "x" + j + "=" + (i*j) + "\t"); // \t 이스게이프 문자는 탭키만큼 수평으로 띄움
			}// inner for
			System.out.println(); // 줄바꿈
		}// outer for
	}// printGu()
}// Obj12 class

public class ArrEx12 {

	public static void main(String[] args) {
		
		Obj12 obj = new Obj12();
		System.out.println("7+7=" + obj.add(7, 7));
		obj.printGu();

	}

}
