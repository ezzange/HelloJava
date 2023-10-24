package composite;

class Point {
    int x;
    int y;
}

class Circle { //Circle는 Point를 가지고 있는 포함 관계 이다.

    Point point = new Point();
    int r;
}
public class CompositeTest {
    public static void main(String args[]) {
        //Circle의 객체만 생성 하여 Circle와 포함 관계인 Point 멤버를 사용할 수 있다.
        Circle circle = new Circle();

        circle.point.x = 1;
        circle.r = 3;
        System.out.println("yourCircle.x = " + circle.point.x);
        System.out.println("yourCircle.x = " + circle.point.y);
        System.out.println("yourCircle.x = " + circle.r);
    }
}
