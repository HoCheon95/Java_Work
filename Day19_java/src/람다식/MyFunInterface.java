package 람다식;

/*
 * @FunctionalInterface 애노테이션 특징)
 *  1. 이 애노테이션은 자바8 버전에서 추가 되었고, 람다식을 위한 함수형 인터페이스이다. 함수형 인터페이스에는 추상메서드가
 *  딱 하나만 올 수 있다.
 *  2. 이 애노테이션이 없더라도 인터페이스에 추상메서드가 하나만 온다면 람다식을 위한 함수형 인터페이스로 사용 가능하다.
 *  3. 이 애노테이션이 추가된 인터페이스를 함수형 인터페이스라고 한다.
 */

@FunctionalInterface
public interface MyFunInterface {
	
	void method();//매개변수와 리턴값이 없는 추상메서드

}
