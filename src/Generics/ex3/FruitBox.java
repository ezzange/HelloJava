package Generics.ex3;

import java.util.ArrayList;

// Fruit는 Eatable를 상속 받았기 때문에 & Eatable를 생략할 수 있다.
                // 인터페이스는 , 가 아닌 &
class FruitBox<T extends Fruit & Eatable> extends Box<T>{ }

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {list.add(item);}
    T get(int i) {return  list.get(i);}
    int size(){return list.size();}
    public String toString(){return list.toString();}

}

