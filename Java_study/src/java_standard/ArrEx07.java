package java_standard;

import java.util.Random;

public class ArrEx07 {

	public static void main(String[] args) {

		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i; // 배열을 0 ~ 9의 숫자로 초기화
			System.out.print(" " + numArr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			Random random = new Random();
			int n = random.nextInt(10);
			
			int tmp = numArr[0];	// numArr[0] 0을 tmp에 대입 
			numArr[0] = numArr[n];	// 난수로 발생한 numArr[3]의 값 3을 numArr[0] 대입
			numArr[n] = tmp;		// tmp=0 의 값을 numArr[3]에 대입 0 번과 3번의 값의 위치를 바꿈
		}
		
		for(int i =0; i<numArr.length; i++) {
			System.out.print(" " + numArr[i]);
		}

	}

}
