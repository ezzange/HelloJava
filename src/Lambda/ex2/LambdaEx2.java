package Lambda.ex2;

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction myFunction1 = () -> System.out.println("myFunction1.run()");

        MyFunction myFunction2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("myFunction2.run()");
            }
        };

        MyFunction myFunction3 = getMyFunction();

        myFunction1.run();
        myFunction2.run();
        myFunction3.run();
    }



    static void execute(MyFunction myFunction) {
        myFunction.run();
    }

    static MyFunction getMyFunction() {
        MyFunction myFunction3 = () -> System.out.println("myFunction3.run()");
        return myFunction3;
    }
}
