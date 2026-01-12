
public class DataType08 {

	public static void main(String[] args) {
		/*
		 * break 문 특징)
		 *  반복문내에서 break 문을 만나면 반복문을 중단한다.
		 */
		
		//1부터 10까지 반복하는 데 4일때 반복문을 중단한다.
		
		int i;//반복문 제어변수
		for (i = 1; i <= 10; i++) {
			if(i % 4 == 0) {//4로 나눈 나머지값이 0과 같을때 실행 -> 4의 배수일 때 실행
				break;//반복문 중단
			}//if
			System.out.print(" " + i);// 1 2 3
		}//for
		System.out.println("\n =================== \n");
		
		/*
		 * continue 문 특징)
		 *  반복문내에서 continue 문을 만나면 아래문장을 실행하지 않고 반복문 처음으로 돌아가서 다음 반복을 계속한다.
		 */
		
		i = 1;
		for (i = 1; i <= 10; i+=1) {
			if(i % 3 == 0) {//3의 배수일 때 실행
				continue;
			}
			System.out.print(" " + i);
		}
		System.out.println("\n =================== \n");// 3 6 9 즉 3의 배수만 빼고 출력
	}

}
