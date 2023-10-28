package collections_ramework.comparable;

import interfacee.ex1.Player;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Comparator;

public class ComparableTest {
    public static void main(String[] args) {
        String[] strings = {"cat", "dog", "lion", "tiger"};

        Arrays.sort(strings); //String의 Comparable 인터페이스의 compare()메서드를 구현해둔것을 정렬기준으로 이용하 정렬
        System.out.println("strings = " + Arrays.toString(strings));
                    //대상, 정렬기준
        Arrays.sort(strings,String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 없는 기준 CASE_INSENSITIVE_ORDER
                    //대상, 정렬기준
        Arrays.sort(strings, new Descending()); //> 직접 정렬기준을 오버라이딩하여 오름차순에서 내림차순으로 변경하여 사용함
        System.out.println("strings = " + Arrays.toString(strings));
    }

    static class Descending implements Comparator {
        public int compare(Object o, Object object){
            if (o instanceof Comparable && object instanceof Comparable) {
                Comparable comparable = (Comparable) o;
                Comparable comparable2 = (Comparable) object;
                return comparable.compareTo(comparable2) * -1; //-1을 곱해서 기본 정렬방식의 역으로 변경한다.
            }           // 아니면 comparable2.compareTo(comparable)로 A와 B의 위치를 서로 바꾼다.
                        // 아니면 A - B; 음수가 나오기 때문에 오른쪽이 더 크다 판단하고 자리 이동
            return -1;
        }
    }
}

