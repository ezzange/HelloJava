package method.ex4;

public class class1 {
    public int add(int a, int b) {
        return a + b;
    }

    // 메서드의 중복 정의 - 오버로딩 X
//    public int add(int x, int y) {
//        return x + y;
//    }
    // 메서드 오버로딩 O
    public long add(Long a, Long b) {
        return a + b;
    }
}
