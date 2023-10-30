package thread.ex9.SynchronizedNO;

public class Cook implements Runnable {

    private Table table;

    Cook(Table table) {
        this.table = table;
    }
    public void run(){
        while (true) {
            int idx = (int) (Math.random() * table.dishNum());
            table.add(table.dishNames[idx]);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {

            }
        }
    }
}
