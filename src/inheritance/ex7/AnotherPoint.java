package inheritance.ex7;

class ConstructorTest extends Object{
    int x;
    int y;

    ConstructorTest() {
        this(0, 0);
    } //생성자 this()

    ConstructorTest(int x, int y) {
        super();//작성하지 않는다면 컴파일러가 자동 삽입
        this.x = x; //참조변수 this
        this.y = y;
    }
}
