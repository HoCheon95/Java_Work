/*
 * 자바의 while 반복문 형식)
 * while(조건식){
 * 	조건식이 참일동안만 반복실행;
 * 	증감식;
 * }
 */

//for 반복문과 while 반복문 비교
public class CaseEx04 {
	public static void main(String[] args) {
		
		int i;
		
		//for 반복문
		for(i=10; i>=1; i--) {
			System.out.print(i + " ");
		}
		System.out.println("\n ===================== \n");
		
		//while 반복문
		i=1;
		while(i<=10) {
			System.out.print(" " + i);
			i+=1;	//i++ 과 같은 기능을 한다. 1씩 증가
		}
		System.out.println("\n ===================== \n");
		
		//while 반복문을 사용한 짝수들의 누적함
		int total = 0;	//짝수들의 누적합을 저장할 변수
		i = 2;
		while(i <= 10) {
			total += i;
			i += 2;	//2씩 증가
		}
		System.out.println("짝수들의 누적합 = " + total);

	}//main
}
