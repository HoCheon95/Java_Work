package 람다식;

/*
 * MyFunInterface 함수형 인터페이스를 활용해서 람다식을 작성한 소스 예)
 */
public class MyFunInterfaceExample {

	public static void main(String[] args) {
		
		MyFunInterface fi;
		
		fi = () -> {//오버라이딩 한 메서드는 생략됨.
			String result = "method() 호출";
			System.out.println(result);
		};//첫번째 람다식
		
		fi.method();
		
		fi = () -> {System.out.println("method() 호출2");};
		fi.method();
		
		fi = () -> System.out.println("method() 호출3"); //{}; 이 생략됨
		fi.method();
	}

}
