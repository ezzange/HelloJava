package interfacee.ex2;

public class WaterMinion extends Unit{

    public void move(int x, int y) {
        System.out.println("WaterMinion의 위치가 [ x = " + x +", y = "+ y+"]로 이동됩니다.");
        fireball();
    }
    public void fireball(){
        System.out.println("Hydro Pierce - - - - ->>");

    }
}
