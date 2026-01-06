/*
 * 인터페이스 오는 모든 변수는 public static final 로 인식되는 정적상수만 올 수 있다.
 */

interface IColor06 {
	int RED = 1;// public static final 이 생략된 정적상수 RED

	public static final int ORANGE = 2;
	int BLUE = 3;

	void setColor(int color);// public abstract 가 생략된 추상메서드

	public abstract int getColor();// 추상메서드

}

abstract class AbsColor06 implements IColor06 {// 추상클래스 상속
	int color = ORANGE;// 추상클래스에 일반 변수가 올 수 있따. 2가 저장됨

	@Override
	public void setColor(int color) {
		this.color = color;
	}

}

class SubClass06 extends AbsColor06 {

	@Override
	public int getColor() {
		return color;
	}

}

public class InterEx06 {

	public static void main(String[] args) {

		SubClass06 sub = new SubClass06();
		sub.setColor(IColor06.RED);
		System.out.println(sub.getColor());// 1

	}

}
