package interfacee.ex1;

//추상클래스를 상속받아 추상클래스의 추상메서드를 모두 구현한 클래스
public class Player extends abstractClass{
    public void play(int pos) { // 추상메서드 구현
        System.out.println(pos+" play");
    }

    public void stop() { // 추상클래스 구현
        System.out.println("stop");
    }
}
