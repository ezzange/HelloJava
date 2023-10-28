package collections_ramework.hashmap;

import java.util.*;

public class HashMapTest2 {
    public static void main(String[] args) {
        HashMap hash = new HashMap();
        hash.put("이짱이", Integer.valueOf(80));
        hash.put("이장이", Integer.valueOf(95));
        hash.put("이짱희", Integer.valueOf(68));
        hash.put("이장희", Integer.valueOf(84));
        hash.put("이장님", Integer.valueOf(79));

        Set set = hash.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(" 이름 : "+ entry.getKey() + ", 점수 : "+ entry.getValue()+" " );
            set = hash.keySet();
            System.out.println("응시자 명단 : "+ set);

            Collection values = hash.values();
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
