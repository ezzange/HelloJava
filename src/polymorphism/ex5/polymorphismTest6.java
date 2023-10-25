package polymorphism.ex5;

public class polymorphismTest6 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buy(new Item1());
        buyer.buy(new Item2());
        buyer.buy(new Item3());
        buyer.summary();

    }
}
