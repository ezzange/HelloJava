package thread.ex9.SynchronizedNO;

public class Customer implements Runnable{
    private Table table;
    private String food;

    public Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            String name=Thread.currentThread().getName();
            if (eatFood()) {
                System.out.println(name + " 냠냠성공 " +food);
            } else
                System.out.println(name + " 냠냠실패 :(");
        }
    }
    boolean eatFood() {
        return table.remove(food);
    }
}
