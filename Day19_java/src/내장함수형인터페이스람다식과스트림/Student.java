package 내장함수형인터페이스람다식과스트림;

public class Student {
	
	private String name; //학생명
	private int score; //점수
	
	public Student(String name, int score) {
		this.name=name;
		this.score=score;
	}//매개변수 2개짜리 오버로딩 생성자

	public String getName() {
		return name;
	}//값 반환 메서드 -> getter() 메서드

	public int getScore() {
		return score;
	}
	
	

}
