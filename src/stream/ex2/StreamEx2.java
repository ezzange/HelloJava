package stream.ex2;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamEx2 {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints(10,5,10); // 무한 스트림
        intStream.limit(10).forEach(System.out::println);
    }
}
