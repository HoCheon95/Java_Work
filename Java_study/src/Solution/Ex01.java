package Solution;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        
        for(int i = 0; number > 0; i++){
            answer += number % 100; // 뒤 2자리 더하기
            number /= 100;          // 2자리 제거
        }

        System.out.println(answer);
	}

}
