package collections_ramework.hashset;

import java.util.HashSet;

public class HashSetTest2 {
    public static void main(String[] args) {
        HashSet HashSet = new HashSet();
        HashSet HashSet2 = new HashSet();

        HashSet.add(4);
        HashSet.add(1);
        HashSet.add(6);
        HashSet.add(23);
        System.out.println("HashSet = " + HashSet);
        HashSet2.add(23);
        HashSet2.add(11);
        HashSet2.add(5);
        HashSet2.add(8);
        System.out.println("HashSet2 = " + HashSet2);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@");

//        HashSet.retainAll(HashSet2); // 교집합
//        System.out.println("HashSet = " + HashSet);
//        HashSet.addAll(HashSet2); //합집합
//        System.out.println("HashSet = " + HashSet);
        HashSet.removeAll(HashSet2); //차집합
        System.out.println("HashSet = " + HashSet);






    }
}
