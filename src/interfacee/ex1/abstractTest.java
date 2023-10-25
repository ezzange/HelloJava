package interfacee.ex1;

public class abstractTest {
    public static void main(String[] args) {
        //추상메서드가 구현된 클래스의 인스턴스 생성
        Player player = new Player();

        //구현부가 작성된 추상메서드 호출
        player.play(10);
        player.stop();
    }
}
