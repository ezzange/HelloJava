package classss.ex5;

class AAA{
    int i= 1000;
    BBB bbb = new BBB();
    class BBB{
        void method() {
//            AAA aaa = new AAA();
//            System.out.println(aaa.i);
            // 외부 클래스의 객체에 접근할 땐 객체를 생성하지 않아도 바로 변수에 접근할 수 있다.
            System.out.println(i);
        }
    }
}

class CCC{
    // AAA의 내부 클래스 BBB에 접근할 수 없다 => 캡슐화
//    BBB bbb = new BBB();
}
public class InnerTest {
    public static void main(String[] args) {
        // AAA의 내부 클래스 BBB에 접근할 수 없다 => 캡슐화
//        BBB bbb = new BBB();
//        bbb.method();
    }
}
