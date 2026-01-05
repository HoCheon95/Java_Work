/*
 * 배열 복사 -> 자바에서 배열은 크기가 고정되어 있어 크기 변경이 불가능함로, 크기 변경이 빈번한 경우에는 
 * 배열 복사 대신 컬렉션을 사용하는 것이 바람직하다.
 */
public class ArrayEx07 {
	public static void main(String[] args) {

		int[] arr = new int[5];

		// arr[]배열에 1부터 5까지 배열원소값 저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		System.out.println("변경 전 배열 크기 : " + arr.length); // 5

		// 배열원소값 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		int[] tmp = new int[arr.length * 2]; // arr.length 배열크기는 5 즉 5 * 2 = 10 배열크기가 10인 tmp 배열 생성

		// 배열 arr에 저장된 원소값을 tmp배열로 복사
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}

		arr = tmp;

		/*
		 * 배열은 레퍼런스 참조타입이다. 그러므로 우측의 tmp 배열주소가 arr에 대입된다. 그러면 기존의 arr배열 주소는 사라진다. 결국
		 * arr은 tmp 배열주소를 가리킨다. 그래서 arr배열크기가 5가 아니고 10이 된다.
		 */

		System.out.println("변경 후 배열 크기 : " + arr.length); // 10

		// 향상된 확장 for반복문으로 배열원소값 출력
		for (int k : arr) {
			System.out.print(" " + k);
		} // for

	}// main
}
