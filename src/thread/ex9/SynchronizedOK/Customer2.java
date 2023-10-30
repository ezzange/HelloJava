package thread.ex9.SynchronizedOK;

import thread.ex9.SynchronizedNO.Table;

public class Customer2 implements Runnable{
    private Table2 table;
    private String food;

    public Customer2(Table2 table, String food) {
        this.table = table;
        this.food = food;
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            String name=Thread.currentThread().getName();
            table.remove(food);
            System.out.println(name+" "+food+" 냠냠성공 :) ");
        }
    }
}
