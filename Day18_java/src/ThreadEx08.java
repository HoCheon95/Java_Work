/*
 * 출금작업과 같은 특정작업이 이루어 질때는 synchronized 키워드로 동기화를 처리해야 하는데 이를 하지 않아서
 * 출금 후 은행 잔고가 음의 정수가 나오는 예)
 */

class Account{
	private int balance = 10000;// 계좌 잔액
	
	//동기화를 처리 하지 않은 출금작업
	public void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie) {}
			
			balance -= money;
		}//if
	}//withdraw()
	
	public int getBalance() {
		return balance;
	}//계좌 잔액 반환
}//Account 계좌 클래스

class Thread08 implements Runnable{

	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random()* 3 + 1) *100;
			/*
			 * random()은 0.0이상 1.0미만 사이 실수숫자 난수발생 -> *3 하면 0.0이상 3.0미만 사이 실수숫자
			 * 난수 발생 -> +1하면 1.0이상 4.0미만 사이 실수숫자 난수 발생 -> (int)형변환 하면 소수점이하는 버리고
			 * 1이상 4미만 사이 정수숫자 난수발생 -> *100 하면 100이상 400미만 즉 100, 200, 300 중 하나
			 * 정수 숫자 난수가 임의의 출금액이 된다.
			 */
			acc.withdraw(money);//출금
			System.out.println("출금후 잔액 : " + acc.getBalance());
		}//while
	}
	
}//Thread08 스레드 클래스
public class ThreadEx08 {

	public static void main(String[] args) {
		
		Thread08 th = new Thread08();
		new Thread(th).start();//멀티스레드 시작
		new Thread(th).start();

	}

}
