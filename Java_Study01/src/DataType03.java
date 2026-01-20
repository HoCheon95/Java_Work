/*
 * 비교연산자 종류)
 *  1. 비교연산자 결과값은 true or false인 boolean 타입이다.
 *  2. 비교연산자 종류)
 *  	>	(~보다 크다),
 *  	>=	(~보다 크거나 같다),
 *  	<	(~보다 작다),
 *  	<=	(~보다 작거나 같다),
 *  	==	(같다),
 *  	!=	(같지 않다) 
 */
public class DataType03 {

	public static void main(String[] args) {

		// 비교연산자
		boolean result = false;
		int x = 100, y = 200;
		
		result = (x > y);
		System.out.println(x + " > " + y + " : " + result);//false
		
		System.out.println(x + " <= " + y + " : " + (x <= y));
		
		result = (x == y);//false
		System.out.println(x + " == " + y + " : " + result);
		
		result = (x != y);//true
		System.out.println(x + " != " + y + " : " + result);
		
		System.out.println("\n =========================== \n");
		
		/*
		 * 논리연산자 종류)
		 *  1. 논리연산자 결과값도 true or false인 boolean 타입이다.
		 *  2. 종류)
		 *  	가. &&(논리곱) : 입력값 모두 true이면 결과값도 true이다. 나머지는 모두 false이다.
		 *  	나. ||(논리합) : 두개의 조건 중 하나라도 참이면 결과값은 true이다. 두개의 조건 모두 false인 경우만 false이다.
		 *  	다. !(논리부정) : 입력값이 true이면 결과값은 false이다. 반대로 입력값이 false이면 결과값은 true이다.
		 * 
		 */
		
		result = (true && false); //false
		System.out.println("true && false : " + result);
		
		result = !false;//true
		System.out.println("!false : " + result);
		
		int age = 20;
		if(age >= 20 && age <= 29) {
			System.out.println(age + "세는 20대이다.");
		}else {
			System.out.println(age + "세는 20대가 아니다.");
		}
		
	}

}
