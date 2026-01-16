/*
 * 객체 직렬화를 위해서 설계한 Customer.java 를 활용해서 객체단위로 기록해 본다.
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IoEx10 {

	public static void main(String[] args) {
		
		Customer cus = new Customer(7,"홍길동",23,171.7);
		//매개변수 4개짜리 오버로딩 된 생성자를 호출해서 멤버변수 초기화
		
		try {
			System.out.println(cus.toString());
			FileOutputStream fos = new FileOutputStream("./src/output.txt");
			//생성자 인자값으로 주어진 파일경로의 파일에 바이트 단위로 기록하기 위한 fos객체 생성
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(cus); //객체단위로 기록
			
			oos.close(); fos.close();
		}catch(IOException ie) {ie.printStackTrace();}

	}

}
