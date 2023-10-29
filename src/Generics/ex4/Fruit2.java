package Generics.ex4;

import java.util.Comparator;

public class Fruit2 {
    String name;
    int weight;

    public Fruit2(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString(String name, int weight) {
        return name + (" " + weight + " ");

    }
}
    class Juice {
    String name;
    Juice(String name) {
        this.name = name + "Juice";
    }
    public String toString(String name) {
    return name;
    }
}
    class Apple2 extends Fruit2 {
    Apple2(String name, int weight) {
        super(name, weight);
    }
}
    class Cherry2 extends Fruit2 {
    Cherry2(String name, int weight) {
        super(name, weight);
    }
}


class AppleComp implements Comparator<Apple2> {
    @Override
    public int compare(Apple2 t1, Apple2 t2) {
        return t2.weight - t1.weight;
    }
}
class CherryComp implements Comparator<Cherry2> {
    @Override
    public int compare(Cherry2 t1, Cherry2 t2) {
        return t2.weight - t1.weight;
    }
}
class Fruit2Comp implements Comparator<Fruit2> {
    @Override
    public int compare(Fruit2 t1, Fruit2 t2) {
        return t2.weight - t1.weight;
    }
}




