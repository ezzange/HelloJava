package annotationn.ex1;

public class FunctionalInterfaceTest {

}
@FunctionalInterface
interface Runnable{
    public abstract void run();
}

@FunctionalInterface
interface Testable{
    public abstract void abMethod1();
//    public abstract void abMethod2();
    //함수형 인터페이스는 하나의 추상메서드를 가질 수 있어 주석을 풀면 애너테이션에 컴파일 에러 발생.

}
