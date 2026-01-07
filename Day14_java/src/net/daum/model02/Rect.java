package net.daum.model02;

import net.daum.model01.IShapeClass;

public class Rect implements IShapeClass {

	@Override
	public void draw() {
		System.out.println("사각형을 그린다.");
	}

}
