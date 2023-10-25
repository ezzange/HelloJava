package polymorphism.ex5;

public class Buyer {
    int money=10000;
    int point=0;

    Product[] cart = new Product[10]; //구입한 제품을 저장하기 위한 배열
    int i = 0;

    public void buy(Product product) {
        if (money < product.price) {
            System.out.println("상품의 가격은 "+product.price+"원 입니다");
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= product.price;
        point += product.point;
        cart[i++] =product; //배열 cart에 구매하는 제품을 저장한다.
        System.out.println(product+"을 구매하셨습니다. ");

    }
    public void summary() {
        int sumPrice = 0;
        int sumPoint = 0;
        String itemList = " ";

        for (int i =0; i<cart.length; i++) {
            if(cart[i]==null) break;
            sumPrice += cart[i].price;
            sumPoint += cart[i].point;
            itemList += cart[i] + " ";
        }
        System.out.println("구매한 제품은 ["+itemList+"] 입니다.");
        System.out.println("구매한 제품들의 총 금액은 "+sumPrice+"원, "+"총 적립금은 "+sumPoint+" 입니다.");


    }
}
