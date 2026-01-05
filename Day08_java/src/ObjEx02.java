/*
 * 매개변수 순서를 다르게 한 메서드 오버로딩
 */

class Mt02{
	// 첫번째 메서드 -> int, int, String
	public void print(int a, int b, String c) {
		System.out.println(a + " " + b + " " + c);
	}
	
	// 오버로딩 된 두번째 메서드 -> String, int, int
	public void print(String c, int a, int b) {
		System.out.println(c + " " + a + " " + b);
	}
}// Mt02 class
public class ObjEx02 {

	public static void main(String[] args) {
		
		Mt02 m02 = new Mt02();
		m02.print(100, 102, "java");
		m02.print("oracle", 100, 200);
		

	}

}
