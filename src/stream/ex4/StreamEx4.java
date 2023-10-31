package stream.ex4;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("이짱이",1,200),
                new Student("이장이",2,400),
                new Student("이잔희",3,300),
                new Student("이잔인",3,100),
                new Student("이장임",2,250),
                new Student("이장님",1,350)
        );

//        studentStream.forEach(System.out::println);
//        studentStream.limit(5).sorted().forEach(System.out::println);
        studentStream.sorted(Comparator.comparing(Student::getBan))
                .forEach(System.out::println);

    }
}
