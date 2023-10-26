package exceptionn.ex1;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // 0으로 나눠 예외 발생
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) { //예외와 일치
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("인덱스 범위를 초과했습니다.");
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다.");
        }
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}

