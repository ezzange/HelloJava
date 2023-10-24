package classss.ex2;

import classss.ex1.Display;

public class DisplayTest {
    public static void main(String[] args) {
        Display display1 = new Display();
        Display display2 = new Display();
        display1.lightness = 5;

        System.out.println("현재 display1의 밝기는 "+display1+" 입니다.");
        System.out.println("현재 display2의 밝기는 "+display2+" 입니다.");
    }
}
