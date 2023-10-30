package enums.ex1;

public class EnumTest {
    public static void main(String[] args) {
        //열거형 상수 변수 선언
        Direction d1 = Direction.EAST; // 열거형 타입.상수이름
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Direction.valueOf(Direction.class, "WEST");

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("d1==d3 = " + (d1 == d3));
        System.out.println("d2==d3 = " + (d2 == d3));
        System.out.println("d1.equals(d3) = " + d1.equals(d3));
        System.out.println("d1.compareTo(d3) ? = " + (d1.compareTo(d3)) );
        System.out.println("d2.compareTo(d3) ? = " + (d2.compareTo(d3)) );

        switch (d1) {
            case EAST:
                System.out.println("The direction id EAST"); break;
            case SOUTH:
                System.out.println("The direction id SOUTH"); break;
            case WEST:
                System.out.println("The direction id WEST"); break;
            case NORTH:
                System.out.println("The direction id NORTH"); break;
        }
                        //열거형의 모든 상수를 배열 반환
        Direction[] arr = Direction.values();

        for (Direction direction : arr) {//열거형 상수의 이름과 상수가 정의된 순서 반환
            System.out.printf("%s=%d%n", direction.name(), direction.ordinal());
        }
    }
}
