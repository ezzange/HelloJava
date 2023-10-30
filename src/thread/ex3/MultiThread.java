package thread.ex3;

public class MultiThread {

}
class MultiThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print(new String("@"));
            for (int x = 0; x < 10000000; x++) {
               //작업 소요 시간 지연용 for문
            }
        }
    }
}
class MultiThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print(new String("_"));
            for (int x = 0; x < 10000000; x++) {
                //작업 소요 시간 지연용 for문
            }
        }
    }
}