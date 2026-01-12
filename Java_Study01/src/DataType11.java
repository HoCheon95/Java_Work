import net.daum.gugudan.Thousand;

public class DataType11 {

	public static void main(String[] args) {
		Thousand ts = new Thousand(1000);//매개변수 한개짜리 오버로딩 된 생성자 호출
		int total = ts.getSum();// 1 부터 1000까지 누적합을 반환
		
		System.out.printf("1 부터 1000까지 누적합 = %d \n", total);
		System.out.println("1 부터 1000까지 누적합 = " + ts.getSum());
	}

}
