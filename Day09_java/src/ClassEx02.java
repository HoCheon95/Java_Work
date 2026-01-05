/*
 * 메서드 리턴타입이 참조형인 경우
 */

class Data13 {
	int x;
}

public class ClassEx02 {
	static Data13 copy(Data13 d) { // 메서드 반환타입이 Data13 클래스형 참조타입 인 경우
		Data13 tmp = new Data13();// 새로운 객체 tmp를 생성하면서 새로운 객체주소를 할당한다.
		tmp.x = d.x;// tmp와 d는 서로 다른 객체주소를 가진다. 값만 복사

		return tmp;

	}// copy()

	public static void main(String[] args) {
		
		Data13 d = new Data13();// 객체 생성
		d.x = 10;
		
		Data13 d2 = copy(d); // d2와 d는 서로 다른 객체주소를 가진다. d2 = tmp이다. 즉 d2와 tmp는 같은
		                     // 객체주소이다.
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
		
		

	}

}
