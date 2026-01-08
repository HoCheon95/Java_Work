/*
 * 1. 문자열을 다루는 String 내장 API클래스는 자기 자신 내용을 수정할 수 없다.
 * 2. StringBuffer 내장 API는 자기 자신값을 수정할 수 있다.
 */
public class AutoEx07 {

	public static void main(String[] args) {
		
		String cityName = "daejeon";
		System.out.printf("도시이름을 영문대문자로 변경 : %s \n", cityName.toUpperCase());
		// toUpperCase() 내장 메서드는 영문대문자로 변경해 준다.
		System.out.println("cityName : " + cityName);//cityName 변수값은 영문대문자로 변경안되고
		// daejeon 으로 출력된다.
		System.out.println("\'daejeon\' 문자 길이 : " + cityName.length());
		System.out.println("\'daejeon\' 세번째 단일문자 : " + cityName.charAt(2));
		//charAt(2) 내장메서드는 첫문자를 0부터 시작해서 세번쨰 단일문자 e를 반환
		System.out.println("\'daejeon\' 에서 e가 몇번째 위치 : " + (cityName.indexOf('e')+1));
		// indexOf('e') 메서드는 단일문자 e를 맨왼쪽에서 부터 찾아서 가장 먼저 나오는 해당문자
		// 위치번호를 0부터 카운터해서 구한다. -> 3
		
		System.out.println("\n ======================= \n");
		
		StringBuffer str01 = new StringBuffer();
		str01.append("Java");//Java 문자 추가
		str01.append(" Programming");
		System.out.printf("추가된 문자 : %s \n", str01.toString());
		
		String resultChar = str01.substring(0, 4);//첫문자를 0부터 카운터해서 0이상 4미만 사이의 문자 반환 -> Java
		System.out.println("0이상 4미만 사이의 문자반환 : " + resultChar);
		
		str01.replace(0, 4, "Jsp");//첫문자를 0부터 카운터해서 0이상 4미만 사이의 문자 Java에서 Jsp로 변경
		System.out.printf("변경된 문자 : %s \n", str01.toString());// Jsp Programming
	}

}
