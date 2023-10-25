package method.ex3;
class ClassTest{
    int iv;           // 인스턴스 변수
    static int cv;    // static 변수(클래스 변수)

    public void instanceMethod(){  //인스턴스 메서드
        System.out.println(iv); // 인스턴스 변수 사용 가능
        System.out.println(cv); // static 변수 사용 가능
    }

    public static void staticMethod() { //static 메서드
//        System.out.println(iv); // 인스턴스 변수 사용 불가능 (인스턴스 객체 없음!)
        System.out.println(cv); // 스테틱 변수 사용 가능
    }
}
