/*
 * double 소수점이 있는 실수숫자 타입 값을 캐스팅연산자(int)로 형변환하면 소수점이하는 부조건 반올림을 하지 않고 버린다.
 * 
 */
public class DataEx12 {
	public static void main(String[] args) {
		
		double score = 89.9;
		int resultScore = (int)score;	// 89.9점에서 소수점 이하 0.9는 반올림 하지 않고 버림
		
		System.out.printf("실제 취득한 점수 = %f \n", score);
		System.out.println("공무원 합격점수(90점이상이면 합격, 90점 미만이면 불합격)이다.");
		System.out.printf("아쉽게도 불합격 = %d점 \n", resultScore);

	}
}
