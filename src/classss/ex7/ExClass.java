package classss.ex7;

public class ExClass {

    Object iv = new Object(){void method(){}}; // 익명 클래스
    static Object cv = new Object(){void method(){}}; // 익명 클래스

    void method(){
      Object lv = new Object(){void method(){}}; // 익명 클래스
    };
}

