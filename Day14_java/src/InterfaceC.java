/*
 * 비봉인 부모 인터페이스 InterfaceB 를 상속받은 자손 인터페이스 InterfaceC
 */
public interface InterfaceC extends InterfaceB {
	void methodC();//추상메서드 정의 -> public abstract 키워드가 생략됨.
}
