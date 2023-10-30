package thread.ex5;
//이 클래스의 객체를 생성해서 쓰레드를 만들 경우 Deprecated된 메서드 사용
public class RunImpl implements Runnable {
    boolean suspentded = false;
    boolean stopped = false;


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
        }
    }
}
