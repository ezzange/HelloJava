package composite.ex2;


import composite.ex1.Circle;


public class CompositeTest {
    public static void main(String args[]) {
        //Circle의 객체만 생성 하여 Circle와 포함 관계인 Point 멤버를 사용할 수 있다.
        Circle2 circle2 = new Circle2();

        circle2.point2.x = 1;
        circle2.point2.y = 1;
        circle2.r = 3;
        System.out.println("yourCircle.x = " + circle2.point2.x);
        System.out.println("yourCircle.x = " + circle2.point2.y);
        System.out.println("yourCircle.x = " + circle2.r);
    }
}
