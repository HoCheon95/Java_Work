/*
 * 1. static 키워드로 정의된 변수 count를 정적변수라고 한다. 정적변수는 클래스 변수로 해당 클래스로 직접 접근가능하다.
 * 2. 인스턴스 초기화 블록{ } 을 사용해서 정적변수와 인스턴스 변수 초기화를 해보고 그 차이점에 대해서 알아 본다.
 */
class Product{
	static int count = 0;//정적변수 | 멤버변수(속성) 중 정적변수
	int serialNo;// 인스턴스 변수 -> 생성된 객체마다 따로 관리한다.(생성된 객체마다 주소값이 다르다. 
	// 그러므로 다른값을 가진다.) 명시적인 초기화를 하지 않아서 기본값 0으로 초기화가 된다.| 멤버변수(속성) 중 인스턴스 변수
	
	{// 인스턴스 초기화 블록
		++count; // 생산대수를 카운터(생성된 객체마다 값을 공유가능 하다. -> 누적 생산대수)
		serialNo = count; // 생성된 객체마다 값이 다르다. 이유는 객체주소가 달라서이다.
	}
	
	 public Product() {
		 
	 }// 기본 생성자
}
public class ConsEx02 {

	public static void main(String[] args) {
		
		Product p01 = new Product(); // 먼저 인스턴스 초기화 블록을 호출하고 그 다음에 생성자를 호출
		Product p02 = new Product(); // new Product(); 할 때 마다 생성자와 인스턴스 초기화 블록을 호출 실행
		Product p03 = new Product(); // p01,p02,p03 각 객체주소가 다르다. 그러므로 다른 고유한 값을 가진다.
		
		System.out.println("p01 제품번호(시리얼 번호) : " + p01.serialNo);
		System.out.println("p02 제품번호 : " + p02.serialNo);
		System.out.println("p03 제품번호 : " + p03.serialNo);
		
		System.out.println("총 생산대수 : " + Product.count + "대");

	}

}
