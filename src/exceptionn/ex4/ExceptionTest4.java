package exceptionn.ex4;

public class ExceptionTest4 {
    public static void main(String[] args) throws Exception{
        method();                           //예외를 던지기 위해서는 반드시 checked 예외를 선언문에 작성해준다.
        System.out.println(" method() 호출");
    }
    static void method() throws Exception {
        System.out.println(" method2() 호출");
        method2();
    }

    private static void method2() throws Exception{
        System.out.println("exception으로 예외 던지 ");
        throw new Exception();//메소드에 예외 선언
    }
}

//      1. 메인 메소드 실행 method() 호출하고 자신은 대기
//      2. method() 메소드 실행 method2()호출하고 자신은 대기
//      3. method2() 메소드 실행 예외 발생 예외를 처리할 수 없어 자신을 호출한 method() 호출하면서 method()에 예외 던지고 자신은 종료
//      4. method() 메소드는 받은 예외를 처리할 수 없어 메인 메서드를 호출하면서 예외를 메인 메서드로 던지고 자신은 종료
//      5. 메인 메소드 또한 예외처리 문장이 없어 발생한 예외를 처리하지 못하고 비정상 프로그램 종료.

