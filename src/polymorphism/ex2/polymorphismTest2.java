package polymorphism.ex2;


import polymorphism.ex1.Display;
import polymorphism.ex1.SmartDisplay;

public class polymorphismTest2 {
    //자식클래스타입의 참조변수        //자식클래스타입의 인스턴스
    SmartDisplay smartDisplay = new SmartDisplay();
    //부모클래스타입의 참조변수     //자식클래스타입의 참조변수를 부모클래스타입으로 형변환
    Display display           = (Display) smartDisplay;
    //자식클래스타입의 참조변수     //부모클래스타입의 참조변수를 자식클래스타입으로 형변
    SmartDisplay smartDisplay2 = (SmartDisplay) display;
}
