package 내장함수형인터페이스람다식과스트림;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * 람다식과 스트림을 활용해서 컬렉션 원소값을 쉽게 읽어온은 예제소스
 */
public class LambdaStreamExample {

	public static void main(String[] args) {
		
		List<Student> studentList = Arrays.asList(
					new Student("홍길동", 100),
					new Student("이순신", 100)
				);
		
		Stream<Student> stream = studentList.stream();
		stream.forEach(s -> {
			String name = s.getName();//학생명
			int score = s.getScore();//점수
			System.out.println("학생명 : " + name + ", 점수 : " + score);
		});

	}

}
