/*
 * 객체 직렬화를 위해서 설계한 Customer.java를 활용해서 객체단위로 읽어오기
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IoEx11 {

	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("./src/output.txt");
			//생성자 인자값으로 주어진 파일 경로 파일로 부터 바이트 단위로 읽어오기 위한 fis 객체 생성
			ObjectInputStream ois = new ObjectInputStream(fis);
			Customer cus = (Customer)ois.readObject();//객체단위로 읽어오기
			System.out.println("ID \t name \t age \t height");
			System.out.println("----------------------------");
			System.out.println(cus);
		}catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}

}
