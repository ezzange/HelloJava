package classss.ex6;

public class InnerTest {
    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
//        System.out.println(StaticInner.iv); ERROR
//        System.out.println(LocalInner.CONST); ERROR 지역 변수 내부클래스는 메서드내에서만.

    }
    class InstanceInner{ // 인스턴스 내부 클래스
        int iv = 100;
        static int cv = 100; // ERROR static 내부 클래스만 static 멤버 정의 가능
        final static int CONST = 100; // final static 는 상수라 가능
    }


    static class StaticInner{ // static 내부 클래스
        int iv = 200; // static 내부 클래스의 인스턴스 변수 접근 불가능
        static int cv = 200; //static 내부 클래스만 static 멤버 정의 가능
    }
    void method(){
        // local 메소드 내부 클래스는 해당 속해있는 외부 클래스의 멤버 모두 접근 가능
        class LocalInner{ // 지역 내부 클래스
            int iv = 300;
            static int cv = 300; // ERROR static 내부 클래스만 static 멤버 정의 가능
            final static int CONST = 300; // final static 는 상수라 가능
        }
    }
}
