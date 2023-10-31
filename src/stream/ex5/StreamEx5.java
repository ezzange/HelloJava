package stream.ex5;

import stream.ex1.StreamEx;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main(String[] args) {
        File[] fileArr = {
                new File("Ex1.java"),
                new File("Ex2.ex"),
                new File("Ex3.java"),
                new File("Ex4"),
                new File("Ex5.txt"),
                new File("Ex6.java")
        };

        Stream<File> fileStream = Stream.of(fileArr);

        Stream<String> fileNameStream = fileStream.map(File::getName);
        fileNameStream.forEach(System.out::println);

        fileStream = Stream.of(fileArr);
        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.') != -1) //확장자가 없는 것은 제외한다.
                .peek(s-> System.out.printf("filename=%s%n",s)) //스트림을 소비하지 않고 스트림의 요소를 확인한다.
                .map(s -> s.substring(s.indexOf('.') + 1)) //확장자만 추출한다.
                .map(String::toUpperCase) //대문자로 변환
                .distinct() //중복제거
                .forEach(System.out::println);

        System.out.println();

    }


}
