/*
 * 복합대입연산자 종류)
 *  i+=1 은 i=i+1 과 같다. 결국 1씩 증가한다.
 *  i+=5 복합대입연산자는 5씩 증가한다.
 *  i-=3 은 i=i-3 과 같다. 결국 3씩 감소한다.
 */
public class DataType04 {

	public static void main(String[] args) {
		
		int i = 1;
		i += 1;
		System.out.println("i = " + i);//2
		
		i += 10;
		System.out.println("i = " + i);//12
		
		i -= 3;
		System.out.println("i = " + i);//9
		
		i -= 1;
		System.out.println("i = " + i);//8
		
		/*
		 * 증감연산자 종류)
		 *  i++	(후행증가: 나중에 1증가),
		 *  ++i	(선행증가: 먼저 1증가),
		 *  i--	(후행감소: 나중에 1감소),
		 *  --i	(선행감소: 먼저 1감소),
		 */
		i = 10;
		int k = i++;// 먼저 i변수값 10을 k변수에 대입 저장하고 나중에 1증가
		System.out.println("k = " + k + ", i = " + i);//10, 11
		
		i = 10;
		k = --i; // 먼저 1감소한 9를 k변수에 대입 저장
		System.out.println("k = " + k + ", i = " + i);//9, 9
		
		
	}

}
