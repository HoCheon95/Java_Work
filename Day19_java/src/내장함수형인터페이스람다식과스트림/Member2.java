package 내장함수형인터페이스람다식과스트림;


/*
 * 생성자 참조를 위한 클래스 설계
 */
public class Member2 {
	
	private String name;
	private Integer id;
	
	public Member2() {
		System.out.println("Member2() 생성자 실행");
	}
	
	public Member2(Integer id) {
		System.out.println("Member2(Integer id){} 생성자 실행");
		this.id=id;
	}
	
	public Member2(String name, Integer id) {
		System.out.println("Member2(String name, Integer id){} 생성자 실행");
		this.name=name;
		this.id=id;
	}
	
	public Integer getId() {
		return id;
	}

}
