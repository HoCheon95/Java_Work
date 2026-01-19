/*
 * 다중 사용자 접속을 네트워크 채팅서버 프로그램에서 받기 위해서는 멀티스레드 기능이 적용되어야 한다. 그러므로 멀티 스레드
 * 기능이 적용되어서 다중 사용자 접속을 받을 수 있는 네트워크 채팅서버 프로그램이다.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiEchoServerEx {
	ServerSocket server;//서버상에서만 필요하고 사용자 접속을 기다리기 위해서 필요한 클래스이다.
	static final int PORT = 7000;
	//서버상에서 TCP 포트번호를 지정함. 정적상수명은 관례적으로 영문대문자로 하고 선언과 동시에 초기화를 해야 한다.
	Socket child;//클라이언트와 통신하기 위해 필요한 소켓
	
	public MultiEchoServerEx() {
		try {
			server = new ServerSocket(PORT);//서버 소켓 객체 생성
		}catch(Exception e) {
			e.printStackTrace();
			System.exit(0);//프로그램 정상적인 종료
		}
		
		System.out.println("####### 다중 사용자접속을 기다리기 위한 멀티채팅 네트워크 서버 #######");
		System.out.println("멀티채팅서버는 사용자 접속을 항상 기다리고 있습니다.");
		
		while(true) {
			try{
				child = server.accept();
				//클라이언트(사용자) 접속이 이루어지면 서버상에서도 소켓이 생성(동시에 사용자 쪽에 서도 소켓이 생성되는 시점)
				
				//멀티스레드
				EchoServerThread childThread = new EchoServerThread(child);
				Thread th = new Thread(childThread);
				th.start();//멀티스레드 시작
				
			}catch(Exception e) {
				e.printStackTrace();
				System.exit(0);
			}
		}//무한루프문
	}//기본 생성자 

	public static void main(String[] args) {
		new MultiEchoServerEx();//기본 생성자 호출
	}

}//MultiEchoServerEx class

/*
 * 멀티스레드 -> 네트워크 채팅서버에서 다중 사용자 동시 접속을 받기 위해서 필요하다. 스레드에서 서버상에서 생성된 소켓을 관리 한다.
 */

class EchoServerThread implements Runnable{
	
	Socket child; //클라이언트(사용자)와 통신하기 위한 소켓
	
	InputStream is;
	ObjectInputStream ois;//입력 스트림
	
	OutputStream os;
	ObjectOutputStream oos;//출력 스트림
	
	String receiveData;//사용자로 부터 전송받은 데이터를 저장할 변수
	
	public EchoServerThread(Socket child) {
		this.child = child;
		
		try {
			System.out.println(child.getInetAddress() + "로 부터 연결 요청 받음.");
			
			is = child.getInputStream();
			ois = new ObjectInputStream(is);
			
			os = child.getOutputStream();
			oos = new ObjectOutputStream(oos);
		}catch(IOException ie) {ie.printStackTrace();}
	}//생성자
	
	
	@Override
	public void run() {
		try {
			while(true) {
				receiveData = (String)ois.readObject();//사용자로 부터 전송받은 메시지 저장
				System.out.println(child.getInetAddress() + "로 부터 받은 메시지 : " + receiveData);
				oos.writeObject(receiveData);//다시 사용자에게 전송
				oos.flush();//출력스트림을 비움
			}//무한루프
		}catch(Exception e) {
			System.out.println("사용자 강제 종료");
		}finally {
			try {
				if(oos != null) oos.close();
				if(os != null) os.close();
				if(ois != null) ois.close();
				if(is != null) is.close();
				if(is != null) child.close();
			}catch(IOException ie) {ie.printStackTrace();}
		}//finally
	}//스레드 문장 구현
}//EchoServerThread class
