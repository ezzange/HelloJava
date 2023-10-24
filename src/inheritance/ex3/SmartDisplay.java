package inheritance.ex3;

public class SmartDisplay extends Display{

    boolean standByMode;

    //대기모드 상태 standByMode가 true 일 경우에만 text를 보여주는 메서드
    public void displayStandByMode(String text) {
        if (standByMode) {
            System.out.println(text);
        }
    }
}
