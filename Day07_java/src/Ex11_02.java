/*
 * 11장. 클래스와 객체.pdf No.14쪽 2번 문제)
 * 
 * 1.속성으로 자판기에서 취급하는 제품의정보, 가격을 저장하는 변수와 이를 다루기위한 메서드를 갖는 자판기 클래스를 선언하고 다음과 같은 결과가 나오도록 객체(p) 생성 후 메소드를 호출하시오.
(Ex11_02.java) 
출력 : 자판기 => 제품목록 : 커피150원, 비타500 500원

 */

class Product {
	private String name; // 제품명
	private int price; // 제품가겨

	public void setName(String new_name) {
		name = new_name;
	}// 값 저장 메서드 -> setter()메서드 정의

	public String getName() {
		return name;
	}// 값 반환 메서드 -> getter()메서드 정의

	public void setPrice(int new_price) {
		price = new_price;
	}

	public int getPrice() {
		return price;
	}
}

public class Ex11_02 {

	public static void main(String[] args) {
		Product p01 = new Product();
		p01.setName("커피");
		p01.setPrice(150);
		System.out.println("자판기 => 제품목록 : ");
		System.out.println(p01.getName() + " " + p01.getPrice() + "원, ");
		
		Product p02 = new Product();
		p02.setName("비타500");
		p02.setPrice(500);
		System.out.println(p02.getName() + " " + p02.getPrice() + "원");
	}

}
