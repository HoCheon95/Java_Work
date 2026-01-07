/*
 * 봉인된/비봉인된 인터페이스를 활용한 소스 예)
 * 
 */
public class InterEx12 {

	public static void main(String[] args) {
		
		ImpClass imp = new ImpClass();
		
		
		InterfaceA ia = imp;//최상위 부모 인터페이스 타입으로 업캐스팅 함
		ia.methodA();//업캐스팅 이후 오버라이딩 한 메서드 호출
		System.out.println("\n ================= \n");
		
		InterfaceB ib = imp;
		ib.methodA();
		ib.methodB();
		System.out.println("\n ================= \n");
		
		InterfaceC ic = imp;
		ic.methodA();
		ic.methodB();
		ic.methodB();

	}

}
