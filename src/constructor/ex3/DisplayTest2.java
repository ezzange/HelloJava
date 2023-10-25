package constructor.ex3;

import constructor.ex2.Display;

public class DisplayTest2 {
    public static void main(String[] args) {

        Display2 display = new Display2();
        Display2 display2 = new Display2("blue");
        System.out.println("display 의 color : "+display.color+" display 의 penal : "+display.panel+" display 의 size : "+display.size);
        System.out.println("display2 의 color : "+display2.color+" display2 의 penal : "+display2.panel+" display2 의 size : "+display2.size);
    }
}
