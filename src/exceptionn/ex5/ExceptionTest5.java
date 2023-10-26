package exceptionn.ex5;

public class ExceptionTest5 extends Exception{
    ExceptionTest5(String msg) { //문자열을 매개변수로 받는 생성자
        super(msg); // 생성자super()로  부모 클래스 Exception 생성자를 호출
    }

}
