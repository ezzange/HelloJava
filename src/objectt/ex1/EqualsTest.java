package objectt.ex1;

public class EqualsTest {
    public int id;

    public static void main(String[] args) {
        Value value = new Value(10);
        Value value2 = new Value(10);
        //하나의 객체주소의 하나의 객체를 생성하기 때문에 값은 같아도 객체주소값은 다르다.
        if (value.equals(value2)) {
            System.out.println("같다");
        } else
            System.out.println("다르다");
        //참조변수의 값(객체주소값)을 대입해주었기 때문에 같은 객체주소를 가리킨다.
        value2 = value;
        if (value.equals(value2)) {
            System.out.println("같다");
        } else
            System.out.println("다르다");
    }
}
