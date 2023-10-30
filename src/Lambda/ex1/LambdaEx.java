package Lambda.ex1;

public class LambdaEx {
    public static void main(String[] args) {
        //Object o = (a,b) -> a>b ? a:b; 람다식

        //람다식을 사용 하기 위해서 먼저 객체를 생성
        Object o = new Object() {//람다식의 익명 객체
            int max(int a, int b) {
                return a > b ? a : b;
            }
        };
//        int value = o.max(3, 5); //익명 객체는 부모클래스의 메서드를 사용할 수 없다.


        //아래 주석과 같은 코드.
        LambdaInterfaceEx ex = (a, b) -> a > b ? a : b;
        int value = ex.max(3, 5);
        System.out.println("value = " + value);

//        LambdaInterfaceEx ex = new LambdaInterfaceEx() {
//            @Override
//            public int max(int a, int b) {return a > b ? a : b;}
//        };
//        int value = ex.max(3, 5);
//        System.out.println("value = " + value);

    }
}
