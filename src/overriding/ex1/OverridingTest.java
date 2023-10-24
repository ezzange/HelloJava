package overriding;

class Parent2{
    int aaa;

    String callValue() {
        return "aaa : " + aaa;
    }
}


class Child2 extends Parent2{
    int bbb;
    String callValue() {
        return "aaa : " + aaa + ", bbb : " + bbb;
    }
}
public class OverridingEx1 {
    public static void main(String args[]) {
        Child2 child2 = new Child2();
        child2.aaa=10;
        child2.bbb=20;
        System.out.println(child2.callValue());
        Parent2 parent2 = new Parent2();
        System.out.println("parent2.callValue() = " + parent2.callValue());
    }


}
