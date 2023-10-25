package polymorphism.ex1;

public class PolymorphismTest {
    public static void main(String[] args) {
        //타입 불일치 허용
        // => 부모타입의 참조변수로 자식타입의 인스턴스를 가르킬 수 있다.
        Display display = new SmartDisplay();

        //타입 불일치 불가
        //  => 자식타입의 참조변수는 부모타입의 인스턴스 객체를 가리킬 수 없다.
//        SmartDisplay smartDisplay = new Display();

    }
}
