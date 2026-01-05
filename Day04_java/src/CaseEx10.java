/*
 * 이중 for반복문 안에 if ~ else 조건문을 사용한 예)
 */
public class CaseEx10 {
	public static void main(String[] args) {
		
		int i,j;
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				if(i == j) {
					System.out.printf("[%d,%d]", i, j);
				}else {
					System.out.printf("%5c", ' ');//%5c 출력형태는 단일문자를 총5자리 공간에 출력하며, 기본으로 오른쪽 정렬로 표시된다.
				}
			}//inner for
			System.out.println();			
		}//outer for

	}
}
