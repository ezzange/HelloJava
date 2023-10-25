package polymorphism.ex3;


import polymorphism.ex1.Display;
import polymorphism.ex1.SmartDisplay;

public class polymorphismTest3 {
    public static void main(String[] args) {
        Display display = null;
        SmartDisplay smartDisplay = new SmartDisplay();
        SmartDisplay smartDisplay2 = null;

        smartDisplay.printSmart(); // 자식클래스타입의 참조변수로 자식클래스 멤버 사용하기.
        display = smartDisplay; // 자식클래스에서 부모클래스의 형변환 생략 display = (Display)smartDisplay;
//        display.printSmart(); // 컴파일에러 => 부모클래스의 참조변수로 자식클래스의 멤버를 호출할 수 없다.
                                //부모클래스타입의 참조변수로는 부모클래스에 선언 되어 있는 멤버만 사용 가능하다.
        smartDisplay2 = (SmartDisplay) display; //  부모클래스에서 자식클래스로 형변환은 생략할 수 없다.
        smartDisplay2.printSmart();

    }
}
