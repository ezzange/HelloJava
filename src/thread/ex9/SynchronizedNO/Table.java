package thread.ex9.SynchronizedNO;

import java.util.ArrayList;
// 동기화가 되지 않은 ㅌㅔ이블
public class Table {
    public String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    public void add(String dish) {
        if (dishes.size() >= MAX_FOOD)
            return;
            dishes.add(dish);
            System.out.println("Dishes : " + dishes.toString());

    }

    public boolean remove(String dishName) {
        for (int i = 0; i < dishes.size(); i++) {
            if (dishName.equals(dishes.get(i))) {
                dishes.remove(i);
                return true;
            }
        }
        return false;
    }
    public int dishNum() {
        return dishNames.length;
    }
}
