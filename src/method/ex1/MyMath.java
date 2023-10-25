package method.ex1;

public class MyMath {

    public int add(int x, int y) {
        return x + y;
    }
    public int subtract(int x, int y) {
        return x - y;
    }
    public int multiply(int x, int y) {
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

    public int max2(int x, int y) {
        if (x>y){
            return x;
        }else//if문은 조건문이 참일때만 실행되니 else로 거짓일 경우에 실행 되도록 추가
            return y;
    }
    public int add3000(int x) {
        return x + 3000;
    }

    public int average(int x, int y) {
        return (x + y) / 2;
    }

    public void printGuGudan(int dan) {
        //1~9단이 아닌 경우 메서드는 실행되지 않고 종료
        if (! (1<=dan && dan <=9)) {
            return;
        }
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d%n", dan, i, dan * i);
                    //형식(int, float, double 등)에 구애 받지 않는 문자를 그대로 출력
        }
    }
}
