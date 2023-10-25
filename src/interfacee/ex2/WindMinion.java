package interfacee.ex2;

public class WindMinion extends Unit{

    public void move(int x, int y) {
        System.out.println("WindMinion의 위치가 [ x = " + x +", y = "+ y+"]로 이동됩니다.");
        windTornado();
    }
    public void windTornado(){
        System.out.println("Wind Tornado @ @ @ ~@@@");
    }
}
