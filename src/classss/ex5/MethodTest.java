package classss.ex5;

public class MethodTest {
    public static void main(String[] args) {

        MyMath myMath = new MyMath();
        int x = 20;
        int y = 10;

        System.out.println("x + 3000 = " + myMath.add3000(x));
        System.out.println("x + y = " + myMath.add(x,y));
        System.out.println("x - y = " + myMath.subtract(x,y));
        System.out.println("x * y = " + myMath.multiply(x,y));
        System.out.println("x / y = " + myMath.divade(x,y));
        System.out.println("x 와 y 중 최댓값은? = " + myMath.max(x,y));
        System.out.println("x 와 y 중 최솟값은? = " + myMath.min(x,y));
        System.out.println("x 와 y 의 평균값은? = " + myMath.average(x,y));
    }
}
