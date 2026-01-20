package java_standard;

import java.util.Arrays;
import java.util.Random;

public class ArrEx09 {

	public static void main(String[] args) {

		int[] code = { -4, -1, 3, 6, 11 };
		int[] arr = new int[10];
		
		for(int i =0; i < arr.length; i++) {
			Random random = new Random();
			int num = random.nextInt(code.length);
			arr[i] = code[num];
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
