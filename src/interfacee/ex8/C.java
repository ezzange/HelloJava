package interfacee.ex8;

public class C implements I{
    public void method() {
        System.out.println("C 클래스의 메서드");
    }
    public void printMethod(){
        System.out.println("인터페이스 I를 상속받아 구현한 C 클래스");
    };
}
