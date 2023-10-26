package classss.ex6;
class InnerTest {
    private int aaa = 0;
    private  static int bbb = 0;
    class InstanceInner{ // 인스턴스 내부 클래스 외부 클래스 필드 내에서 접근 가능
        int iv = 130;
        int iiv = aaa; // 내부클래스에서 외부 클래스의 private변수에 접근 가능.
        static int cv = 160; // ERROR static 내부 클래스만 static 멤버 정의 가능 접근 불가
        final static int CONST = 190; // final static 는 상수라 가능
    }
    static class StaticInner{ // static 내부 클래스 외부 클래스 필드 내에서 접근 가능
        int iv = 230; // static 내부 클래스의 인스턴스 변수 접근 불가능
        static int cv = 260; //static 내부 클래스만 static 멤버 정의 가능
        final static int CONST = 290; // final static 는 상수라 가능

    }
    void method(){
        // local 메소드 내부 클래스는 해당 속해있는 외부 클래스의 멤버 모두 접근 가능
        class LocalInner{ // 지역 내부 클래스 외부에서 접근이 불가능
            int lv = 330;
            static int cv = 360; // ERROR static 내부 클래스만 static 멤버 정의 가능?????
            final static int CONST = 390; // final static 는 상수라 가능
        }
        System.out.println(LocalInner.cv);
        System.out.println(LocalInner.CONST);

    }
    public static void main(String[] args){
        InnerTest innerTest = new InnerTest();

//        System.out.println(InstanceInner.iv); ERROR
        System.out.println(InstanceInner.cv); // 접근 불가
        System.out.println(InstanceInner.CONST); // 가능

//        System.out.println(StaticInner.iv); ERROR
        System.out.println(StaticInner.cv);
        System.out.println(StaticInner.CONST); // 가능


//        System.out.println(LocalInner.CONST); //ERROR 지역 변수 내부클래스는 메서드내에서만.
        innerTest.method();

    }
}

