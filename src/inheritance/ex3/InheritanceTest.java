package 상속inheritance.ex3;

public class InheritanceTest {
    public static void main(String[] args) {
        //자식 클래스 생성
        SmartDisplay smartDisplay = new SmartDisplay();

        //자식 클래스의 부모 클래스 멤버 사용
        smartDisplay.lightness = 50;
        smartDisplay.setLightnessUp();
        System.out.println(smartDisplay.lightness);

        //자식 클래스의 멤버 사용
        smartDisplay.displayStandByMode("standByMode가 ture값이 아니기 때문에 메서드는 정상 실행되지 않는다.");
        smartDisplay.standByMode = true;
        smartDisplay.displayStandByMode("대기모드가 실행되었습니다.");
    }
}
