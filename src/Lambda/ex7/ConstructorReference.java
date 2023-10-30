package Lambda.ex7;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {
    public static void main(String[] args) {
        Function<Integer, MyClass2> f = MyClass2::new;
//        Function<Integer, MyClass2> f = (i) -> new MyClass2(i);


        Supplier<MyClass> s = MyClass::new;
        //아래 주석과 같은 문장.
//        Supplier<MyClass> s = () -> new MyClass();
        MyClass mc = s.get();
        System.out.println("mc = " + mc);
        System.out.println(s.get());

        Supplier<MyClass2> s2 = MyClass2::new;
        MyClass2 mc2 = f.apply(100);
        System.out.println(mc2.iv);
        System.out.println(f.apply(100).iv);
        System.out.println(f.apply(200).iv);

        Function<Integer, int[]> f2 = int[]::new;
        int[] arr = f2.apply(300);
        System.out.println("arr.length = " + arr.length);

    }
}

class MyClass {
}
class MyClass2{
    int iv;

    public MyClass2(int iv) {
        this.iv = iv;
    }

    public MyClass2() {



    }
}


