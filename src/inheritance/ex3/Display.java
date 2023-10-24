package 상속inheritance.ex3;

public class Display {

    int lightness;
    boolean power;

    public void setPower() {
        power = !power;
    }

    public void setLightnessUp() {
        ++lightness;
    }
    public void setLightnessDown() {
        --lightness;
    }
}
