package objectt.ex7;

public class wrapperTest2 {
    public static void main(String[] args) {
        //문자열을 숫자로 변환 (문자열 -> 기본형)
        byte byt = Byte.parseByte("100");
        short sth = Short.parseShort("100");
        double dou = Double.parseDouble("100");

        //문자열을 숫자로 변환 (문자열 -> 래퍼 클래스)
        Integer i = Integer.parseInt("100");
        Integer i2 = Integer.valueOf("100");
        Integer integer = Integer.valueOf("100");
        Byte b = Byte.valueOf("100");
        short s = Short.valueOf("100");
        double double2 = Double.valueOf("3.14");
        //n진법의 문자열을 숫자로 변환
        int i4 = Integer.parseInt(("100"), 2);
        int i5 = Integer.parseInt(("100"), 8);
        int i6 = Integer.parseInt(("100"), 16);
        int i7 = Integer.parseInt(("FF"), 16);
        System.out.println("i4 = " + i4);
        System.out.println("i5 = " + i5);
        System.out.println("i6 = " + i6);
        System.out.println("i7 = " + i7);
    }
}
