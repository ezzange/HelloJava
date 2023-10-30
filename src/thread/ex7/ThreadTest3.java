package thread.ex7;

import thread.ex6.Thread1;

public class ThreadTest3 {
    public static void main(String[] args) {

        RumImpl r1 = new RumImpl("@");
        Thread t1 = new Thread(r1);
        Thread2 t2 = new Thread2();
        t1.start();
        System.out.println();
        t2.start();
        System.out.println();

        try {
            r1.start();
            Thread.sleep(1000);
            r1.suspend();
            Thread.sleep(1000);
            r1.stop();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

class RumImpl implements Runnable {
    boolean suspended = false;
    boolean stopped = false;
    Thread thread;

    RumImpl(String name) {
        thread = new Thread(this, name);
    }
    void  suspend() { //
        suspended = true;
        thread.interrupt();
        System.out.println(thread.getName() +" - interrupt() by suspended()");
    }
    void stop() {
        stopped = true;
        thread.interrupt();
        System.out.println(thread.getName() +" - interrupt() by stop()");
    }
    public void resume(){
        suspended = false;
    }
    public void start() {
        thread.start();
    }
    public void run() {
        String name = thread.getName();
        while (!stopped)
            if (!suspended) {
                for(int i = 0; i < 100; i++) {
                    System.out.print(name);
                }
                try {
                    thread.sleep(1000);
                } catch (InterruptedException e) {
                }

            } else{
                thread.yield();

            }
        System.out.println(name + " - stopped");
    }
}
class Thread2 extends Thread {
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.print(i);
        }
    }
}
