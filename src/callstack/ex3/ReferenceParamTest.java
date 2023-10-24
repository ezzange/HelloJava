package callstack.ex3;


public class ReferenceParamTest {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println(" after change(d) ");
        System.out.println("main() : x = " + d.x);

    }

    static void change(Data2 d) {
        d.x = 1000;
        System.out.println("x = " + d.x);
    }
}
//      1. 호출 스택에 메모리가 할당되고 메인 메서드가 스택에 올라가면서 프로그램이 실행된다.
//      2. 스택에 올라간 메인 메서드에서 참조 변수 d 생성되고 Data2 객체 생성된다.
//      3. 참조변수 이기 때문에 Data2의 기본값은 0으로 자동 초기화되고 생성된 Data2 객체 주소 값이 참조변수 d값에 대입된다.
//      4. 참조변수d가 가르키는 객체의 x값에 10을 대입한다. 그러므로 d.x 값은 10 이 된다.
//      5. println()가 호출되면서 main() : x =10 이 출력 되고 작업을 마친 println은 스택에서 사라진다.

//      6. 메인메서드는 메서드 change(d.x)가 호출하여 메인메서드는 대기상태가 되고 change(d.x)는 스택에 올라가 작업을 수행한다.
//      7. change(d)메서드의 매개변수는 Data2타입의 참조형 매개변수 d로 메인메서드의 참조변수 d가 가르키는 객체주소값을 복사한다.
//         (change()의 지역변수 d.x는 참조형 매개변수 d는 메인메서드 참조변수 d가 가르키는 객체주소값의 x값을 가르키게 된다.)
//      8. change메서드의 지역변수 d.x값에 1000이 대입 된다.
//      9. change()내의 println()메서드가 호출되고 스택에서 change메서드 위로 change()메서드의 println()메서드가 올라간다.
//      10. ( x=1000;  → change() : x = 1000 )출력되고 작업을 마친 change()는 스택에서 내려간다.

//      11. 대기 상태에 있던 메인 메서드가 실행상태가 되면서 작업을 처리하면서 메서드의 println이 호출한다.
//      12. 메인 메서드의 println이 호출되면서 스택에 올라가고 After change(d.x) 출력한다. 작업을 마친 메인메서드의 println()은 스택에서 내려간다.
//      13.메인 메서드의 두번째 println의 ( )값을 연산하고 호출되어 스택에 올라가고 main() : x = 10 출력한다. 작업을 마친 두번째 println()은 스택에서 내려간다.
//      14. 메인 메서드도 더 이상 실행할 문장이 없기 때문에 프로그램은 종료되면서 스택에서 사라진다. 이 때 할당된 메모리 공간은 반환되어 비워진다.

