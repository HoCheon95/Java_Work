/*
 * java.tuil 패키지의 Queue 컬렉션 인터페이스를 구현 상속한 컬렉션 클래스 LinkedList 특징)
 *  1. 입구와 출구가 다르기 때문에 가장 먼저 입력된 자료가 가장 먼저 나가는 구조이다.(First Input First Output: FIFO)
 */

import java.util.LinkedList;
import java.util.Queue;

public class ListEx07 {

	public static void main(String[] args) {
		
		Queue myQue = new LinkedList();//업캐스팅 하면서 myQue 컬렉션 객체 생성
		
		myQue.offer("1-Java");//offer()메서드로 큐에 원소값 추가
		myQue.offer("2-Oracle");
		myQue.offer("3-CSS");
		
		while(myQue.peek() != null) {//큐가 비어있지 않다면 반복
			System.out.println(myQue.poll());// poll() 메서드로 큐에서 데이터를 꺼내고 제거,
											 // 큐의 맨 앞 원소를 반환하고 제거
		}

	}

}
