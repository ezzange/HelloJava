package enums.ex2;

public class EnumTest2 {
    public static void main(String[] args) throws IllegalAccessException {
        for (Direction2 direction2 : Direction2.values()) {
            System.out.printf("%s=%d%n", direction2.name(), direction2.getValue());
        }
        Direction2 d1 = Direction2.EAST;
        Direction2 d2 = Direction2.of(1);

        System.out.printf("d1= %s, %d%n", d1.name(), d1.getValue());
        System.out.printf("2= %s, %d%n", d1.name(), d1.getValue());

        System.out.println(Direction2.EAST.rotate(1));
        System.out.println(Direction2.EAST.rotate(2));
        System.out.println(Direction2.EAST.rotate(-1));
        System.out.println(Direction2.EAST.rotate(-2));
    }
}
