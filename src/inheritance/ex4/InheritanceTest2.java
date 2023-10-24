package inheritance.ex4;



public class InheritanceTest2 {
    public static void main(String[] args) {

        MyCircle myCircle = new MyCircle();

        myCircle.x = 1;
        myCircle.y = 2;
        myCircle.r = 3;

        System.out.println("myCircle.x = " + myCircle.x);
        System.out.println("myCircle.x = " + myCircle.y);
        System.out.println("myCircle.x = " + myCircle.r);

        MyPoint myPoint = new MyPoint();
        MyPoint myPoint2 = new MyPoint();
        //println은 참조 변수가 들어 오면 toString( )메서드를 호출 한다.
        System.out.println("myPoint 객체 주소 값 = " + myPoint);
        System.out.println("myPoint 객체 주소 값 = " + myPoint.toString());
        System.out.println("myPoint2 객체 주소 값 = " + myPoint2.toString());

    }
}
