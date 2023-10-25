package method.ex5;

public class overloadingTest {
    public static void main(String[] args) {

        MyMath2 myMath2 = new MyMath2();
        System.out.println(myMath2.add(10,20));
        System.out.println(myMath2.add(10,20L));
        System.out.println(myMath2.add(10L,20));
        System.out.println(myMath2.add(10L,20L));

        int[] x = {10, 20, 30};
        System.out.println(myMath2.add(x));
    }
}
