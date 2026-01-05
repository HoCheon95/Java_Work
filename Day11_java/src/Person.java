/* 자바 15버전에서 도입된 봉인된 클래스 문법 특징)
 *  1. 무분별한 자손 클래스 생성을 방지하기 위해서 봉인된(sealed) 클래스가 도입되었다.
 *  2. 봉인된 클래스 Person을 정의하면 permits 키워드 다음에 오는 자손클래스를 따로 정의해야 한다.
 *  즉 psermits 다음에 오는 Employee, Manager만 자손클래스로 정의할 수 있고, 그 의외의 자손클래스는 생성할 수 없다.
 * 
 */
public sealed class Person permits Employee, Manager{
	
	private String name;
	
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다.");
	}

}
