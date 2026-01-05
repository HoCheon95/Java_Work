import net.daum.model01.ShapeClass;
import net.daum.model02.Circ;
import net.daum.model02.Rect;
import net.daum.model02.Tria;

public class AbsEx05 {

	public static void main(String[] args) {
		
		Circ c = new Circ();
		Rect r = new Rect();
		Tria t = new Tria();
		
		c.draw();//오버라이딩 한 메서드 호출
		r.draw();
		t.draw();
		System.out.println("============================");
		
		ShapeClass ref;//부모추상클래스 타입으로 참조변수 ref 선언 -> 객체주소가 저장 안된 참조변수
		
		ref = new Circ();//업캐스팅
		ref.draw();//업캐스팅 이후 오버라이딩 한 메서드 호출
		
		ref = new Rect();
		ref.draw();
		
		ref = new Tria();
		ref.draw();
		System.out.println("============================");

	}

}
