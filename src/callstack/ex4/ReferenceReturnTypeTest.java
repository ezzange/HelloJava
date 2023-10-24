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
//      5. println()가 호출되면서 main() : x =10 이 출력 되고 작업을 마친 println은 스택에서 사라진다.
//      6.

