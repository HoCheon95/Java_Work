/* 생성자의 특정)
 *  생성자가 오버로딩이 되면 자바 컴팡일러는 더 이상 묵시적인 기본생성자를 제공하지 않는다.
 * 
 */

class GuestBook06{
	String writer;//방명록 글쓴이
	String title; //방명록 제목
	
	//생성자를 오버로딩을 해서 기본생성자 묵시적 제공 안함
	public GuestBook06(String new_write, String new_title) {
		writer = new_write;
		title = new_title;
	}// 매개변수 개수가 다른 생성자 오버로딩
	
	public void pr() {
		System.out.println("방명록 글쓴이 : " + writer + ", 방명록 제목 : " + title);
	}
}// 방명록 클랙스
public class ClassEx06 {

	public static void main(String[] args) {
		
		//GuestBook06 guest = new GuestBook06();// new GuestBook06(); 에 의해서 묵시적으로 제공하지
		                                      //  않는 기본생성자를 호출하려다가 컴파일 에러 발생
		//guest.pr();
		
		GuestBook06 guest02 = new GuestBook06("홍길동", "방명록 제목입니다.");// 매개변수 2개짜리 오버로딩 된 생성자 호출
		guest02.pr();

	}

}
