package thread.ex6;

public class ThreadTest2 {
    static long startTime = 0;
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        startTime = System.currentTimeMillis();

        try {  //모든 쓰레드의 작업이 종료되면 프로그램이 종료되도록.
            t1.join();
            t2.join();
        } catch (InterruptedException e) {

        }
        System.out.println();
        System.out.println("소요시간 : "+ (System.currentTimeMillis() - startTime));
    }
}
