// 1차원 배열원소값 중에서 최대값을 구해본다.

public class ArrayEx03 {

   public static void main(String[] args) {
      
      double data[] = {10.5, 20.5, 100.0, 99.0, 88.8};
      double max = data[0];   // 첫번째 배열원소값으로 배열원소 최대값을 일단 초기화
      
      for(int i = 1; i < data.length; i++) {
         if(data[i] > max) {   //각 배열원소값이 최대값보다 크면 실행
            max = data[i];   //해당 배열원소값을 최대값으로 새롭게 저장            
         }
      }
      System.out.println("배열원소값 중 최대값은? " + max);
   }
}
