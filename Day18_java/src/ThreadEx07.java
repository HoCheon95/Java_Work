/*
 * 자바 멀티스레드 스케줄링 메서드 중 sleep()과 interrupt() 등에 대해서 살펴본다.
 * 이 스케줄링 메서드를 잘 활용해서 catch() {} 블록내에서 다시 interrupt() 메서드를 호출하면 
 * 스레드의 인터럽트 된 상태를 다시 true 로 초기화해서 카운터 다운을 종료시킬 수 있다.
 */

import javax.swing.JOptionPane;

class Thread07 extends Thread{

	@Override
	public void run() {
		int i = 10;
		
		while(i != 0 && !isInterrupted()) {
			/*
			 * isInterrupted() 메서드는 쓰레드의 인터럽트 된 상태를 boolean 타입으로 반환
			 */
			
			System.out.println(i--);//1씩 감소하면서 1초간격으로 카운터 다운
			
			try {
				Thread.sleep(1000);//1초간 일시정지 -> 1초 간격으로 작동
			}catch(InterruptedException ie) {
				/*
				 * interrupt() 메서드가 호출되면 InterruptedException 예외오류가 발생하면서
				 * 스레드의 인터럽트 된 상태를 다시 false 로 초기화한다.
				 */
				interrupt(); //interrupt() 메서드를 호출하면 스레드의 인터럽트 된 상태가 false -> true 초기화
			}
		}//while
		System.out.println("카운터 다운 종료!");
	}//스레드 문장 구현
}//Thread07 class

public class ThreadEx07 {

	public static void main(String[] args) {
		
		Thread07 th = new Thread07();
		th.start();//멀티스레드 시작
		
		String cityName = JOptionPane.showInputDialog("도시이름 입력 : ");
		System.out.println("입력한 도시이름 : " + cityName);
		th.interrupt();//interrupt()메서드를 호출하면 스레드의 인터럽트 된 상태를 false 에서 true 로 초기화
		System.out.println("인터럽트 된 상태 boolean 타입 : " + th.isInterrupted());

	}

}
