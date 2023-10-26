package exceptionn.ex3;

public class ExceptionTest3 {
    public static void main(String[] args) {
        System.out.println("(●’◡’●)");
        System.out.println("(●’◡’●)");
        System.out.println("try catch");
        try{
            System.out.println("(●’◡’●)");
            System.out.println(0/0);
            System.out.println("(●’◡’●)"); //예외 발생으로 인해 실행되지 않은 문장

            //=> throw new Exception("고의적 예외 발생");
        } catch (ArithmeticException arithmeticException){
            System.out.println("에러 메세지 : " + arithmeticException.getMessage());
                                //에러 메세지 : / by zero
            arithmeticException.printStackTrace();
            //java.lang.ArithmeticException: / by zero
            //at exceptionn.ex3.ExceptionTest3.main(ExceptionTest3.java:9)
        }
        System.out.println("(●’◡’●)");
    }
}
