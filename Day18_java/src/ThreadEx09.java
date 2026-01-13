/*
 * 멀티스레드의 스케줄링 메서드 중에서 wait(), notify() 메서드에 관한 실습 예제
 */

import java.util.ArrayList;

class Table{
	String[] dishNames = {"donut", "donut", "burger"};//음식 재료
	final int MAX_FOOD = 6;//테이블에 추가할 수 있는 최대 음식개수
	private ArrayList<String> dishes = new ArrayList<>();//음식을 추가할 컬렉션 제네릭 객체생성 문자열만 저장 가능
	
	//동기화 된 음식추가
	public synchronized void add(String dish) {
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();//현재 실행중인 스레드 이름 반환
			System.out.println(name + " is waiting");
			
			try {
				wait();//요리사 스레드를 기다리게 한다.
				Thread.sleep(500);
			}catch(InterruptedException ie){}
		}//while
		
		dishes.add(dish);//음식추가
		notify();//기다리고 있는 손님스레드를 깨워서 음식을 식사하게 한다.
		System.out.println("추가한 음식목록 : " + dishes.toString());
		
	}//add()
	
	//동기화 된 음식제거
	public void remove(String dishName) {
		synchronized (this) {
			String name = Thread.currentThread().getName();
					
			while(dishes.size() == 0) {//테이블에 음식이 없는 경우
				System.out.println(name + " is wawiting");
				
				try {
					wait();//손님 스레드를 기다리게 한다.
					Thread.sleep(500);
				}catch(InterruptedException ie) {}
			}//while
			
			while(true) {
				for(int i=0; i<dishes.size(); i++) {
					if(dishName.equals(dishes.get(i))) {//음식물이 같다면
						dishes.remove(i);//음식 제거 -> 식사
						notify();//요리사 스레드를 깨운다.
						return;//종료
					}
				}//for
				
				try {
					System.out.println(name + " is waiting");
					wait();//원하는 음식이 없다면 손님스레드를 기다리게 한다.
					Thread.sleep(500);
				}catch(InterruptedException ie) {}
			}//while
		}//특정영역 동기화
	}//remove()
	
    public int dishNum(){
        return dishNames.length;//배열크기 반환
    }
}//Table class

//소비자 스레드
class Customer implements Runnable{
	private Table table;
	private String food;
	
	public Customer(Table table, String food) {
		this.table=table;
		this.food=food;
	}//생성자 오버로딩
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException ie) {}
			String name = Thread.currentThread().getName();
			
			table.remove(food);//테이블로 부터 음식을 식사해서 제거
			System.out.println(name + " ate a " + food);
		}
	}//스레드 문장 구현
}//Customer class

//요리사 스레드
class Cook implements Runnable{
	private Table table;
	
	public Cook(Table table) {
		this.table=table;
	}

	@Override
	public void run() {
		while(true) {
			int idx = (int)(Math.random()*table.dishNum());
			/* random()은 0.0이상 1.0미만
			   사이 실수숫자 난수발생 -> *3하면 0.0이상 3.0미만 사이 실수숫자 난수발생 ->
			   (int)로 형변환하면 0이상 3미만 즉 0,1,2 중 임의의 정수숫자난수 발생
			*/
			table.add(table.dishNames[idx]);//테이블에 음식 추가
			
			try {
				Thread.sleep(10);
			}catch(InterruptedException ie){}
		}//무한루프문
	}//run()
}//Cook class
public class ThreadEx09 {

	public static void main(String[] args) throws Exception {
		Table table = new Table();
		
		new Thread(new Cook(table), "COOK01").start();//요리사 스레드 시작 
		new Thread(new Customer(table, "donut"), "CUST01").start();//손님 스레드 시작
		new Thread(new Customer(table,"burger"), "CUST02").start();
		
		Thread.sleep(2000);// 2초뒤에 메인스레드 종료
		System.exit(0);//정상적인 종료
	}

}
