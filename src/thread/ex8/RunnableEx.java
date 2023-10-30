package thread.ex8;

public class RunnableEx implements Runnable {
    Account acc = new Account();

    @Override
    public void run() {//100~300 의 랜덤값으로 출금하는 쓰레드
        while (acc.getBalance() > 0 ) {
            int money = (int) (Math.random()*3+1)*100;
            acc.withdraw(money);
            System.out.println("balance = " + acc.getBalance());

        }
    }
}
