package thread.ex9.SynchronizedOK;

public class Cook2 implements Runnable {

    private Table2 table;

    Cook2(Table2 table) {
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
