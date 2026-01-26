/*
    하나의 try 문에 여러개의 catch 블록문이 오는 경우 특징)
        복수개의 catch 블록문이 오는 경우는 구체적인 예외 처리 자손클래스를 먼저 기술하고, 예외 처리 부모클래스는
        나중에 기술한다.
*/
public class ConsTest08 {
    public static void main(String[] args) {

        int x = 10, y = 2, z = 0, re = 0;

        try {
            re = x / y;
            System.out.println("re = " + re);

            re = x / z; //정수 숫자를 0으로 나누면 예외가 발생하고 아래문장 수행 안함.
            System.out.println("re = " + re); //이 문장 수행 안함 -> 해당 catch블록문으로 실행순서가 옮겨짐
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
