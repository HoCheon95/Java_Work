/*
 * &&(논리곱 : and), ||(논리합:or) 논리연산자의 효율적인 연산)
 * 1. && 논리곱 연산에서 왼쪽 피연산 결과가 false이면 오른쪽 피연산자 결과값이 true가 되든 false가 되든지에 상관 없이 무조건 결과 연산값은 false가 된다. 
 * 즉 왼쪽 연산 결과를 false로 만들면 오른쪽 피연산자는 연산을 수행하지 않아서 효율적인 연산이 되고 그 만큼 실행속도도 빨라진다.
 * 
 *  2. || 논리합 연산에서 왼쪽 피연산자가 결과가 true가 되면 오른쪽 결과값이 true가 되든 false가 되든지에 상관 없이 무조건 결과값은 true가 된다.
 *  즉 왼쪽 피연산자 결과를 true로 만들면 오른쪽 피연산자는 연산을 수행하지 않아서 그만큼 프로그램 실행속도는 빨라진다.
 */
public class ConvEx14 {

	public static void main(String[] args) {
		
		int a=5;
		int b=0;
		
		System.out.printf("a != 0 || ++b != 0 : %b \n", a != 0 || ++b != 0);	// a != 0 -> 5!=0가 true가 된다. 그래서 ++b 선행증가는 수행안됨.
		System.out.println("b = " + b);	//0  0이 되면 ++b 수행 안됨
		
		System.out.println("\n========================================== \n");
		
		System.out.printf("a == 0 && ++b != 0 : %b \n", a == 0 && ++b != 0); // a == 0 -> 5 == 0가 false가 된다. 그래서 ++b 수행안됨.
		System.out.printf("b = %d\n", b);

	}

}
