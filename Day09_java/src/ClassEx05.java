/*
 * 기본 생성자(디폴트 생성자) 특징)
 *  기본 생성자는 매개변수가 없는 생성자를 말한다. 생성자가 오버로딩이 안된 경우에는 자바 컴파일러는 묵시적인 기본생성자를 제공
 *  한다.
 */

class MyDate05{
	private int year;
	private int month;
	private int date;
	
	//기본 생성자 묵시적 생략
	
	public void print() {
		System.out.println(year + "년 " + month + "월 " + date + " 일");
	}
}
public class ClassEx05 {

	public static void main(String[] args) {
		
		MyDate05 md = new MyDate05();// new MyDate05();에 의해서 기본생성자 호출
		md.print();

	}

}
