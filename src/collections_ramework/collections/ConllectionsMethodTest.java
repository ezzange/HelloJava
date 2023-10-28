package collections_ramework.collections;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.*;

public class ConllectionsMethodTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println("list = " + list);

        addAll(list, 1, 2, 3, 4, 5, 6, 7); // list에 모두 추가
        System.out.println("list = " + list);

        rotate(list, 3); // 인덱스 위치 오른쪽으로 3칸씩 이동되고 마지막 값은 가장 앞으로 온다. => 반 시계 방향으로 list내에서 회전
        System.out.println("list = " + list);

        swap(list, 0, 3); // 인덱스 위치 기준 0과 3 교환
        System.out.println("list = " + list);

        shuffle(list); // 저장된 위치를 임의로 변경
        System.out.println("list = " + list);

        sort(list.reversed()); // 역순 정렬 reverse(list);와 동일
        System.out.println("list = " + list);

        sort(list); // 정렬
        System.out.println("list = " + list);

        int index = binarySearch(list, 5); //index 위치 5의 값을 반환 //사용전 정렬필 요
        System.out.println("index = " +max(list)); //최댓값
        System.out.println("max = " + min(list)); //최솟값
        System.out.println("index = " +max(list, reverseOrder())); //최솟값

        List list1 = nCopies(list.size(), 2); //list와 동일한 길이의 list를 만들고 2로 채우기

        System.out.println("A와 B의 공통 분모가 없으면 Ture : " + disjoint(list, list1));

        copy(list, list1);//list1에 list 복사
        System.out.println("list = " + list);
        System.out.println("list1 = " + list1);

        replaceAll(list, 2, 1); //모든 2를 전부 1로 변경
        System.out.println("list = " + list);




    }
}
