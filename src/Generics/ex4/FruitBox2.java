package Generics.ex4;

import java.util.ArrayList;


class FruitBox2<T extends Fruit2> extends Box2<T>{}

class Box2<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T itme) {
        list.add(itme);
    }

    T get(int i) {
        return list.get(i);
    }
    ArrayList<T> getList() {
        return list;
    }

    @Override
    public String toString() {
        return list.toString()
                ;
    }
}

