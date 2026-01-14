package 람다식;

/*
 * MyFunInterface3 함수형 인터페이스를 활용해서 람다식을 작성한 소스예)
 */
public class MyFunInterfaceExample3 {

	public static void main(String[] args) {
		
		MyFunInterface3 fi;
		
		fi = (a,b) -> {
			int result = a + b;
			return result;
		};
		
		System.out.println("10 + 10 = " + fi.method(10, 10));
		
		fi = (a, b) -> a * b;//{}와 return 생략
		System.out.println("10 * 10 = " + fi.method(10, 10));
		
		
		fi = (a,b) -> getSum(5, 5);
		System.out.printf("5 + 5 = %d \n", fi.method(5, 5));
		
	}
	
	public static int getSum(int a, int b) {
		return a+b;
	}//정적메서드 정의

}
