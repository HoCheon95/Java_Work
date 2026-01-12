/*
 * 자바 GUI는 그래픽 사용자 인터페이스(Graphical User Interface)의 약자이다. 즉 자바언어로 그림그리는 것을 말한다.
 * 자바언어로 그림그리는 것은 AWT, Swing(스윙), FX가 있다. 여기서는 AWT를 사용해서 프레임윈도우 창을 만들고 여기에 멀티스레드 
 * 왼쪽에서 부터 오른쪽으로 오렌지색 글자가 항상 지나가게 만들어 본다.
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Frame04 extends Frame implements Runnable{

	int x = 0; //프레임 윈도우 x좌표
	
	public Frame04() {
		this.setBackground(new Color(0,0,0));//this.은 생략가능. this 는 내 자신을 AWT프레임윈도우 우창을 가리킴.
		// 프레임 윈도우 배경색을 검정으로 처리
		setSize(370,150);//프레임 윈도우 폭과 높이를 지정
		setVisible(true);//프레임 윈도우를 항상 나오게 한다.
		
		addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();//자원해제
				System.exit(0);//현재 프로그램(열려진 AWT 프레임 윈도우 창)
			}//현재 프레임 윈도우 닫기할 떄 호출			
		});//프레임 윈도우 이벤트 등록메서드 -> 익명클래스 즉 내부무명클래스(외부클래스$번호.class -> Frame04$1.class)로 컴파일된다.
	}//생성자
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);//스레드 일시정지
			}catch(InterruptedException ie) {}
			repaint();//자바 GUI에서 컴포넌트 객체를 다시 그리고자 할 때 사용한다.
			
			x = x + 5;
		}//무한루프문
	}//멀티스레드 문장 구현

	@Override
	public void paint(Graphics g) {
		Dimension d;//Dimension 은 폭과 높이를 가지는 클래스
		d=getSize();//프레임 창의 크기를 구해서 Dimension 객체 반환
		g.setColor(Color.orange);//글자색을 오렌지색으로 설정
		g.drawString("java", x, d.height/2);//프레임 윈도우 중간높이에 java문자 출력하고 스레드에 의해서 x좌표값은 항상 변경
		
		if(x > d.width) {//프레임 폭을 벗어나면
			x=0;//다시 왼쪽 처음부터 반복
		}
	}//무엇을 그리고자 할 때 이 메서드를 오버라이딩
	
}
public class ThreadEx04 {

	public static void main(String[] args) {
		
		Frame04 f = new Frame04();
		Thread th = new Thread(f);
		th.start();

	}

}
