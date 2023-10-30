package thread.ex8;

public class SynchronizedTest {
    public static void main(String[] args) {
        Runnable r = new RunnableEx();
        new Thread(r).start();
        new Thread(r).start();
    }
}
