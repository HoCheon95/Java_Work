/*
    java 7버전에서 AutoCloseable 인터페이스를 구현 상속한 자손은 try()내에서 객체를 생성하면 finally{}
    블록문에서 명시적으로 닫지 않아도 자동으로 닫힌다.
*/

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ConsTest11 {
    public static void main(String[] args) throws Exception {

        List < String > nameList = new ArrayList <> ();

        nameList.add("홍길동");
        nameList.add("이순신");
        nameList.add("신사임당");

        try (PrintWriter out = new PrintWriter("./src/name.txt")) {
            /*
                java.io 입출력패키지의 PrintWriter 출력스트림 내장 API는 AutoCloseable
                인터페이스를 구현 상속받고 있다.
            */

            for (int i = 0; i < nameList.size(); i++) { //size()메서드는 첫 원소개수를 1부터 시작해서
                //해당 컬렉션의 원소개수를 반환한다. 첫번째 주소 인덱스 배열처럼 0부터 시작한다.
                out.println(nameList.get(i)); //get(i)메서드로 i번째 컬렉션 원소값을 가져온다.
                //가져온 이름을 name.txt에 기록한다.
            } //for
        } //try()
    }
}
