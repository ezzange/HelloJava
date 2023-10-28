package collections_ramework.hashmap;

import interfacee.ex8.I;

import java.util.*;

public class HashMapTest2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        //새로운 인스턴스 생성이 아닌
        map.put("이짱이", new Integer(80));
        map.put("이장이", Integer.valueOf(95));
        map.put("이짱희", Integer.valueOf(68));
        map.put("이장희", Integer.valueOf(84));
        map.put("이장님", Integer.valueOf(79));

        Set set = map.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println("이름 : "+ entry.getKey() + ", 점수 : "+ entry.getValue() );
            set = map.keySet();
            System.out.println("응시자 명단 : "+ set);

            Collection values = map.values();
            iterator = values.iterator();

            int total = 0;
            while (iterator.hasNext()) {
                Integer i = (Integer) iterator.next();
                total += i.intValue();
            }
            System.out.println("총 점수 = " + total);
            System.out.println("평균 점수 = " + total/set.size());

            System.out.println("최고점 = " + Collections.max(values));
            System.out.println("최저점 = " + Collections.min(values));
        }
    }
}
