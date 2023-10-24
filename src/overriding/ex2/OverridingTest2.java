package overriding.ex2;

class Point2 extends Object{
    int x;
    int y;

    //외부 클래스에서 변수값의 초기화를 간편하게 할 수 있도록 생성자 생성
    Point2(int x, int y) {
        this.x=x;
        this.y=y;
    }
//Object의 toString() 오버라이딩
    public String toString() {
        return "x : " + x + ", y : " + y;
    }
}
public class OverridingTest2 {
    public static void main(String[] args) {
        Point2 point2 = new Point2(10,20);
        System.out.println(point2);

//        Point2 point2 = new Point2();
//        point2.x = 10;
//        point2.y = 10;
//        System.out.println("p.x="+p.x);
//        System.out.println("p.y="+p.y);

    }




}
