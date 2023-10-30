package thread.ex2;

public class ThreadEx2 {
}

class ThreadEx2_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println(new String("@"));
        }
    }
}
class ThreadEx2_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println(new String("_"));
        }
    }
}

