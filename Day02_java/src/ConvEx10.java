/*
 * 비트 단위 쉬프트 연산자(shift : 비트를 왼쪽/오른쪽 이동)
 * 
 */
public class ConvEx10 {

	public static void main(String[] args) {
		
		byte x = 15;
		
		System.out.println("15 << 2 : " + (x << 2));	//60  15 -> 000011 / 00111100 = 60
		System.out.println("15 >> 2 : " + (x >> 2));	//3	  15 -> 000011 / 00000011 = 3

	}

}
