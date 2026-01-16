/*
 * java.io 입출력 패키지의 API인 InputStream, OutputStream 를 활용해서 입력받은 문자가 영문 단일소문자
 * 'x'이거나 단일 대문자 'X'이면 while 반복문을 중단한다.
 */

import java.io.InputStream;
import java.io.OutputStream;

public class IoEx03 {

	public static void main(String[] args) {
		
		int data = 0;
		InputStream myIn = System.in;
		OutputStream myOut = System.out;
		
		System.out.print("도시이름 입력 : ");
		
		try {
			while((data = myIn.read()) != -1) {
				if(data == 'x' || data == 'X') {// ||논리합에서 앞부분 data == 'x'가 true 이면
					// 무조건 결과값은 참이기 때문에 뒷부분 같다 연산은 수행안한다. 보통 영문소문자 입력확율이 
					// 더 높기 때문에 앞부분에 위치시킨다. 보다더 효율적인 연산 수행이다.
					break;
				}
				myOut.write((char)data);
			}
		}catch(Exception e) {e.printStackTrace();}

	}

}
