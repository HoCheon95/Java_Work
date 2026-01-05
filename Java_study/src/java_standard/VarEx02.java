package java_standard;

public class VarEx02 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		int tmp = 0;
		
		System.out.println("x : " + x + " y : " + y);	//x : 10, y : 20
		
		tmp = x;	// 10
		x = y;		// 20
		y = tmp;	// 10
		
		System.out.println("x : " + x + " y : " + y);	//x : 20, y : 10

	}

}
