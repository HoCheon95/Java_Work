/*
 * InputStreamReader 와 BufferedReader 입출력 API 특징) ***
 *  1. InputStreamReader 는 읽어들인 바이트를 문자스트림으로 변환해 준다.
 *  2. BufferedReader 는 읽어들인 문자를 버퍼링 즉 임시메모리에 저장했다가 한줄 끝까지 한꺼번에 효율적으로 읽어들인다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoEx08 {

	public static void main(String[] args) {
		
		String fileName;
		InputStreamReader myIn = new InputStreamReader(System.in);
		BufferedReader keyBr = new BufferedReader(myIn);
		
		try {
			System.out.print("파일 이름 입력 : ");
			fileName = keyBr.readLine();//한줄 끝까지 문자열로 읽어들임
			System.out.println(fileName);
		}catch(IOException ie) {ie.printStackTrace();}
		finally {
			try {
				if(keyBr != null)keyBr.close();
				if(myIn != null)myIn.close();
			}catch(Exception e) {e.printStackTrace();}
		}
	}

}
