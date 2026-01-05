/**
 *  java 12 버전의 switch ~ case 다중 선택문에서 표현식 문법인 -> 화살표 연산자가 추가되었다. 그리고 java 13
 *  버전에서는 yield 키워드가 추가되어 switch 표현식에서 case 블록의 값을 반환하고 블록을 종료하는 용도로만 사용하게 되었다.
 */
public class OperEx15 {
	public static void main(String[] args) {

		int day = 3;

		/* switch ~ case 문에 표현식인 화살표 연산자 ->를 사용하면 코드가 좀 더 간결해 진다. 이를 통해 값을
		 * 반환해서 변수를 초기화 할 수 있다.
		 */
		String dayName = switch(day) {
		case 1 -> "월요일";
		case 2 -> "화요일";
		case 3 -> "수요일";
		default -> "알수 없는 요일";
		};

		System.out.println("반환된 요일 : "+dayName);

		System.out.println("\n ============================ \n");

		var day02 = 1;
		/* 1. java 10 버전에서 도입된 var키워드는 생성자나 메서드내에 선언된 지역변수 타입을 추론할 수 있게 해준다.
		 * 2. java 13에서 도입된 yield 키워드는 switch ~ case 블록내에서 반환값을 명시적으로 지정할 수 있게 해준다. 
		 * 그리고 해당 case 블록을 종료하는 용도로 사용된다.
		 */
		String dayName02 = switch(day02) {
		case 1 -> {
			String name = "월요일";
			yield name; //yield 키워드를 사용하여 값 반환 + case 블록 종료
		}
		case 2 -> "화요일";
		case 3 -> "수요일";
		default -> "알수 없는 요일";
		};

		System.out.println("반환된 요일 : "+dayName02);
	}
}
