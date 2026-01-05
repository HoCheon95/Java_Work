class Point2D extends Object{ // extends Object은 묵시적 생략 가능
	public int getX() { // 값 반환 getter() 메서드 정의 || setter getter 단축키 알트 ins
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	private int x;
	private int y;
	
}

class Point3D extends Point2D{
	private int z;
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
}
public class ExtendEx02 {

	public static void main(String[] args) {
		
		Point3D pt = new Point3D();
		pt.setX(100);
		pt.setY(200);
		pt.setZ(300);
		
        System.out.println("x 좌표값: " + pt.getX());  // 상속받아서 사용
        System.out.println("y 좌표값: " + pt.getY());  // 상속받아서 사용
        System.out.println("z 좌표값: " + pt.getZ());		
		
	}

}
