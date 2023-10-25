package polymorphism.ex5;

public class polymorphismTest5 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        Item1 item1 = new Item1();
        buyer.buy(item1);
        System.out.println(item1.point+"원이 적립되었습니다.");
        Item3 item3 = new Item3();
        buyer.buy(item3);
        System.out.println(item3.point+"원이 적립되었습니다.");

        Item2 item2 = new Item2();
        buyer.buy(item2);
        System.out.println(item2.point+"원이 적립되었습니다.");

        System.out.println("현재 남은 잔액은 "+buyer.money+" 원 입니다.");
        System.out.println("현재 누적된 적립금은 "+buyer.point+" 원 입니다.");

        buyer.buy(new Item4());
    }
}
