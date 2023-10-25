package polymorphism.ex1;

public class Display { //부모클래스의 멤버 5개
    boolean power; //전원상태
    int lightness; //밝기

    void power() { power = !power; }
    void lightnessUp() { ++lightness; }
    void lightnessDown() { --lightness; }

}
