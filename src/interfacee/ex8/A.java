package interfacee.ex8;

public class A {
    public void method(B b) {
        b.method();
    }
    //기존의 의존하고 있는 B 클래스가 아닌 새로운 클래스 C를 출력하고 싶을 땐 아래와 같이 코드를 직접 바꿔 주어야 한다.
    public void method(C c){
        c.method();
    }
    //이를 강한 결합이라고 하는데 공통부분을 뽑아 인터페이스로 만들어두면 새로운 객체가 생길때마다 매번 A의 코드를 변경하지 않고
    //새로운 객체에 해당 인터페이스를 상속받아 구현하면 된다. 이를 느슨한 결합이라고 한다.

    //인터페이스 매개변수를 통해 해당 인터페이스의 메서드를 구현한 객체 전부를 받아올 수 있다.
    public void method(I i) {
        i.printMethod();
    }
}
