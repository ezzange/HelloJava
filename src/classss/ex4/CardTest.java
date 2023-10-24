package classss.ex4;

public class CardTest {
    public static void main(String args[]){
        //클래스 변수(static 변수) cv는 객체를 생성 하지 않아도 사용 가능 하다.
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.width = " + Card.height);

        Card card = new Card();
        //인스턴스 변수 iv는 객체를 생성 해야 사용 가능 하다.
        card.kind = "Heart";
        card.number = 7;
        System.out.println("c1은 " + card.kind + " "+ card.number + "이며, 크기는 가로 : " + Card.width +", 세로 : "+ Card.height + "이다.");
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");

        //static 변수 값 변경
        Card.width = 50;
        Card.height = 80;
        System.out.println("c1은 " + card.kind + " "+ card.number + "이며, 크기는 가로 : " + Card.width +", 세로 : "+ Card.height + "이다.");
    }
}
