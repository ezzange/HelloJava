package interfacee.ex7;

public abstract class Unit {
    int x;
    int y;

    public abstract void move(int x, int y);
    public void stop(){
        System.out.println("stop.");
    }
}
