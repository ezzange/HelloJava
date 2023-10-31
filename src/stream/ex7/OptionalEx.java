package stream.ex7;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        int[] arr = new int[0];
        System.out.println("arr.length = " + arr.length);

        Optional<String> optional = Optional.empty();
        System.out.println("optional = " + optional);
        Optional<String> optional2 = Optional.of("abc");



        String string = "";

        string = optional.orElse("EMPTY"); // Optional에 저장된 값이  null 이면 ""반
        System.out.println("string = " + string);
//        string = optional2.orElseGet( ()-> new String()); 아래와 같은 문장
        string = optional2.orElseGet(String::new); // Optional 객체의 string으로 인스턴스 생성
        System.out.println("string = " + string);
    }
}
