package classss.ex6;

public class TestClass {
    public static void main(String[] args) {
//        System.out.println(InnerTest.InstanceInner.iv);
        System.out.println(InnerTest.InstanceInner.CONST);
        System.out.println(InnerTest.InstanceInner.cv);
        System.out.println(InnerTest.StaticInner.cv);
//        System.out.println(StaticInner.iv); //ERROR
//        System.out.println(LocalInner.CONST); //ERROR 지역 변수 내부클래스는 메서드내에서만.

    }
}
