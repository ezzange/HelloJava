package interfacee.ex3;

public interface interface1 {
    public static final int exInt = 0; // 상수
    String exString = "ex"; // public static final이 생략되어 있다.


    int exMethod(int x, int y); //추상 메서드
    String exMethod2(); // public abstract 가 생략되어 있다.

    static int ex() { //static 메서드
        return 0;
    }

}
