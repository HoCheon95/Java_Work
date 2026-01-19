package net.daum.model02;

import net.daum.model01.ShapeInterface;

public class Son02 implements ShapeInterface {

	@Override
	public void draw() {
		System.out.println("두번째 자손을 만든다.");
	}

}
