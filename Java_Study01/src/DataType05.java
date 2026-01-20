public class DataType05 {

	public static void main(String[] args) {
		
		/*
		 * if 조건문 형식)
		 *  if(조건문){
		 *  	조건식이 참이면 실행
		 *  }
		 */
		
		int age = 19;
		if(age >= 10 && age <= 19) {
			System.out.println(age + "세는 10대이다.");
		}//if
		System.out.println("\n ============================= \n");
		
		/*
		 * if ~ else 조거문 형식)
		 *  if(조건문){
		 *  	조건식이 참이면 실행;
		 *  }else{
		 *  	조건식이 거짓이면 실행;
		 *  }
		 */
		if (age > 0) {
			System.out.println(age + "는 양수이다.");
		}else {
			System.out.println(age + "는 양수가 아니다.");
		}
		System.out.println("\n ============================= \n");
		
		/*
		 * if else if 다중조건문 형식)
		 *  if(조건식1){
		 *  	조건식1이 참이면 실행;
		 *  }else if(조건식2){
		 *  	조건식2가 참이면 실행;
		 *  }else{
		 *  	조건식1,2 모두 거짓이면 실행;
		 *  }
		 */
		
		age = 20;
		if (age < 0) {
			System.out.println(age + "는 음수이다.");		
		}else if(age > 0) {
			System.out.println(age + "는 양수이다.");
		}else {
			System.out.println(age + "는 0이다.");
		}//if else if
	}

}
