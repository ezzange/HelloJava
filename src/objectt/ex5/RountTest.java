package objectt.ex5;

public class RountTest {
    public static void main(String[] args) {
        double sum = 0;
        double sum1 = 0;
        double sum2 = 0;
        for (double d = 1.5; d <= 10; d++) {
            double d1 = Math.round(d);
            double d2 = Math.rint(d);
            //rint()은가까운 정수에 따라 버림과 올림을 구분해 반올림하여 오차가 적어 비교적 원레깂과 가까운 수가 나온디
            System.out.printf("%4.1f, %4.1f, %4.1f%n", d, d1, d2);

            sum += d;
            sum1 += d1;
            sum2 += d2;

        }
    }
}
