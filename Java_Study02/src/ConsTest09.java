/*
    try ~ catch 문에서 예외가 발생하든 발생하지 않든 무조건 마지막에 실행해야 하는 문장을 넣을 때는 finally{}
    블록문을 사용한다.
*/
public class ConsTest09 {
    public static void main(String[] args) {

        int a = 10, b = 0, c = 2;
        int result = 0;

        try {
            result = a / c;
            System.out.println(result);

            result = a / b; //예외가 발생
            System.out.println(result); //이 문장 수행 안함
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("예외와 상관없이 무조건 마지막에 실행");
        }
    }
}
