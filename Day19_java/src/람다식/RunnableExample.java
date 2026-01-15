package 람다식;

/*
 * 자바 내장 함수형 인터페이스 인 Runnable 은 자바8 버전에서 @FuntionalInterface 가 도입되어져서 람다식을
 * 구현할 수 있게 되었다. 여기에는 추상메서드 void run(); 딱 하나만 온다. 결국 멀티쓰레드 문장을 람다식 문법으로
 * 구현할 수 있게 되었다는 것을 의미한다.
 * 
 * 문제1) 함수형 인터페이스인 Runnable 을 사용하면 람다식 익명객체를 구현할 수 있다. 그러므로 스레드의 스케줄링
 * 메서드인 sleep()을 잘 활용해서 람다식 문법코드로 1초 간격으로 10부터 1까지 카운터 다운 되는 스레드 예제를
 * for 반복문을 사용해서 구하는 자바 코드를 완성해 본다.
 */


public class RunnableExample {
	public static void main(String[] args) {
		
		//1번 문제 답안코드
		Runnable r = () -> {// run()메서드 오버라이딩 됨 -> 코드 생략
			for (int i = 10; i >= 1; i--) {
				System.out.print(" " + i);
				try {
					Thread.sleep(1000);// 1초간 일시정지 -> 1초 간격으로 작동
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			} // for
		};// 람다식 익명객체 구현
		
		Thread th = new Thread(r);
		th.start();//스레드 시작
		
		
		System.out.println("\n =========================== \n");
		
		
		/*
		 * 문제2) Runnable 자손인 Thread 클래스와 for 반복문, sleep()을 활용해서 람다식 문법으로
		 * 동시에 1부터 10까지 카운터 되는 스레드 프로그램을 만들어 본다. 위의 스레드와 동시 작업이 이루어 져야 한다.
		 */
		
		//2번 문제 답안코드
		
		Thread t = new Thread(() -> {
			
			for(int k = 1; k <= 10; k++) {
				System.out.print(" " + k);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException ie) {
					ie.printStackTrace();
				}
			}// for
		});//Thread 생성자 인자값으로 람다식 대입
		
		t.start();
		
		
//		Runnable r2 = () -> {// run()메서드 오버라이딩 됨 -> 코드 생략
//			for (int i = 1; i <= 10; i++) {
//				System.out.print(" " + i);
//				try {
//					Thread.sleep(1000);// 1초간 일시정지 -> 1초 간격으로 작동
//				} catch (InterruptedException ie) {
//					ie.printStackTrace();
//				}
//			} // for
//		};// 람다식 익명객체 구현
//		
//		Thread th2 = new Thread(r2);
//		th2.start();//스레드 시작
	}
}
