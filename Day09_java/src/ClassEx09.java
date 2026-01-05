/*
 * 같은 클래스네에서 오버로딩 된 다른 생성자를 호출할 때는 this()를 사용한다.
 */

class MyDate09{
	private int year;
	private int month;
	private int date;
	
	public MyDate09() {
		this(2025,12,23); // 같은 클래스내에서 오버로딩 된 다른 생성자를 호출
	}

	public MyDate09(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	public void pr() {
		System.out.println(year + "년 " + month + "월 " + date + "일");
	}
}
public class ClassEx09 {

	public static void main(String[] args) {
		
		MyDate09 md = new MyDate09(); // new MyDate09();에 의해서 기본생성자 호출
		md.pr();

	}

}
