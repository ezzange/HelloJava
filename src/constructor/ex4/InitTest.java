package constructor.ex4;

public class InitTest {
    static int cv = 1; // 명시적 초기화
    int iv = 1; // 명시적 초기화

    static { cv = 2; } // 클래스 초기화 블럭
    { iv = 2; } // 인스턴스 초기화 블럭

    InitTest() { //생성자 블럭으로 iv변수를 초기화 하는 복잡 초기화
        iv = 3;
    }
}
