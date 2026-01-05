// 배열 원소값을 직접 초기화 즉 저장하면서 배열 생성 -> 배열원소값의 총 합과 평균을 구하는 소스 예))

public class ArrayEx02 {

   public static void main(String[] args) {
      int [] score = {100,90,100};   // 3개의 int 타입 배열원소 값을 직접 저장 즉, 초기화 하면서 score 배열 생성
      int total = 0;   // 배열원소 총합을 저장할 변수 선언과 초기화
      double avg = 0.0;   // 배열원소 평균을 저장할 변수 선언과 초기화
      
      for(int i = 0; i < score.length; i++) {
         total += score[i];   // 배열원소 총합
      }
      
      avg = (double) total/score.length; 	// double/int는 자동산술법에 의해 double+double 이 됨
                                 			// 실수 숫자를 나눗셈하면 소수점 이하까지 계산한 평균값을 반환
      System.out.printf("총점= %d \n", total);
      System.out.println("평균= " + avg);
   }
}
