package polymorphism.ex1;

public class SmartDisplay extends Display { //자식클래스의 멤버 8개 (3개 + 상속받은 5개)
    boolean standbyMode;    //대기모드 on/off
    public void displayStandbyMode(String text){    //대기모드 상태가 on(true)이면 text를 보여준다.
        if (standbyMode){
            System.out.println(text);
        }
    }
    public void printSmart() {
        System.out.println("@@@@@@Smart@@@@@@@");
    }

}
