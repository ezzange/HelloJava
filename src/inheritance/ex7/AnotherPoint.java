package inheritance.ex6;

class const extends Object{
    int x;
    int y;

    AnotherPoint() {
        this(0, 0);
    }

    AnotherPoint(int x, int y) {
        super();//작성하지 않는다면 컴파일러가 자동 삽입
        this.x = x;
        this.y = y;
    }
}
