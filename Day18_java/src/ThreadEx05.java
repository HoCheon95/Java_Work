/*
 * 특정은행 Atm 계좌에서 입금, 출금과 같은 특정한 작업이 이루어 질때는 한번에 하나의 스레드에 의해서만 입/출금 작업이
 * 이루어 지도로고 synchronized 키워드로 동기화 즉 임계영역을 만들어 줘야 한다.
 */

class Atm{
	private int money;//계좌 잔액
	
	public Atm(int money) {
		this.money = money;//생성자 주된 기능인 클래스 소속 멤버변수 중 인스턴스 변수 초기화
	}//생성자 오버로딩
	
	//입금작업 동기화
	public synchronized void deposit(int amount, String name) {
		money += amount;// 잔액 + 입금액
		System.out.println(name + " 입금금액 : " + amount);
	}//deposit
	
	//출금작업 동기화
	public synchronized void withdraw(int amount, String name) {
		if((money - amount) > 0) {
			money -= amount; // 잔액 - 출금액
			System.out.println(name + " 출금금액 : " + amount);
		}else {
			System.out.println(name + " 잔액부족으로 출금못함");
		}//if ~ else
	}//withdraw()
	
	public void printMoney() {
		System.out.println("계좌잔액 : " + money);
	}
	
}//Atm 계좌 클래스

//AtmUser 스레드 클래스
class AtmUser extends Thread{
	boolean flag = false;//입금/출금 분기
	Atm obj;
	
	public AtmUser(Atm obj, String name) {
		super(name);//부모클래스 오버로딩 된 생성자를 호출하면서 스레드 이름 반환
		this.obj = obj;
	}//생성자 오버로딩

	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			try {
				sleep(500);//스레드 일시정지
			}catch(InterruptedException ie){}
			
			if(flag) {// == true가 생략됨
				obj.deposit((int)(Math.random()*10+2)*100, getName());
			}else {
				obj.withdraw((int)(Math.random()*10+2)*100, getName());
				/*
				 * random() 메서드는 0.0이상 1.0미만 사이 실수수자 난수발생 -> *10하면 0.0이상 10.0미만
				 * 사이 실수숫자 난수발생 -> +2하면 2.0이상 12.0미만 사이 실수숫자 난수발생 -> (int)로 형변환
				 * 하면 소수점이하는 버리고 2이상 12미만사이 정수수자 난수발생 -> *100하면 200이상 1200미만
				 * 즉 200부터 1100사이 정수숫자 난수로 출금작업. getName()메서드는 스레드 이름 반환
				 */
				obj.printMoney();//출금후 잔액 출력
			}//if ~ else
			
			flag = !flag;//false -> true, !true -> false
		}//for 
	}//멀티 스레드 문장구현
}//AtmUser class
public class ThreadEx05 {

	public static void main(String[] args) {
		Atm obj = new Atm(1000);//계좌 개설하면서 1000원 입금
		
		AtmUser user01 = new AtmUser(obj, "홍길동");
		AtmUser user02 = new AtmUser(obj, "이순신");
		AtmUser user03 = new AtmUser(obj, "신사임당");
		
		user01.start();//멀티스레드 시작
		user02.start();
		user03.start();
	}

}
