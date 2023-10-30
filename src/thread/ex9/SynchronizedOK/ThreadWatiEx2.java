package thread.ex9.SynchronizedOK;

public class ThreadWatiEx2 {
    public static void main(String[] args) throws InterruptedException {

        Table2 table = new Table2();

        new Thread(new Cook2(table), "COOK1").start();
        new Thread(new Customer2(table, "donut"),"CUSTOMER1").start();
        new Thread(new Customer2(table, "burger"),"CUSTOMER2").start();

        Thread.sleep(200);
        System.exit(0);

    }
}
