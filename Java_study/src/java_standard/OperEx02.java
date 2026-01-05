package java_standard;

public class OperEx02 {
	public static void main(String[] args) {
		
		int i=5, j=0;
		
		j = i++;
		
		System.out.println("j = i++; 실행 후, i=" + i + ", j=" +j); //i = 6, j = 5
		
		i=5;
		j=0;
		
		j=++i;
		System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j); //i = 6, j =6

	}//main
}
