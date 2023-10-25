package callstack.ex4;

public class ReferenceReturnTypeTest {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x=10;

        Data3 d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);

    }

    static Data3 copy(Data3 d) {
        Data3 tmp = new Data3();
        tmp.x=d.x;
        return tmp;
    }

}
//      1. 호출 스택에 메모리가 할당되고 메인 메서드가 스택에 올라가면서 프로그램이 실행된다.
//      2. 스택에 올라간 메인 메서드에서 참조 변수 d 생성되고 Data3 객체 생성된다.
//      3. 참조변수 이기 때문에 Data3의 기본값은 0으로 자동 초기화되고 생성된 Data3 객체 주소 값이 참조변수 d값에 대입된다.
//      4. 참조변수d가 가르키는 객체의 x값에 10을 대입한다. 그러므로 d.x 값은 10 이 된다.
//      5. 메인메서드는 copy()메서드를 호출하고 대기상태가 된다. 스택에 메인메서드 위로 copy()메서드가 올라온다.
//      6. 메인메서드에 d2 변수가 생성되고 copy()의 d도 생성된다. copy()메서드의 d는 메인메서드 d 가 가르키는 객체주소값을 복사한다.
//         (메인메서드의 참조변수 d가 객체주소값 0x100을 가르킨다면 copy()메서드의 d는 0x100을 복사해와 0x100을 가르킨다.)
//      7. copy()에서 Data3타입의 참조변수 tmp가 생성되고 새로운 Data3의 객체주소값을 가르킨다.(기본값 0)
//      8. copy()에서 참조변수 tmp.x는 새로운 Data3의 x값을 가르키고 d.x 는 기존 인스턴스 객체 Data3의 x값 임으로 기존 Data3 x값인 10을 복사하여 tmp.x에 Daata3의 객체 주소값을 대입해준다..
//      9. copy()메서드는 tmp(기존 객체주소값)을 자신을 호출했던 메인 메서드에게 반환하고 스택에서 사라진다.
//      10. 대기상태에 있던 메인 메서드가 다시 작업을 처리하면서 println()를 호출한다.
//      11. 스택에 올라온 println()의 작업이 처리되고 스택에서 사라지며 메인메서드를 호출한다.
//      12. 메인메서드는 두번째 println()를 호출한다.
//      13. println()의 작업이 처리되고 메인메서드는 모든 작업을 처리했으므로 프로그램을 종료하고 메모리 공간을 반환한다.
