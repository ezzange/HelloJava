package overriding.ex1;

public class OverridingTest {
    public static void main(String[] args) {

        Child child = new Child();
        child.aaa=10;
        child.bbb=20;

        System.out.println(child.returnValue());
        Parent parent = new Parent();
        System.out.println("parent.returnValue() = " + parent.returnValue());
    }


}
