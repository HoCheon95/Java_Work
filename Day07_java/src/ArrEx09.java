/*
 * new 키워드로 서로 다른 객체를 생성해서 다른 주소값을 가지지만 이를 같은 객체주소를 가리키게 하는 방법에
 * 대한 소스예)
 */

class Tv09{
	int channel; // 멤버변수
}
public class ArrEx09 {

	public static void main(String[] args) {
		Tv09 tv01 = new Tv09();	// 객체
		Tv09 tv02 = new Tv09(); // tv01과 tv02는 서로 다른 객체 주소를 가진다.
		
		tv02 = tv01;
		/*
		 * tv01객체주소가 tv02에 대입된다. 그러면 기존의 tv02 객체주소는 사라진다. 
		 * 결국, tv01과 tv02는 같은 객체주소를 가리킨다. 
		 * 즉 동일하게 가리키는 객체주소는 tv01이 된다.
		 */
		
		tv01.channel = 7; // 채널번호가 0에서 7로 변경됨. 따라서 tv02로 접근하는 채널번호도 7로 변경된다.
		System.out.println("변경된 tv01 채널번호 : " + tv01.channel + ", 변경된 tv02 채널번호 : " + tv02.channel);

	}

}
