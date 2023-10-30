package thread.ex6;

public class Thread1 extends Thread {

    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("@");
        }
    }


}
