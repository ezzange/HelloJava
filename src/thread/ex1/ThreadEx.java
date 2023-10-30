package thread.ex1;

public class ThreadEx {
}

class ThreadEx1_1 extends Thread {
    public void run() { // 쓰레드가 수행할 작업을 작성할 메서드 run()
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()); // 부모클래스 Thread의 getName() 호출
        }
    }
}
class ThreadEx1_2 implements Runnable {
    public void run() { // 쓰레드가 수행할 작업을 작성할 메서드 run()
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()); // 현재 실행중인 Thread의 getName()을 반환
        }                       //Thread.currentThread() : 현재 실행중인 Thread를 반환
    }
}
