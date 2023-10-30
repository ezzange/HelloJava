package Lambda.ex6;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {
    public static void main(String[] args) {
        //      <입력, 출력>           클래스명::메서드이름;
        Function<String, Integer> f = Integer::parseInt;
        //아래 주석과 같은 문장.
        //Function<String,Integer> f =  (String s) -> Integer.parseInt(s);
        System.out.println(f.apply("100") + 200);


    }
}