package Lambda.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx3 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int) (Math.random()*100 + 1);
        Consumer<Integer> consumer = i -> System.out.print(i + ", ");
        Predicate<Integer> predicate = i -> i % 2 == 0;
        Function<Integer, Integer> function = i -> i / 10 * 10;

        List<Integer> list = new ArrayList<>();
        makeRandomList(supplier, list);
        System.out.println(list);
        PrintEvenNum(predicate, consumer, list);
        List<Integer> newList = doSomething(function, list);
        System.out.println(newList);
    }
    //10개의 난수를 리스트로 반환하는 메서드
    static <T> List<T> doSomething(Function<T, T>function, List<T> list) {
        List<T> newList = new ArrayList<>(list.size());
        for (T i : list) {
            newList.add(function.apply(i));
        }
        return newList;
    }
    //주어진 리스트의 짝수를 반환하는 메서드
    static <T> void PrintEvenNum(Predicate<T> predicate, Consumer<T> consumer, List<T> list) {
        System.out.print("[");
        for (T i : list) {
            if (predicate.test(i))
                consumer.accept(i);
        }
        System.out.println("]");
    }
    //주어진 리스트의 요소들의 1의 자리를 없애는 메서드
    static <T> void makeRandomList(Supplier<T> supplier, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(supplier.get());
        }
    }
}
