package thread.ex5;

public class MultiThread {
    public static void main(String[] args) {
//        RunImpl r = new RunImpl();
//        Thread t1 = new Thread(r, "*");
//        Thread t2 = new Thread(r, "**");
//        Thread t3 = new Thread(r, "***");
        MyThread t1 = new MyThread("*");
        MyThread t2 = new MyThread("**");
        MyThread t3 = new MyThread("***");
        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(1000);
            t1.suspend(); // 쓰레드 t1 을 1초 중단
            Thread.sleep(1000);
            t2.suspend();
            Thread.sleep(1000);
            t1.resume(); // 쓰레드 t1 다시 동작
            Thread.sleep(1000);
            t1.stop(); // 쓰레드 t1 강제 종료
            t2.stop(); //
            Thread.sleep(1000);
            t3.stop();
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
