package interfacee.ex8;

public class InterfaceTest3 {

    public static void main(String[] args) {
        //A 객체가 B 객체를 사용하여 출력 -> 강한 결합 (의존관계)
        A a = new A();
        a.method(new B());
    }
}
