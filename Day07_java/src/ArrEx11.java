/*
 * 자바에서 OOP(Object-Oriented Programming)인 객체지향 프로그래밍을 사용하는 목적(이유)
 * 1. 높은 재사용성
 * 2. 중복코드 제거
 */

class Arr11 {
	void printArr(int[] arr) {	// printArr 메서드
		// 향상된 확장 for
		for (int k : arr) {
			System.out.print(" " + k);
		}
		System.out.println("\n\n ======================= \n");
	}// printArr()
}// Arr11 class

public class ArrEx11 {

	public static void main(String[] args) {

		int[] numArr = new int[5];

		// 배열원소 초기화
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i + 1; // 1부터 5까지 정수숫자로 배열원소값 초기화
		} // for

		// 일반 for반복문으로 numArr 배열원소값 출력
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("numArr[" + i + "] : " + numArr[i]);
		} // for

		System.out.println("\n\n ======================= \n");

		// 향상된 확장 for반복문으로 배열원소값 출력
		for (int k : numArr) {
			System.out.print(" " + k);
		} // for -> numArr 배열원소값을 출력할 때 마다 반복적 코드가 이루어짐
		System.out.println("\n\n ======================= \n");
		
		// 객체지향언어인 OOP를 활용해서 반복적인 코드를 제거
		Arr11 arr = new Arr11();
		arr.printArr(numArr); // numArr배열원소값을 출력할 때 마다 해당 메서드만 호출하면 된다.
		arr.printArr(numArr);
	}
}
