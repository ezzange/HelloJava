package interfacee.ex2;

public abstract class Unit {
    int x, y;

    public abstract void move(int x, int y);

    public void stop(){
        System.out.println("stop.");
    };
}
