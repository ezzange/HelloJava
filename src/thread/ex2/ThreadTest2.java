package thread.ex2;

import com.sun.jdi.InternalException;

public class ThreadTest2 {
    static long startTime = 0;
    public static void main(String[] args) {
        ThreadEx2_1 t1 = new ThreadEx2_1();
        ThreadEx2_2 t2 = new ThreadEx2_2();
        t1.start();
        t2.start();
        startTime = System.currentTimeMillis();
        try {
            t1.join(); //main thread th1 작업이 긑날때 까지 기다린다.
            t2.join(); //main thread th2 작업이 긑날때 까지 기다린다.
        } catch (InternalException | InterruptedException e) {}
        System.out.println("소요시간 : "+(System.currentTimeMillis() - startTime));
    }
}
