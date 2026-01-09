/*
 * 제네릭 와일드 카드 3번째 문법형식)
 *  <? super Integer> 는 Integer 타입의 부모만 제네릭 타입간의 형변환을 제한적으로 허용한다.(하한 제한 와일드 카드)
 */

import java.util.Arrays;
import java.util.List;

public class ListEx16 {

	static void printList(List<? super Integer> list) {
		/*
		 * Integer 의 부모 타입(Number, Object)을 요소 타입으로 갖는 List 를 받을 수 있다. 
		 */
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			/*
			 * list의 정확한 타입을 확정할 수 없기 떄문에
			 * Object 타입으로 안전하게 받는다.
			 */
			System.out.print(" " + obj);// get(i) 메서드로 i번째 원소값을 가져온다.
		}
		System.out.println("\n ==================== \n");
	}

	public static void main(String[] args) {
		/*
		 * Integer 의 부모가 Number 의 부모가 Object
		 */
		Number[] arr = { 100, 200, 300 };
		Object[] arr02 = { 100.2, 200.3 };
		
		List<Number> li = Arrays.asList(arr);
		printList(li);// 같은 클래스내에서는 정적메서드 호출할 때 해당 클래스명 생략가능
		
		List<Object> li02 = Arrays.asList(arr02);
		ListEx16.printList(li02);

	}

}
