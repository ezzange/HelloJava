package Generics.ex1;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(100);
//        arrayList.add("30"); //컴파일에러 -> Generics를 사용하여 런타임 전 체크 가능 => 타입 체크 강화

        Integer i = arrayList.get(2); //저장할 데이터 타입이 Integer로 고정되어 있기 때문에 형변환 생략 가능
        System.out.println("arrayList = " + arrayList);

    }

}
