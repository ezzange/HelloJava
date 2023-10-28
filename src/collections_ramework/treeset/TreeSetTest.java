package collections_ramework.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        //비교하기 전 정렬 필요 없음.
        //Test 클래스에 Comparable 인터페이스를 상속받아 CompareTo() 메서드를 구현하여 객체 자체에 비교 기준을 가지고 있던지
        Set set2 = new TreeSet();

        set2.add(new Test());
        set2.add(new Test());
        set2.add(new Test());
        System.out.println("set2 = " + set2);
        //새로 생성될 TreeSet에 비교 기준을 가지고 있던지 해야 생성 가능
        Set set = new TreeSet(new TestComp());

        set.add(new TestComp());
        set.add(new TestComp());
        set.add(new TestComp());
        System.out.println("set = " + set);


    }
}
