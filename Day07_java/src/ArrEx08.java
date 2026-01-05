/*
 * new 키워드로 새롭게 생성된 객체는 서로 다른 객체주소를 가진다. 그러므로 다른 값을 가진다.
 */

class Tv08{
	int channel; //채널번호 속성 | 멤버변수 초기값 0으로 자동 초기화
}

public class ArrEx08 {

	public static void main(String[] args) {
		
		Tv08 tv01 = new Tv08();
		Tv08 tv02 = new Tv08();	// tv01과 tv02는 서로 다른 객체주소를 가진다. | 객체
		
		System.out.println("tv01 채널번호 : " + tv01.channel + ", tv02 채널번호 : " + tv02.channel);
		
		tv01.channel = 10;
		System.out.printf("tv01 채널번호 = %d, tv02 채널번호 = %d \n", tv01.channel, tv02.channel); //10, 0

	}

}
