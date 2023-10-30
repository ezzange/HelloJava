package thread.ex5;

import com.sun.jdi.InternalException;

public class MultiThread {
    public static void main(String[] args) {
        RunImpl r = new RunImpl();
        Thread t1 = new Thread(r, "*");
        Thread t2 = new Thread(r, "**");
        Thread t3 = new Thread(r, "***");

        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(2000);
            t1.suspend(); // 쓰레드 t1 을 잠시 중단
            Thread.sleep(2000);
            t2.suspend();
            Thread.sleep(2000);
            t1.suspend(); // 쓰레드 t1 다시동작
            Thread.sleep(2000);
            t1.stop(); // 쓰레드 t1 강제종료
            t2.stop(); //
            t2.suspend();
            Thread.sleep(2000);
            t2.stop();
        }catch (InternalException e){}
    }
}
