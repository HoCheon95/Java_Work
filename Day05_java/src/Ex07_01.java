/*
 *  07장.제어문의 다양한 활용.pdf No.8쪽 1번문제)
 *  22부터 76까지의 짝수의개수와 그 합을 구하는 프로그램을 작성하시오.(Ex07_01.java->일반for문) 
	짝수의개수-> 28 
	그합-> 1372 
	
	힌트는 짝수의 개수를 구할 때는 ++증가 연산자를 활용한다.
	단, 2씩 증가된 for 반복문과 1씩 증가된 for 반복문 각각 사용한다.
	특히 1씩 증가된 for 반복문 안에서는 if 조건문과 나머지 연산 %, == 같다 비교연산자를 사용한다.
 * 
 */
public class Ex07_01 {

	public static void main(String[] args) {

		int i, even_count = 0, sum = 0;

		for (i = 22; i <= 76; i++) {
			if (i % 2 == 0) {// 짝수
				even_count++; // 짝수 카운트
				sum += i; // 짝수 합
			}
		}
		System.out.printf("짝수의 개수 -> %d\n", even_count);
		System.out.println("그 합 -> " + sum);

		System.out.println("\n =============================== \n");

		even_count = 0;
		sum = 0;

		for (i = 22; i <= 76; i += 2) {// 2씩 증가
			even_count++; //짝수 카운트
			sum += i;	//짝수 합
		}
		System.out.printf("짝수의 개수 -> %d\n", even_count);
		System.out.println("그 합 -> " + sum);

	}

}
