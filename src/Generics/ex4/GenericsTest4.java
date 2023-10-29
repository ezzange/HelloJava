package Generics.ex4;

import java.util.Collection;
import java.util.Collections;

public class GenericsTest4 {
    public static void main(String[] args) {

        FruitBox2<Apple2> appleBox2 = new FruitBox2<Apple2>();
        FruitBox2<Cherry2> cherryBox2 = new FruitBox2<Cherry2>();

        appleBox2.add(new Apple2("Green Apple", 300));
        appleBox2.add(new Apple2("Green Apple", 200));
        appleBox2.add(new Apple2("Green Apple", 100));

        cherryBox2.add(new Cherry2("black cherry", 500));
        cherryBox2.add(new Cherry2("black cherry", 400));
        cherryBox2.add(new Cherry2("black cherry", 300));

        Collections.sort(appleBox2.getList(),new AppleComp());
        Collections.sort(cherryBox2.getList(), new CherryComp());
        System.out.println("appleBox2 = " + appleBox2);
        System.out.println("cherryBox2 = " + cherryBox2);
        System.out.println();

        Collections.sort(appleBox2.getList(), new Fruit2Comp());
        Collections.sort(cherryBox2.getList(), new Fruit2Comp());
        System.out.println("appleBox2 = " + appleBox2);
        System.out.println("cherryBox2 = " + cherryBox2);


    }
}
