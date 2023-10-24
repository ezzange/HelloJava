package callstack.ex1;

public class CallStackTest {
    public static void main(String[] args) {
        System.out.println("hello");
    }
    // 1. 프로그램이 실행되면서 메인메서드 실행 (스택에 메인 메서드 메모리 할당)
    // 2. 메인 메서드가 println() 호출 (호출 스택에 println() 메모리 할당)
    // 3. println() 실행 후 종료 (호출 스택에서 사라지면서 메인 메서드 호출)
    // 4. 메인 메서드 종료 (호출 스택에서 사라짐)
    // 5. 프로그램 종료
}
