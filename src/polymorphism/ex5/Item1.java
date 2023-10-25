package polymorphism.ex5;

public class Item1 extends Product{
    public Item1() {
        super(2000); //super() 생성자를 이용하여 부모클래스의 멤버인 price를 초기화
    }

    public String toString() {
        return "맛밤";
    }
}
