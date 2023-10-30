package thread.ex1;

public class ThreadTest {
    public static void main(String[] args) {
        // Thread를 상속받은 클래스 인스턴스 생성
        ThreadEx1_1 t1 = new ThreadEx1_1();

        // Runnable을 구현한 클래스 인스턴스 생성
        Runnable r = new ThreadEx1_2(); // 1. 인터페이스 타입으로 인터페이스를 구현한 클래스 객체 생성
        Thread t2 = new Thread(r); // 2. 매개변수에 해당 주솟값을 가리키는 참조변수 r를 넣고 Thread 생성자를 이용(Runnable target)하여 쓰레드 타입의 인스턴스 생성
        // ㄴㅡ> Thread t2 = new Thread(new ThreadEx1_2());

        //쓰레드 실행
        t1.start();
        t2.start();

    }
}
