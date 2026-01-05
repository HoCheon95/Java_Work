/*
 * 무한루프 문 : 반복문 조건식이 무조건 참이어서 영원히 반복하는 반복문을 말한다.
 * 무한루프 형식)
 *  1. while(true){
 * 		반복실행 문장;
 *     }
 *     
 *  2. for(;;){ // 초기지, 조건식, 증감치 모두 생략하면 무한루프문이 된다.
 *  	반복실행 문장;
 *     }
 *   
 */
public class ForEx06 {

	public static void main(String[] args) {

		int i = 1;
		while (true) {
			System.out.print(i + "번 ");

			if (++i == 6) {
				break; // 무한루프문 종료
			}
		} // while
		System.out.println("\n\n =============================== \n");

		// for 반복문 무한루프문 형식
		i = 1;
		for (;;) {
			System.out.print(i + "번 ");

			if (++i == 6) {
				break; // 무한루프문 종료
			}
		} // for
	}

}
