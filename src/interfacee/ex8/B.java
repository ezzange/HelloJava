package interfacee.ex8;

public class B implements I{
    public void method() {
        System.out.println("B 클래스 메서드");
    }
    public void printMethod(){
        System.out.println("인터페이스 I를 상속받아 구현한 B 클래스");
    };
}
