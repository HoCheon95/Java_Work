/*
 * 두번째 제네릭 와일드 카드 문법형식)
 *  <?> 모든 객체타입 배치가 가능하다.
 */

import java.util.Arrays;
import java.util.List;

public class ListEx15 {
	
	static void printList(List<?> list){
		/*
		 * List<?> 에서 <?>는 모든 객체타입을 허용한다.
		 * 요소의 타입을 확정할 수 없으므로 읽을 때는 Object 로만 안전하게 읽을 수 있다.
		 */
		for(Object obj:list) {
			/*
			 * list 의 제네릭 타입이 정해져 있지 않아서 요소의 구체 타입을 알수 없기 때문에
			 * Object 타입으로만 안전하게 받을 수 있다.
			 */
			System.out.print(" " + obj);
		}
		System.out.println("\n ==================== \n");
	}

	public static void main(String[] args) {
		
		List<Integer> li01 = Arrays.asList(10, 20, 30);// Arrays.asList() 정적메서드는
		                                               // 배열을 컬렉션 List 로 변환
		printList(li01);
		
		List<String> li02 = Arrays.asList("seoul", "daejeon");
		printList(li02);
		

	}

}
