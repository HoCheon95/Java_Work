/*
 * final 메서드 특징)
 *  메서드를 final로 선언하면 자손에서 더 이상 오버라이딩을 할 수 없다.
 *  
 */

class FinalMethod{
	public final void p() {
		System.out.println("파이널 메서드 정의");
	}
}

class FinalChild extends FinalMethod{
	@Override
	public void p() {
		// final 메서드 p()는 자손에서 오버라이딩을 안된다.
	}
}
public class AbsEx09 {

	public static void main(String[] args) {

	}

}
