package thread.ex5;

import com.sun.jdi.InternalException;

public class MyThread implements Runnable{

    //volatile
    volatile boolean suspended = false;
    volatile boolean stopped = false;
    Thread th;

    MyThread(String name) {
        th = new Thread(this, name); //Thread(Runnable r, String name)
    }
    //Deprecated 된 메서드를 사용하기 위해 직접 작성
    void start() { //내부적으로 선언된 쓰레드 실행
        th.start();
    }
    void stop() { //쓰레드 일시 정지
        stopped = true;
    }
    void  suspend() { //
        suspended = true;
    }

    void resume() { //
        suspended = false;
    }
    @Override
    public void run() {

        while (!stopped) {
            if(!suspended){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InternalException | InterruptedException e) {

                }
            }

        }
        System.out.println(Thread.currentThread().getName() + " : stopped");
    }


}
