package exceptionn.ex1;

public class ExceptionTest1 {
    public static void main(String[] args) {
    //exception 예외를 고의적으로 발생 예외처리를 안하면 comprile error

        try { //고의로 발생시킨 예외 처리하기
            Exception e = new Exception("고의적 예외 발생");
            throw e;
        } catch (Exception e) {
            System.out.println("예외처리 진행 후 프로그램 정상 종료");
        }
        // runTime error는 프로그램을 실행하면 에러발생
//        throw new RuntimeException();
    }

}
