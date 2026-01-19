/*
 * java.io 패키지의 File 내장 클래스 하위의 메서드에 관한 실습
 */

import java.io.File;

public class IoEx12 {

	public static void main(String[] args) {
		
		String path = "./src";//이클립스 개불툴에서 ./ 현재 상대경로는 프로젝트 경로인 Day20_java이다.
		File dirPath = new File(path);
		String[] fileLists = dirPath.list();// src 폴더의 파일목록을 문자열 배열로 반환
		
		//자바 5버전에서 추가된 향상된 확장 for 반복문 사용
		for(String fileName:fileLists) {
			File f = new File(path+"/"+fileName);
			System.out.println("\n ============================ \n");
			System.out.println("파일이름 : " + f.getName());
			System.out.println("경로 : " + f.getPath());
			System.out.println("절대경로 : " + f.getAbsolutePath());
			System.out.println("디렉토리 여부" + f.isDirectory());//디렉토리면 true, 아니면 false
			System.out.println("파일 여부 : " + f.isFile());//파일이면 true, 아니면 false
		}//for
	}
}
