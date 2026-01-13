package 중첩클래스와중첩인터페이스;


/*
 * Person 클래스를 활용한 익명객체 구현 -> 익명클래스 생성(내부 무명클래스)
 */
public class Anonymous {
	
	//필드 초기값으로 대입
	Person field = new Person() {
		
	};//첫번쨰 익명클래스(외부클래스명$번호.class - Anonymous.$1.class)

}
