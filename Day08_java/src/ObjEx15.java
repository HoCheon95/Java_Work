/**
 * 개발일자 2025년 12월 22일 오후 12월 31분 개발자 : 홍길동 참조타입 배열 배개변수
 */
public class ObjEx15 {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 1, 6, 5, 4 };

		printArr(arr);
		printArr2(arr);
		/*
		 * 문제01) 자바5에서 추가된 향상된 확장 for 반복문을 사용해서 다음과 같이 배열원소값이 출력되게 static void
		 * printArr(int[] arr){ } 정적메서드를 작성한다.
		 * 
		 * 출력 예) [3,2,1,6,5,4] =============
		 * 
		 */

		ObjEx15 obj15 = new ObjEx15();
		int total = obj15.getTotal(arr);
		/*
		 * 문제02) 일반 for반복문을 사용해서 배열원소 총합을 구해서 반환하는 코드를 int getTotal(int[] arr){} 블록내에
		 * 작성해본다.
		 */

		System.out.printf("arr배열원소 총합 = %d \n", total);

	}

	// 1번 답안코드
	static void printArr(int[] arr) {
		System.out.print("[");
		int i = 0;

		for (int k : arr) { // 향상된 for 반복문
			System.out.print(k); // 숫자 출력
			if (i < arr.length - 1) { // 배열의 마지막 인덱스-1 보다 i가 작을 경우
				System.out.print(", ");
			}
			i++; // i증감
		}

		System.out.println("]");

		System.out.println("\n ============================ \n");

	}

	static void printArr2(int[] arr) {
		System.out.print("[");
		for (int k : arr) {
			if (k != 4) {
				System.out.print(k + ", ");
			} else {// 4일때 실행 -> ,를 안나오게 함
				System.out.print(k);
			}
		} // for
		System.out.println("]");
		System.out.println("\n ============================ \n");

	}

	// 2번 답안코드
	int getTotal(int[] arr) { // 총 합을 구해서 반환이니 return 이 있어야된다.
		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
	}

	int getTotal2(int[] arr) {
		int sum = 0; // 배열원소 누적합

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum; // 누적합 return 키워드로 getTotal()메서드 호출한 곳으로 반환
	}// getTotal()

}