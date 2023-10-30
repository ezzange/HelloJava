package thread.ex8;

public class Account {
    private int balance = 1000;
    public int getBalance(){
        return balance;
    }
    //메서드에 synchronized 키워드가 없을 경우 - 동기화 x
    // 쓰레드가 작업을 처리하는 동안 0 이하의 잔고에서 출금해 잔고는 음수를 나타난다.
    //메서드에 synchronized 키워드가 있을 경우 - 동기화 완료
    //해당 메서드 임계영역으로 묶어 작업이 끝나는 동안 다른 쓰레드에서 들어올 수 없다.
    public synchronized void withdraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            balance -= money;
        }
    }
}
