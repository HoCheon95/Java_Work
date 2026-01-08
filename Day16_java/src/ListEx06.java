/*
 * java.util 패키지의 컬렉션 클래스 Stack 의 특징)
 *  1. 자바 1버전(jdk 1.0)에서 추가된 컬렉션 클래스이다.
 *  2. 입구와 출구가 같은 구조라서 가장 먼저 입력된 데이터가 가장 나중에 출력된다.(First Input Last Output: FILO)
 *  3. 가장 나중에 입력된 것이 가장 먼저 나가는 구조이다(Last Input First Output: LIFO)
 */

import java.util.Stack;

public class ListEx06 {

	public static void main(String[] args) {
		
		Stack myStack = new Stack();
		
		myStack.push("1-Java");//push()메서드는 스택의 맨위에 원소값을 추가한다.
		myStack.push("2-Oracle");
		myStack.push("3-Html과 css");
		
		while(!myStack.isEmpty()){//스택이 비어 있지 않을 동안 반복 -> 비어 있지 않다면 참
			System.out.println(myStack.pop());
			/*
			 * pop() 메서드는 스택 맨 위의 원소를 제거하면서 반환한다.
			 * 따라서 입력된 값 역순으로 출력된다.
			 */
		}

	}

}
