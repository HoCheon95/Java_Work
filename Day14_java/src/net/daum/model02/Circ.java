package net.daum.model02;

import net.daum.model01.IShapeClass;

public class Circ implements IShapeClass {

	@Override
	public void draw() {
		System.out.println("타원을 그린다.");
	}
	
}
