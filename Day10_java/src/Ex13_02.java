/*
 * 13장.생성자.pdf No.20쪽 2번문제)
 * Product 클래스를 Product02 클래스로 변경해서 한다. 이 클래스에 생성자를 추가해 본다.(생성자 오버로딩)
 */

class Product02{
	String name;
	int price;
	
	Product02(){
		
	}
	
	Product02(String name){
		this.name = name;
		this.price = 800;
	}
	
	Product02(int price){
		this.price = price;
		this.name = "물";
	}
	
	Product02(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	
}
public class Ex13_02 {

	public static void main(String[] args) {
		
		Product02 p1 = new Product02("웰치스", 700);
		Product02 p2 = new Product02("커피");
		Product02 p3 = new Product02(500);
		Product02 p4 = new Product02();
		System.out.println(p1.name + "," + p1.price);
		System.out.println(p2.name + "," + p2.price);
		System.out.println(p3.name + "," + p3.price);

	}

}
