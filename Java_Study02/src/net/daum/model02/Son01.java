package net.daum.model02;

import net.daum.model01.ShapeInterface;

public class Son01 implements ShapeInterface {

	@Override
	public void draw() {
		System.out.println("첫번째 자손을 만든다.");
	}

}
