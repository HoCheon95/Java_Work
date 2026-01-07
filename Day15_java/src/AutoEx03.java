/*
 * == 같다 비교연산자와 String 문자열 내장클래스 하위의 equals() 내장메서드 비교 예)
 */
public class AutoEx03 {

	public static void main(String[] args) {

		int a = 7, b = 7;

		if (a == b) {//기본타입 값을 == 같다 연산으로 비교하며 값을 비교한다.
			System.out.println(a + "와(과) " + b + "는 값이 같다.");
		}else {
			System.out.printf("%d와(과) %d는 값이 다르다.\n", a, b);
		}
		
		String pwd01 = new String("56789");
		String pwd02 = new String("56789");// new 키워드로 새로운 객체 pws01, pwd02를 각각 생성하면 각 객체주소는 다르다.
		
		if(pwd01 == pwd02) {//String 문자열값을 ==로 비교하면 값을 비교하지 않고 객체주소를 비교한다.
			System.out.println("비번이 같다.");			
		}else {
			System.out.println("비번이 다르다.");
		}
		
		if(!pwd01.equals(pwd02)) {//문자열 값 비교는 equals() 메서드를 사용해야 한다.
			System.out.println("비번이 다르다.");
		}else {
			System.out.println("비번이 같다.");
		}//if ~ else
	}

}
