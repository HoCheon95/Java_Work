package java_standard;

import java.util.Random;

public class ArrEx10 {

	public static void main(String[] args) {

		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			Random random = new Random();
			int num = random.nextInt(10);

			numArr[i] = num;
			System.out.print(" " + numArr[i]);
		}
		System.out.println();

		for (int i = 0; i < numArr.length - 1; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지를 체크한다.

			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) {// 옆의 값이 작으면 서로 바꾼다.
					int tmp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = tmp;
					changed = true; // 자리바꿈이 발생했으니 true 변경
				}
			}// inner for end
			if(!changed) {
				break;
			}
			
			for(int k =0; k<numArr.length; k++) {
				System.out.print(" " + numArr[k]);
			}
			System.out.println();
		}// outer for end
		
		

	}

}
