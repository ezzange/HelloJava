package modifider.ex4;

public class Parent {

    private int privateInt;    // 같은 클래스
            int defaultInt;    // 같은 패키지
    protected int protectedInt;// 같은 패키지 + 다른 패키지의  자식 클래스
    public int publicInt;      // 접근제한 없음.

    public void printMembers() {
        System.out.println( privateInt);
        System.out.println( defaultInt);
        System.out.println( protectedInt);
        System.out.println( publicInt);
    }
}

