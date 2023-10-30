package thread.ex6;

public class Thread2 extends Thread {

    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("ㅡ");
        }
    }
}
