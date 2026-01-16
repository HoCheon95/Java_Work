/*
 * 객체 직렬화의 장점)
 *  1. 복잡한 객체를 한 번에 처리 가능하다.
 *  2. 객체 전체를 파일 또는 네트워크로 쉽게 전송하거나 저장할 수 있다.
 *  3. 코드가 간결해 지고, 버그 발생 가능성이 줄어든다. 일관성 있고 편리한 데이터 전송 방식이다.
 *  
 *  객체 직렬화를 통해서 데이터를 전송한다고 해서 항상 전송 속도가 빠른 것은 아니다.
 *  
 *  객체 직렬화를 하면 유리한 점)
 *   1. 복잡한 구조의 객체를 다룰 때 개발 시간을 줄이고, 전송도 안정적으로 할 수 있다.
 */

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* 객체 직렬화를 위한 클래스 설계 */
public class Customer implements Externalizable{
	int id;
	String name;
	int age;
	double height;
	
	public Customer() {}//기본생성자
	
	public Customer(int id, String name, int age, double height) {
		this.id = id;
		this.name=name;
		this.age=age;
		this.height=height;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(id);//기본 int 타입이 래퍼참조타입 Integer 으로 오토박싱(자바5에서 추가) + 부모타입으로 업캐스팅해서 저장
		out.writeObject(name);//업캐스팅해서 저장
		out.writeObject(age);//오토박싱 + 업캐스팅
		out.writeObject(height);//오토박싱 + 업캐스팅
	}//객체단위로 기록

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = (Integer)in.readObject();//명시적인 다운캐스팅 + 오토언박싱(자바 5에서 추가. 참조래퍼타입을 기본타입으로 형변환)
		name = (String)in.readObject();//명시적인 다운캐스팅
		age = (Integer)in.readObject();//다운캐스팅 + 오토언박싱
		height = (Double)in.readObject();//다운캐스팅 + 오토언박싱
	}//객체단위로 읽기

	@Override
	public String toString() {
		return "id : " +id+", name : "+name+", age : "+age+", height : "+height;
	}
	
	
	

}
