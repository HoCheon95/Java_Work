/*
 * Math 클래스 하위의 내장 정적메서드를 사용해서 두 수중 최대값과 최소값을 구해보고, static final로 선언된 정적 내장
 * 상수 활용해서 원주율을 구해 본다. 원의 면적 = 반지름 * 반지름 * 원주율;
 */
public class ConsEx07 {

	public static void main(String[] args) {
		
		int a = 40, b = 30, c = 10, r = 5;
		
		int result = 0;
		result = Math.max(a, b); // max() 내장 정적메서드는 인자값으로 주어진 두 수중 최대값을 구한다.
		System.out.println(a + "와 " + b + "값 중에서 더 큰값(최대값) = " + result);
		
		result = Math.min(b, c); // min() 내장 정적메서드는 인자값으로 주어진 두 수중 최소값을 구한다.
		System.out.println(a + "와 " + b + "값 중에서 더 작은값(최소값) = " + result);
		
		System.out.println("원주율 값 = " + Math.PI);
		
		double area = 0.0; // 원의 면적
		area = r * r * Math.PI; // 원의 면적 = 반지름 * 반지름 * 원주율;
		System.out.println("반지름이 " + r + "인 원의 면적 = " + area);

	}

}
