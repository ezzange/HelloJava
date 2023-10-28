package Generics.ex3;

import interfacee.ex8.C;

public class GenericTest3 {
    public static void main(String[] args) {

        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<PineApple> pineAppleBox = new FruitBox<PineApple>();
        FruitBox<Cherry> CherryBox = new FruitBox<Cherry>();
//        FruitBox<Rain> rainBox = new FruitBox<Rain>(); //컴파일 에러 Fruit를 상속받지 않아 컴파일 에러 발생
        Box<Rain> rainBox = new Box<Rain>();
        Box<Ezzange> ezzangeBox= new Box<Ezzange>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new PineApple());
        fruitBox.add(new Cherry());
        appleBox.add(new Apple());
        pineAppleBox.add(new PineApple());
        CherryBox.add(new Cherry());
        rainBox.add(new Rain());
        ezzangeBox.add(new Ezzange());
        System.out.println("fruitBox = " + fruitBox);
        System.out.println("appleBox = " + appleBox);
        System.out.println("pineAppleBox = " + pineAppleBox);
        System.out.println("CherryBox = " + CherryBox);
        System.out.println("rainBox = " + rainBox);
        System.out.println("ezzangeBox = " + ezzangeBox);
    }
}
