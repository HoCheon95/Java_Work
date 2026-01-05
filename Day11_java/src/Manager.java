/*
 * non-sealed 키워드로 비봉인 자손 클래스 Manager 로 정의했기 때문에 또 다른 자손 클래스 생성이 가능하다.
 */

public non-sealed class Manager extends Person {

	@Override
	public void work() {
		System.out.println("생산 관리를 합니다.");
	}

}
