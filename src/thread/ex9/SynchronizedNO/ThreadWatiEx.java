package thread.ex9.SynchronizedNO;

import thread.ex9.SynchronizedNO.Cook;
import thread.ex9.SynchronizedNO.Customer;
import thread.ex9.SynchronizedNO.Table;

public class ThreadWatiEx {
    public static void main(String[] args) throws InterruptedException {

        Table table = new Table();

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table, "donut"),"CUSTOMER1").start();
        new Thread(new Customer(table, "burger"),"CUSTOMER2").start();

        Thread.sleep(200);
        System.exit(0);

    }
}
