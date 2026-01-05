import net.daum.model01.ShapeClass;
import net.daum.model02.Circ;
import net.daum.model02.Rect;
import net.daum.model02.Tria;

public class AbsEx06 {

	public static void main(String[] args) {

		ShapeClass[] arr = new ShapeClass[3];// 배열크기가 3인 arr 객체 배열 생성
		arr[0] = new Circ();// 업캐스팅
		arr[1] = new Rect();
		arr[2] = new Tria();

		for (int i = 0; i < arr.length; i++) {
			arr[i].draw();//업캐스팅 이후 오버라이딩 한 메서드 호출
		}
		
		System.out.println("\n ===================== \n");
		
		/*
		 * 문제)자바 5버전에서 추가된 향상된 확장 for 반복문을 사용해서 배열값을 읽어온 다음 오버라이딩 한 메서드를 호출 해 본다.
		 */
		
		for(ShapeClass k : arr) {
			k.draw();
		}
	}

}
