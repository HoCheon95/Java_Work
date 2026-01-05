/*
 * 나바의 비트연산자
 */
public class ConvEx09 {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 20;
		int c = 0;
		
		c = a & b;
		System.out.println(a + " & " + b + " : " + c);	//4
		
		c = a | b;
		System.out.println(a + " | " + b + " : " + c);	//28
		
		c = a ^ b;
		System.out.println(a + " ^ " + b + " : " + c);	//24
		
		c = ~a;	//비트 전환 -> 0이면 1, 1이면 0
		System.out.println("~a : " + c); //-13

	}

}
