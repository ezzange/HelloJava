package collections_ramework.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        set.add("aaa");
        set.add("bbb"); //중복 저장 X
        set.add(new Person("David","2013",10));
        set.add(new Person("David","2013",11));
        System.out.println("set = " + set);
    }
}
