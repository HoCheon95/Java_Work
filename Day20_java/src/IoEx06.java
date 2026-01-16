/*
 * FileOutputStream API 특징)
 *  생성자 인자값으로 주어진 파일 객체나 파일 경로의 파일에 바이트 단위로 데이터를 기록해 준다.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoEx06 {

	public static void main(String[] args) {
		
		int data = 0;
		System.out.print("파일에 저장할 도시이름을 영어로 입력 : ");
		
		try {
			File f = new File("./src/result.txt");
			
			FileOutputStream fos = new FileOutputStream(f);
			
			while((data = System.in.read()) != -1) {
				fos.write((char)data);//생성된 result.txt에 영문도시이름을 기록
			}
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}

	}

}
