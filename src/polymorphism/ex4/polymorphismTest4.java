package polymorphism.ex4;

import polymorphism.ex1.Display;
import polymorphism.ex1.SmartDisplay;

public class polymorphismTest4{
    public static void main(String[] args) {
        Display display = new Display();
        check(display);

    }

     static void check(Display display) {
        if (display instanceof SmartDisplay) {
            SmartDisplay smartDisplay = (SmartDisplay) display;
            smartDisplay.printSmart();
            //...
        }
    }

}
