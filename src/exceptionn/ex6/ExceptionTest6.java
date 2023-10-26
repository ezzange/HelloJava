package exceptionn.ex6;

public class ExceptionTest6 {
    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            System.out.println("받은 예외를 메인 메서드에서 예외를 처리");
        }
    }
    static void method() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method()에서 예외를 처리하고 되던지기");
            throw e;
        }
    }
}
