/*
 * main() 메서드도 단일 스레드 이다. 현재 실행중인 스레드 이름을 반환해 본다.
 */
public class ThreadEx02 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		/*
		 * 현재 실행중인 스레드 이름을 반환
		 * -> 2개의 메서드 이상을 코드라인을 줄이면서 한주롤 코드하는 기법을 메서드 체이닝 방법이라고 한다.
		 */
		
	}

}
