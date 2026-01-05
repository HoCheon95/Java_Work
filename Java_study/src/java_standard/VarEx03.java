package java_standard;

public class VarEx03 {

	public static void main(String[] args) {
		
		String name = "Ja" + "va";		//Java
		String str = name + 8.0;		//Java8.0
		
		System.out.println(name);		//Java
		System.out.println(str);		//Java8.0
		System.out.println(7 + " ");	//7 
		System.out.println(" " + 7);	// 7
		System.out.println(7 + "");		//7
		System.out.println("" + 7);		//7
		System.out.println("" + "");	//
		System.out.println(7 + 7 + "");	//14 | 7 + 7 = 14 + ""
		System.out.println("" + 7 + 7);	//77 | "7" + 7 = "7" + "7" = "77"

	}

}
