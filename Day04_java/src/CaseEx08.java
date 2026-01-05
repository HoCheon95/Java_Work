/*
 * 이중 for 반복문을 사용한 구구단
 */
public class CaseEx08 {
	public static void main(String[] args) {
		
		int i,j; //반복문 제어변수
		
		//첫번쨰 구구단
		for(i=2; i<=9; i++) {
			System.out.println(">>>>>>>>>>>" + i + "단 <<<<<<<<<<");
			for(j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}//inner for
			System.out.println("\n ============== \n");
		}//outer for
		
		
		//두번쨰 구구단
		int k=2;
		while(k<=9) {
			System.out.print(k + "단\t");
			k++;
		}//while end
		System.out.println("\n ========================================================== \n");
		
		/*
		 * 문제)이중 for 반복문을 사용해서 다음과 같은 구구단이 출력되게 자바 프로그램을 만들어 본다.
		 * 2*1=2  3*1=3 ... 중략 ... 9*1=9
		 * ... 중략
		 * 2*9=18 ... ... 			9*9=91
		 */
		
		/* ex) 
		 * 0행 j*i j*i j*i 
		 * 1행 2*1 3*1 4*1 i++
		 * 2행 2*2 3*2 4*2 j++ i++
		 * 3행 2*3 3*3 4*3 j++ i++
		 * 4행 2*4 3*4 4*4 j++ i++
		 */

		for(i=1; i<=9; i++) {	//행마다 j * i 출력이 되야함.   
			for(j=2; j<=9; j++) {					    
				System.out.printf("%d*%d=%d\t", j, i, i*j);
			}
			System.out.println();
		}

	}//main
}
