package interfacee.ex6;

public class InterfaceTest {
    public static void main(String[] args) {
        TestClass3 testClass3 = new TestClass3();
        TestClass4 testClass4 = new TestClass4();
        sum(testClass3);
        sum(testClass4);
    }
    public static void sum(Interface4 interface4) {
        interface4.emoji();
        interface4.heartEmoji();
    }



}
