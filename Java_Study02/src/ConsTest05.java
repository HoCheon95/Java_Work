/*
    java.util 패키지의 List 컬렉션 인터페이스를 구현 상속한 ArrayList 컬렉션 클래스 특징)
        1. 하나이상의 복수개 데이터 타입을 동시 저장 가능하다. 그리고 복수개의 원소값을 동시 저장할 수 있다.
        2. 컬렉션은 크기가 가변적이다. 중복 원소값을 허용한다.
        3. 순서있게 정리한다.
        4. 자바 5버전부터 단 하나의 자료형 타입만 저장가능한 제네릭이 추가되었다.
*/

import java.util.ArrayList;
import java.util.List;

class ListEx05 {
    List < String > cityList = new ArrayList <> (); //뒷부분 제네릭 타입 <>은 생략가능하다. 이것은 자바 7버전에서 추가되었다.
    // 문자열만 저장가능한 컬렉션 <String> 제네릭 타입 cityList 생성

    public void setCityList() {
        String cityName = "도시이름";
        for (int i = 1; i <= 7; i++) {
            cityList.add(cityName + " " + i); //컬렉션에 무자열 원소값 추가
        }
    } //setCityList()

    public void printCityList() {
        //자바 5버전에서 추가된 향상된 확장 for
        for (String cityName: cityList) {
            System.out.println(cityName);
        }
    } //printCityList()

}

public class ConsTest05 {
    public static void main(String[] args) {

        ListEx05 li05 = new ListEx05();
        li05.setCityList();
        li05.printCityList();
    }
}
