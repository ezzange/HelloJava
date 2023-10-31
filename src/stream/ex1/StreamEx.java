package stream.ex1;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        //Collection인터페이스의 Stream
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();
        intStream.forEach(System.out::print);

        intStream = list.stream();
        intStream.forEach(System.out::print);
        System.out.println();
        //객체 배열로부터 스트림을 생성
        String[] strArr = new String[]{"a", "b", "c","d"};
        Stream<String> strStream = Stream.of(strArr);
        strStream.forEach(System.out::print);

        Stream<String> strStream1 = Stream.of("a", "b", "c","d");
        Stream<String> strStream2 = Arrays.stream(strArr);
        strStream1.forEach(System.out::print);
        strStream2.forEach(System.out::print);

        System.out.println();

        int[] intArr = {1, 2, 3, 4, 5};
        IntStream intStream1 = Arrays.stream(intArr);
//        intStream1.forEach(System.out::print); //최종연산
        //숫자스트림은 sum(),average() 등 수를 명확히 가지고 있고 계산이 가능
//        System.out.println("sum = " + intStream1.sum()); //최종연산
        System.out.println("average = " + intStream1.average()); //최종연산

        Integer[] intArr2 = {1, 2, 3, 4, 5};
        Stream<Integer> intStream2 = Arrays.stream(intArr2);
//        intStream2.forEach(System.out::print); //최종연산
        //객체스트림은 count()
        System.out.println("count = " + intStream2.count()); //최종연산

        System.out.println();
    }
}
