/*
 * 자바의 확장된 복합 대입연산자 종류)
 * a += 10은 a = a+10과 같은 기능을 한다. -> 10 씩 증가
 * a -= 3은 a = a-3과 같은 기능을 한다. -> 3씩 감소
 */
public class ConvEx08 {

	public static void main(String[] args) {
		
		int a = 10;
		a = a+10;	//20이 대입 저장됨
		System.out.println("a = " + a);
		
		a -= 2;	//2 감소 -> 18이 저장됨
		System.out.printf("a = %d\n", a);
		
		a -= 1;	//1 감소 -> 17이 저장됨
		System.out.println("a = " + a);
		
		/*
		 * 자바의 증감(증가/감소) 연산자 종류)
		 * ++i(선행증가 -> 먼저 1증가), i++(후행증가 -> 나중에 1증가), --i(선행감소 -> 먼저 1감소), i--(후행감소 -> 나중에 1감소)
		 * 
		 * 참고로 i++은 복합대입 연산자인 i+=1과 같은 기능을 한다. 마찬가지로 i--는 i-=1과 기능이 같다.
		 */
		
		a = 10;
		int b = 10;
		++a;	//선행 1증가
		System.out.println("a = " + a);	//11
		
		int c = b++;	//먼저 10을 좌측 c변수에 저장하고 나중에 1증가
		System.out.println("c = " + c + ", b = " + b);
		
		System.out.println(a++);	//먼저 a변수가 11을 출력하고 나중에 1증가
		System.out.println("a = " + a);	//12

	}

}
