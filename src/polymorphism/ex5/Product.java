package polymorphism.ex5;

public class Product {
    int price;
    int point;

    Product(int price) { //price 값을 받아 price값과 point값을 초기화 해주는 생성자
        this.price = price;
        point = (int) (price / 20.0 );
    }
}
