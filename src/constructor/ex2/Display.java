package constructor.ex2;

public class Display {
    String color;
    String panel;
    int size;

    Display() { // 기본 생성자
    }

    Display(String color, String panel, int size) { //매개변수를 가지고 있는 생성자
       // 자기 자신을 가르키고 있는 this .
        this.color = color; // 들어오는 매개변숫값이 자기 자신의 변숫값에 대입
        this.panel = panel; // => Display 의 iv panel 과 매개변수로 들어오는 panel과 값이 같도록 설정
        this.size =size; //매개변수와 인스턴스 변수 이름이 같을 때는 구분을 위해 this 사용.
    }

}
