package stream.ex6;

import stream.ex1.StreamEx;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx6 {
    public static void main(String[] args) {
        Stream<String[]> strArrStream = Stream.of(
          new String[]{"ab","cd","ef"},
          new String[]{"ez","ee","cd"}
        );
        Stream<String> strStream = strArrStream.flatMap(Arrays::stream);
        strStream.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
                "Let's know why this happens and use it",
                "The time set on the timetable must be observed by the person set."
        };
        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();
    }
}
