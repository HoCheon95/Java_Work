/*
 * 생성자 오버로딩, this()에 의한 같은 클래스내에서 오버로딩 된 다른 생성자를 호출, 생성자의 주된 기능인 인스턴스 변수
 * 초기화등에 대해서 알 수 있다.
 */

class Document{
	static int count = 0; // 정적변수
	String name; // 인스턴스 변수 -> null기본값으로 초기화
	
	Document(){ // 매개변수가 없는 기본 생성자
		this("제목없음" + ++count);// 같은 클래스내의 오버로딩 된 다른 생성자 호출
	}
	
	Document(String name){
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성");
	}// 생성자 오버로딩
}

public class ConsEx03 {

	public static void main(String[] args) {
		
		new Document(); // 기본 생성자 호출
		new Document("자바.txt"); // 오버로딩 된 생성자 호출
		new Document();

	}

}
