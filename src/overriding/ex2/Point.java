package overriding.ex2;

class Point extends Object{
    int x;
    int y;

    //외부 클래스에서 변수값의 초기화를 간편하게 할 수 있도록 생성자 생성
    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
    //Object의 toString() 오버라이딩
    public String toString() {
        return "x : " + x + ", y : " + y;
    }
}
