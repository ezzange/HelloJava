package classss.ex1;

public class Display{

    //속성(변수)
    String color; //색
    boolean power; //전원상태
    public int lightness; //밝기

    //기능(메서드)
    void power(){power =!power;}
    void lightnessup(){lightness++;}
    void lightnessDown(){lightness--;}

}