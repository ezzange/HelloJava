package callstack.ex2;


public class PrimativeParamTest {

    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println(" after change(d.x) ");
        System.out.println("main() : x = " + d.x);

    }

    static void change(int x) {
        x = 1000;
        System.out.println("x = " + x);
    }
}
//      1. 호출 스택에 메모리가 할당되고 메인 메서드가 스택에 올라가면서 프로그램이 실행된다.
//      2. 스택에 올라간 메인 메서드에서 참조 변수 d 생성되고 Data 객체 생성된다.
//      3. 참조변수 이기 때문에 Data의 기본값은 0으로 자동 초기화되고 생성된 Data 객체 주소 값이 참조변수 d값에 대입된다.
//      4. 참조변수d가 가르키는 객체의 x값에 10을 대입한다. 그러므로 d.x 값은 10 이 된다.
//      5. println()가 호출되면서 main() : x =10 이 출력 되고 작업을 마친 println은 스택에서 사라진다.

//      6. 메인메서드는 메서드 change(d.x)가 호출하여 메인메서드는 대기상태가 되고 change(d.x)는 스택에 올라가 작업을 수행한다.
//      7. change(x)는 기본형 매개변수 x값에 참조변수 d.x가 가르키는 값인 10을 복사하여 change(x)의 입력값은 10이 된다.
//      8. change()의  x=1000; 문장이 실행되면서  change()의 지역변수 x는 10에서 1000이 대입되어 1000이 된다.
//      9. change()내의 println()메서드가 실행되고 ( x=1000;  → change() : x = 1000 출력)되고 작업을 마친 change()는 스택에서 내려간다.

//      10. 메인 메서드의 println이 호출되면서 스택에 올라가고 After change(d.x) 출력한다. 작업을 마친 메인메서드의 println()은 스택에서 내려간다.
//      11. 메인 메서드의 두번째 println의 ( )값을 연산하고 호출되어 스택에 올라가고 main() : x = 10 출력한다. 작업을 마친 두번째 println()은 스택에서 내려간다.
//      12. 메인 메서드도 더 이상 실행할 문장이 없기 때문에 프로그램은 종료되면서 스택에서 사라진다. 이 때 할당된 메모리 공간은 반환되어 비워진다.

