package collections_ramework.treeset;

import java.util.TreeSet;

public class SubSetMethod {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        String from = "b";
        String to = "d";

        treeSet.add("aaa"); treeSet.add("bbb"); treeSet.add("ccc");
        treeSet.add("ddd"); treeSet.add("car"); treeSet.add("driver");
        treeSet.add("pink"); treeSet.add("red"); treeSet.add("blue");

        System.out.println(treeSet);
        System.out.println("range search : from - " + from + " to - " + to);
        System.out.println("result : " + treeSet.subSet(from, to));
        //b포함 ~ d불포함 으로 시작하는 인스턴스들
        System.out.println("result2 : " + treeSet.subSet(from, to+"zzz"));
        //만약 끝까지 얻고 싶다면 to에 zzz를 더해준다.

    }
}
