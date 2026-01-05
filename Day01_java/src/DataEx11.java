/*
 * 자바 확장 특수 출력문자(escape sequence) 종류
 * 	\n(줄바꿈), \t(탭키만큼 수평으로 띄움), \'(작은 따옴표 출력), \"(큰따옴표 출력), \\(경로구분하는 \ 출력),
 *  \b(백스페이스), \f(연속용지에서 페이지 넘김), \r(커서를 현재줄 맨 앞으로)
 */
public class DataEx11 {
	public static void main(String[] args) {
		
		System.out.println("\'405호 강의실\'");
		System.out.println("\"오늘 수령한 교재는 java이다\"");
		System.out.println("자바\t오라클\tHtml");
		System.out.println("\n");
		System.out.println("D:\\");	// D:\로 표현

	}
}
