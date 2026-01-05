/*
 * 자바에서 생성자가 오버로딩이 안되었을 때는 컴파일러가 매개변수가 없는 기본생성자를 묵시적으로 제공한다. 하지만 생성자가
 * 오버로딩이 되면 기본생성자 묵시적 제공을 하지 않는다. 이런 경우 기본생성자를 호출하려다가 컴파일에러가 발생하는 예제소스 이다.
 */

class Data10{
	int value; //클래스 소속의 멤버변수(속성)중 인스턴스 변수
	
	//생성자 오버로딩이 되어서 기본생성자 묵시적 제공을 안함
	
	//Data10(){ } // 2. 해결방안 | 기본생성자를 호출해서 컴파일 에러 해결
	
	Data10(int value){
		this.value = value;
	}//매개변수 개수가 다른 생성자 오버로딩
	
	void pr() {
		System.out.printf("value = %d \n", value);
	}// 사용자 정의 메서드 pr()
}//Data10 class

public class ClassEx10 {

	public static void main(String[] args) {
		
		//new Data10(10).pr(); // 1. 해결방안 | 오버로딩 생성자 호출 컴파일 에러 해결
		new Data10().pr();
		// new Data10();에 의해서 묵시적으로 제공되지 않는 기본생성자를 호출하려다가 컴파일 에러가 발생함

	}

}
