package objectt.ex2;

public class EqualsTest2 {
    public static void main(String[] args) {
        Parson parson = new Parson(100);
        Parson parson2 = new Parson(100);

        if (parson.equals(parson2)) {
            System.out.println("같다");
        } else
            System.out.println("다르다");

    }
}
