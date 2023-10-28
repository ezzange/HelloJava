package Generics.ex3;

import interfacee.ex8.C;

public class GenericTest3 {
    public static void main(String[] args) {

        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<PineApple> pineAppleBox = new FruitBox<PineApple>();
        FruitBox<Cherry> CherryBox = new FruitBox<Cherry>();
//        FruitBox<Toy> ToyBox = new FruitBox<Toy>(); //컴파일 에러 Fruit를 상속받지 않아 컴파일 에러 발생

        fruitBox.add(new Fruit());
        fruitBox.add(new Fruit());
        fruitBox.add(new Fruit());
        fruitBox.add(new Fruit());
    }
}
