// 3행 * 2열 의 2차원 배열을 생성하고 총 6개의 배열원소값을 초기화 한 다음 이중 for 반복문으로 일괄 적으로 읽어오는 소스 예))

public class ArrayEx04 {

   public static void main(String[] args) {
      
      int[][] score = new int[3][2];
      
      // score 2차원 배열 원소값 초기화
      score[0][0] = 100; score[0][1] = 99;
      score[1][0] = 90;  score[1][1] = 88;
      score[2][0] = 99;  score[2][1] = 100;
      
      // 이중 for 반복문으로 2차원 배열원소값을 읽어온다.
      for(int i = 0; i < score.length; i++) {      //score.lentgth는 2차원 배열에서 행의 길이를 반환 -> 3
         for(int j = 0; j < score[i].length; j++) {      // score[i].length 는 각행의 열의 길이를 반환 -> 2
            System.out.print(" " + score[i][j]);
         }
         System.out.println();   // 줄바꿈
      }
   }
}
