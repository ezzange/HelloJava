package objectt.ex3;

public class EqualsTest3 {
    public static void main(String[] args) {
        // String 비교를 위한 객체 생성
        String string1 = "abc"; // 문자열 리터럴 "abc"의 주소가 string1에 저장
        String string2 = "abc"; // 문자열 리터럴 "abc"의 주소가 string2에 저장
        String string3 = new String("abc"); // 새로운 String 인스턴스를 생성하여 해당 인스턴스 주소를 string3에 저장
        String string4 = new String("abc"); // 또 다른 String 인스턴스를 생성하여 해당 인스턴스 주소를 string3에 저장
    }

}
