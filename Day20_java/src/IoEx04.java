/*
 * java.io 패키지의 File 클래스 특징) ***
 *  1. File 클래스를 활용하면 일반 게시판 파일 첨부기능이 있는 자료실을 만들 수 있다.
 *  여기서는 이클립스 하위에 있는 list() 메서드를 사용해서 해당 경로에 있는 파일 목록을 문자열 배열로 반환해 본다.
 */

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class IoEx04 {

	public static void main(String[] args) {

		File dirFile = new File("./src");
		/*
		 * 이클립스 계열의 개발툴에서 ./는 현재경로를 의미하는 상대경로인데 인식하는 현재경로는 프로젝트 경로인 Day20_java이다.
		 */

		String[] FileList = dirFile.list();

		/* 문제1) 일반 for 반복문을 사용해서 파일목록을 가져와서 출력해 본다. */
		// 답안코드

		for (int i = 0; i < FileList.length; i++) {
			System.out.println(FileList[i]);
		}

		//Arrays.stream(FileList).forEach(name -> System.out.print(" " + name));

		System.out.println("\n ============================= \n");

		/* 문제2) 자바 5버전에서 추가된 향상된 확장 for 반복문을 사용해서 파일목록을 출력해 본다. */
		// 답안코드

		for (String k : FileList) {
			System.out.println(k);
		}

	}

}
