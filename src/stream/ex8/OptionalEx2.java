package stream.ex8;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx2 {
    public static void main(String[] args) {
        Optional<String> optionalStr = Optional.of("adc");
        Optional<Integer> optionalInt = optionalStr.map(s->s.length());
        Optional<Integer> optionalInt1 = optionalStr.map(String::length);
        System.out.println("optionalStr = " + optionalStr.get());
        System.out.println("optionalInt = " + optionalInt.get());
        System.out.println("optionalInt1 = " + optionalInt1.get());

        int result = Optional.of("123")
                .filter(x-> x.length() > 0)
                .map(Integer::parseInt).get();
        int result2 = Optional.of("")
                .filter(x-> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);

        Optional.of("12345").map(Integer::parseInt)
                .ifPresent((x) -> System.out.printf("result3=%d%n", x));
        OptionalInt opInt = OptionalInt.of(0);
        OptionalInt opInt2 = OptionalInt.empty();

        System.out.println("opInt = " + opInt);
        System.out.println("opInt2 = " + opInt2);
        System.out.println("opInt.isPresent() = " + opInt.isPresent());
        System.out.println("opInt2.isPresent() = " + opInt2.isPresent());
        System.out.println("opInt = " + opInt);
        System.out.println("opInt2 = " + opInt2);
        System.out.println("opInt.equals(opInt2) = " + opInt.equals(opInt2));

    }
}
