/*
 * 첫번째 멀티스(쓰)레드 생성법)
 *  1. Thread 클래스를 상속하는 법
 *  2. run() 메서드를 오버라이딩 해서 멀티스레드 문장 구현한다.
 *  3. Thread 클래스를 상속받은 자손클래스에서 스레드 문장을 구현하면 기능이 간단한 멀티스레드 프로그램을 만들때는 좋지만,
 *     보다 더 복잡한 멀티스레드 프로그램을 만들 때는 불리하다.
 *     단점으로 하나의 부모로 부터만 단일상속만 가능하다는 것이다.
 */

class Thread01 extends Thread {

	public Thread01(String name) {
		super(name);// 부모클래스 오버로딩 된 생성자를 호출하면서 스레드 이름을 반환
	}// 생성자 오버로딩

	@Override
	public void run() {
		for (int num = 1; num <= 5; num++) {
			for (int k = 1; k < 100000000; k++)
				; // 멀티스레드가 구현될 시간적 여유를 둔다.
			System.out.println(getName() + " : " + num);// getName() 메서드는 스레드 이름을 반환
		}
	}// 멀티스레드 문장구현

}

public class ThreadEx01 {

	public static void main(String[] args) {

		Thread01 th01 = new Thread01("첫번쨰 스레드");// 매개변수 한개짜리 오버로딩 된 생성자 호출
		Thread01 th02 = new Thread01("두번째 스레드");
		th01.start();
		// 멀티스레드가 시작되고 실행대기 상태로 있다가 자기 차례가 되면 run() 메서드를 자동호출해서 스레드 실행상태가 된다.
		th02.start();

	}

}
