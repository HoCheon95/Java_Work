/*
 * 13장.생성자.pdf No.20쪽 2번문제)
 * Product 클래스를 Product02 클래스로 변경해서 한다. 이 클래스에 생성자를 추가해 본다.(생성자 오버로딩)
 */

class Product02_sol {
	String name; // 상품이름
	int price; // 상품가격

	public Product02_sol() {
	}// 기본 생성자

	public Product02_sol(String name) {
		this(name, 500);// 같은 클래스내의 매개변수 2개짜리 오버로딩 된 생성자를 호출
	}

	public Product02_sol(int age) {
		this("커피", 800);
	}// 매개변수가 타입이 다른 생성자 오버로딩

	public Product02_sol(String name, int price) {
		this.name = name;
		this.price = price;
	}// 매개변수가 다른 생성자 오버로딩

	public void pr() {
		System.out.println(name + ", " + price);
	}// 사용자 정의 메서드

}// Product02_sol class

public class Ex13_02_sol {

	public static void main(String[] args) {
		Product02_sol p01 = new Product02_sol("물");
		Product02_sol p02 = new Product02_sol(800);
		Product02_sol p03 = new Product02_sol("웰치스", 700);
		p01.pr();
		p02.pr();
		p03.pr();

	}

}
