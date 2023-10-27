package objectt.ex6;

public class wrapperTest {
    public static void main(String[] args) {
        Integer integer = new Integer(100);
        Integer integer2 = new Integer(100);

        System.out.println("integer==integer2 ? " +(integer == integer2));
        System.out.println("integer.equals(integer2) ? "+integer.equals(integer2));
        System.out.println("integer.compareTo(integer2) = " + integer.compareTo(integer2));
        System.out.println("integer.toString() = "+integer.toString());

        System.out.println("integer.MAX_VALUE = " + integer.MAX_VALUE);
        System.out.println("integer.MIN_VALUE = " + integer.MIN_VALUE);
        System.out.println("integer.SIZE  = " + integer.SIZE+"bits");
        System.out.println("integer.BYTES  = " + integer.BYTES+"bytes");
        System.out.println("integer.TYPE = " + integer.TYPE);
    }
}
