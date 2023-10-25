package interfacee.ex1;

//추상클래스를 상속받아 추상클래스의 추상메서드를 일부만 구현한 클래스는 class앞에 abstract 제어자가 없으면 에러 발생
public abstract class Player2 extends abstractClass{
    public void play(int pos) { // 추상메서드 구현
        System.out.println(pos+" play");
    }


}
