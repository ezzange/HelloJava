package enums.ex2;

import enums.ex1.Direction;

import java.util.Map;

public enum Direction2 {
    EAST(1, ">"), SOUTH(2,"v"), WEST(3,"<"), NORTH(4,"^");

    private static final Direction2[] DIR_ARR = Direction2.values();
    private final int value;
    private final String symbol;

    //열거형 상수에 값을 추가하기 위해 생성자를 추가
    Direction2(int value, String symbol) {
        this.value=value;
        this.symbol= symbol;
    }
    public int getValue() {
        return value;
    }
    public String getSymbol() {
        return symbol;
    }

    //입력받은 값에 따라 해당값의 열거형 상수를 반환하는 메서드
    public static Direction2 of(int dir) throws IllegalAccessException {
        if (dir < 1 || dir > 4) {
            throw new IllegalAccessException("Invalid value :" + dir);
        }
        return DIR_ARR[dir -1];
    }

    //방향을 회전 시키는 메서드
    public Direction2 rotate(int num) {
        num = num %4 ;
        if (num < 0) {
            num += 4;
        }
        return DIR_ARR[(value - 1 + num) % 4];
    }

    @Override
    public String toString() {
        return name() + getSymbol();
    }

}
