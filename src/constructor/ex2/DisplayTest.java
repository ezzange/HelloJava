package constructor.ex2;

public class DisplayTest {
    public static void main(String[] args) {
        Display display = new Display();
        display.color = "silver";
        display.panel = "oled";
        display.size = 32;

        Display display2 = new Display("white","led",27);
        System.out.println("display 의 color : "+display.color+" display 의 penal : "+display.panel+" display 의 size : "+display.size);
        System.out.println("display2 의 color : "+display2.color+" display2 의 penal : "+display2.panel+" display2 의 size : "+display2.size);

    }
}
