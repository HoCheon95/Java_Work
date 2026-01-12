package net.daum.gugudan;

public class Thousand {
	
	int sum;//1부터 1000까지 누적합을 저장할 클래스 소속의 멤버변수 중 인스턴스 변수(속성)
	
	public Thousand() {}//기본 생성자 명시적 코드
	
	public Thousand(int count) {
		for (int i = 1; i <= count; i++) {
			sum+=i;// 생성자의 주된 기능인 멤버변수 중 인스턴스 변수 초기화이다.
		}
	}// 매개변수 개수가 다른 생성자 오버로딩
	
	public int getSum() {
		return sum;// return 에 의해서 누적합을 메서드 호출한 곳으로 반환
	}

}
