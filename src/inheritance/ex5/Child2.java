package inheritance.ex5;

class Child2 extends Parent2{
    int x = 20;

    public void method() {
        System.out.println("x = "+ x);
        System.out.println("this.x = "+ this.x);
        System.out.println("super.x = "+ super.x);
    }
}