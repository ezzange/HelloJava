package classss.ex5;

public class MyMath {

    public int add(int x, int y) {
        return x + y;
    }public int subtract(int x, int y) {
        return x - y;
    }public int multiply(int x, int y) {
        return x * y;
    }
    public int divade(int x, int y) {
        return x / y;
    }
    public int min(int x, int y) {
        return x < y ? x : y; //Math.min(x, y)
    }
    public int max(int x, int y) {
        return x > y? x : y; //Math.max(x, y)
    }
    public int add3000(int x) {
        return x + 3000;
    }

    public int average(int x, int y) {
        return (x + y) / 2;
    }

}
