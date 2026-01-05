/*
 * do ~ while 반복문 형식)
 * do{
 * 	조건식이 참일동안만 반복실행;
 * 	증감식;
 * }while(조건식);
 * 
 * 나중에 조건식을 검사하기 때문에 조건식이 거짓이라도 무조건 한번은 반복실행한다는 특징이 있다.
 */

//do ~ while 반복문과 while 반복문 비교
public class CaseEx05 {
	public static void main(String[] args) {
		
		//do ~ while 반복문
		int i = 10;
		
		do {
			System.out.print("do ~ while 반복문 : " + i);
			i++;
		}while(i<0); //나중에 조건식을 검사해서 거짓인데 한번 반복실행함.
		
		System.out.println("\n =================================== \n");
		
		i = 10;
		
		while(i<0) {//먼저 조건을 검사해서 거짓이면 실행안함.
			System.out.println("while 반복문 : " + i);
			i++;
		}
		System.out.println("\n =================================== \n");
		

	}//main
}
