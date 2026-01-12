package net.daum.gugudan;



public class GuguDan {
	int k, i, j;//반복문제어변수를 클래스 소속 멤버변수 중 인스턴스 변수(속성)로 정의
	
	//매개변수가 없는 기본생성자 생략
	
	//구구단 제목, 구구단 내용이 출력되는 메서드
	public void guguDanWrite() {
		k = 2;
		while(k<=9) {
			System.out.print(k + "단\t");// \t 는 탭키만큼 수평으로 띄운다.
			k++;
		}
		System.out.println("\n ========================= \n");
		
		//이중 for 반복문으로 구구단 내용
		for(j = 1; j<=9; j++) {
			for(i = 2; i<=9; i++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			}//inner for
			System.out.println();//개행 -> 줄바꿈
		}// outer for
		System.out.println("\n ========================= \n");
	}//guguDanWrite() 메서드
}
