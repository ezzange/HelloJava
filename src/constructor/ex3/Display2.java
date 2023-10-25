package constructor.ex3;

import constructor.ex2.Display;

public class Display2 {
    String color;
    String panel;
    int size;

    Display2() { // this() 생성자를 이용하여 지정한 값으로 초기화 해주는 생성자
        this("white", "oled", 32);
    }
    Display2(String color) { // this()를 이용하여 color의 값만 받고 나머지 값은 지정한 값으로 초기화 해주는 생성자
        this(color, "oled", 32);
    }
    Display2(String color, String panel, int size) { // this()를 모든 변수의 값을 받아 값을 초기화 해주는 생성자
        this.color = color;
        this.panel = panel;
        this.size =size;
    }

}
