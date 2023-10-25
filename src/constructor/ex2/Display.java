package constructor.ex2;

public class Display {
    String color;
    String panel;
    int size;

    Display() { // 기본 생성자
    }

    Display(String color, String panel, int size) { //매개변수를 가지고 있는 생성자
        this.color = color;
        this.panel = panel;
        this.size =size;
    }

}
