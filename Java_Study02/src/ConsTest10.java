/*
    1. throw : 인위적 예외를 발생시킬 때 사용
        사용예) throw new 예외클래스생성자;

    2. throws : 발생한 예외를 자신이 직접 처리하는 것이 아니라 자신을 호출한 곳으로 떠 넘기면서 예외를 처리
        사용예) public 리턴타입 메서드명(매개변수 ...) throws 예외처리클래스{
                    실행문장;
                }
*/
public class ConsTest10 {

    static void pr(int a) throws NullPointerException {
        if (a == -10)
            throw new NullPointerException(); //인위적 예외 발생
    }

    public static void main(String[] args) {
        try {
            System.out.println("예외 발생전");
            pr(-10); //예외 발생
            System.out.println("이 문장 수행 안함");
        } catch (NullPointerException ne) {
            ne.printStackTrace();
        }
    }
}
