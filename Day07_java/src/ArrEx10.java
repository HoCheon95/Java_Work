/*
 * 객체 배열
 */

class Tv10 {
	int channel; // 멤버변수

	void channelUp() { // 메서드
		++channel; // 채널번호 1증가
	}
}// Tv10 class

public class ArrEx10 {

	public static void main(String[] args) {

		Tv10[] tvArr = new Tv10[3]; // 배열크기가 3인 객체배열 tvArr 생성

		// Tv10 객체를 생성해서 tvArr 객체 배열의 각 요소에 저장
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv10(); // tvArr 배열의 각 i번째에 새로운 Tv10 객체를 생성해서 저장, 즉 tvArr[i]에
								   // Tv10 객체의 주소값을 저장
			tvArr[i].channel = i + 10; // 채널번호가 10, 11, 12 저장
			System.out.printf("tvArr[" + i + "].channel = %d \n", tvArr[i].channel); //
		}// for
		
		System.out.println("\n\n =========================== \n");
		
		// 채널번호를 1증가하고 출력
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp(); // 각 채널번호 1증가
			System.out.println(tvArr[i].channel); // 11 12 13 채널번호 출력
		}// for

	}

}
