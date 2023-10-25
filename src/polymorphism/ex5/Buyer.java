package polymorphism.ex5;

public class Buyer {
    int money=10000;
    int point=0;


    public void buy(Product product) {
        if (money < product.price) {
            System.out.println("상품의 가격은 "+product.price+"원 입니다");
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= product.price;
        point += product.point;
        System.out.println(product+"을 구매하셨습니다. ");
    }
}
