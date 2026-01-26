/*
    java.util 패키지의 Map 컬렉션 인터페이스를 구현상속한 HashMap 컬렉션 클래스 특징)
        1. 키, 값 쌍으로 데이터를 저장한다.
        2. 키는 중복을 허용하지 않지만, 값을 중복을 허용한다.
        3. 저장 순서는 유지되지 않는다.
        4. 자바 7부터 생성자 부분의 제네릭 타입 파라미터 생략(<> 다이아몬드 연산자)이 가능하다.
*/

import java.util.HashMap;
import java.util.Map;

class MapEx06 {
    Map < Integer, String > cityMap = new HashMap <> ();
    //키는 정수숫자 값만, 값은 문자열 값만 저장 가능하다.

    public void setCityMap() {
        String cityName = "도시이름";
        for (int i = 1; i <= 5; i++) {
            cityMap.put(i, cityName + " " + i); //키,값 쌍으로 저장
        }
    } //setCityMap()

    public void printMap() {
        /* Map의 전체 데이터를 가져올 때는 keySet() 또는 entrySet()을 사용 여기서는 keySet()을 이용한 향상된 확장 for */
        for (Integer key: cityMap.keySet()) {
            System.out.println(key + " : " + cityMap.get(key)); //키 : 값(get(key))메서드는 키에 대한 값을 구함 쌍으로 출력
        }
    } //printMap()
}

public class ConsTest06 {
    public static void main(String[] args) {
        MapEx06 map06 = new MapEx06();

        map06.setCityMap();
        map06.printMap();
    }
}
