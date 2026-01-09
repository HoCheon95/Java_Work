/*
 * 제네릭 클래스
 */

class GenericClass<T>{// <T> 정해지지 않은 가상의 제네릭 T타입
	
	private T value;
	
	public T getValue() {
		return value;
	}//값반환 메서드 -> getter() 메서드
	
	public void setValue(T value) {
		this.value = value;
	}// 값저장 메서드 -> setter() 메서드
	
	
}
public class ListEx12 {

	public static void main(String[] args) {
		
		GenericClass<Integer> obj01 = new GenericClass<Integer>();
		//정수 숫자만 저장 가능한 컬렉션 제네릭 객채 obj01 생성
		
		obj01.setValue(100);
		System.out.println("반환된 정수숫자값 = " + obj01.getValue());
		
		GenericClass<Boolean> obj02 = new GenericClass<>();
		//자바 7부터는 뒷부분<>제네릭 타입은 생략가능
		obj02.setValue(true);
		System.out.println("반환되는 boolean 타입 = " + obj02.getValue());
		
		GenericClass<Double> obj03 = new GenericClass<>();
		obj03.setValue(100.7);
		System.out.println("반환되는 실수숫자값 = " + obj03.getValue());

	}

}
