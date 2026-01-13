/*
 * 자바 스윙 GUI를 사용한 멀티스레드 예)
 *  카운터 다운과 스윙 GUI 입력폼 실행이 멀티스레드에 의해서 동시작업
 */

import javax.swing.JOptionPane;

class Thread06 extends Thread{

	@Override
	public void run() {
		for(int i=10; i>=1; i--) {
			System.out.println(i);
			
			try {
				sleep(1000);//1초간 일시정지 -> 1초 간격으로 카운터 다운이 이루어진다.
			}catch(InterruptedException ie) {}
		}//for
	}//스레드 문장 구현
}
public class ThreadEx06 {

	public static void main(String[] args) {
		
		Thread06 th = new Thread06();
		th.start();//멀티스레드 시작
		
		
		String name = JOptionPane.showInputDialog("이름 입력 >>");
		System.out.println("입력한 이름 : " + name);

	}

}
