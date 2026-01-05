/* 12장. 메서드살피기.pdf No.20의 2번문제
 * 
 */

class Mp3{
	private String comp;	// 회사명
	private int size;		// 메모리 용량
	
	public String getComp() { // 값 반환 메서드 -> getter() 메서드
		return comp;
	}
	
	public void setComp(String new_comp) {	// 값 저장메서드 -> setter() 메서드 
		comp = new_comp;
	}
	
	public int getSize() { // 값 반환 메서드 -> getter() 메서드
		return size;
	}
	
	public void setSize(int new_size) { // 값 저장메서드 -> setter() 메서드
		size = new_size;
	}
	
}
public class Ex12_02 {
	public static void main(String[] args) {
		
		Mp3 m = new Mp3();
		m.setComp("갑을회사");
		m.setSize(8);
		
		System.out.println("회사명 : " + m.getComp());
		System.out.println("메모리 용량 : " + m.getSize() + "G");

	}
}
