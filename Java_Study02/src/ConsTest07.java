/*
    try ~ catch 문으로 예외 처리)
        try{
            정상구문이 실행되다가 예외가 발생하면 아래 문장을 수행하지 않고 예외 처리 catch 블록문{}으로 이동해서 예외처리한다.
        }catch(예외처리클래스 매개변수){
            예외처리코드;
        }
 */
public class ConsTest07 {
    public static void main(String[] args) {

        //자바에서 정수숫자를 0으로 나누면 예외가 발생한다.
        int a = 9, b = 3, c = 0;
        int result = 0;

        try {
            result = a / b;
            System.out.println("result = " + result);

            result = a / c; //예외가 발생
            System.out.println("result = " + result); //이 문장 수행 안함.
        } catch (Exception e) {
            e.printStackTrace(); //예외 족적 발자취를 남김
        }

    }
}
