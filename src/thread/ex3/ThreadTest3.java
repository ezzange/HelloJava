package thread.ex3;

public class ThreadTest3 {
    static long startTime = 0;
    public static void main(String[] args) {
        MultiThread1 t1 = new MultiThread1();
        MultiThread2 t2 = new MultiThread2();

        t1.setPriority(2);
        t2.setPriority(9);
        System.out.println("Priority of th1(@)= " + t1.getPriority());
        System.out.println("Priority of th1(_)= " + t2.getPriority());
        t1.start();
        t2.start();
    }
}
