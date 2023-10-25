package method.ex5;

public class MyMath2 {
    //매개변수 타입이 다르다면 같은 이름의 메서드를 여러 개 선언할 수 있다.
    public int add(int x, int y) {
        System.out.print("int add(int x, int y) : ");
        return x + y;
    }
    public long add(long x, int y) {
        System.out.print("int add(long x, int y) : ");
        return x + y;
    }
    public long add(int x, long y) {
        System.out.print("int add(int x, long y) : ");
        return x + y;
    }
    public long add(long x, long y) {
        System.out.print("int add(long x, long y) : ");
        return x + y;
    }
    public int add(int[] x){ //배열의 모든 합을 돌려주는 메서드
        System.out.print("int add(int[] x : ");
        int result = 0;
        for (int i=0; i<x.length; i++) {
            result += x[i];

        }return result;
    }
}
