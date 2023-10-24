package inheritance.ex5;

class Parent2{
    int x = 10;
}

class Child2 extends Parent2{
    int x = 20;

    public void method() {
        System.out.println("x = "+ x);
        System.out.println("this.x = "+ this.x);
        System.out.println("super.x = "+ super.x);
    }
}
public class InheritanceSuper {
    public static void main(String[] args) {
        Child2 child2 = new Child2();
        child2.method();
    }
}
