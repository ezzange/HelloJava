package Generics.ex1;

import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
        ArrayList<Display> displays = new ArrayList<Display>();

        displays.add(new Display());
//        displays.add(new SmartDisplay()); 지정한 데이터 타입이 아니라 컴파일 에러

        Display display = displays.get(0); // 형변환을 생략하고 displays의 첫번째 요소를 꺼낸다.
        System.out.println(display);

        //다형성을 이용하여 부모 객체의 데이터 타입이라면 자식 데이터타입도 ok
        ArrayList<Prodect> prodectList = new ArrayList<Prodect>();
        prodectList.add(new Display());
        prodectList.add(new Studio());
        printAll(prodectList);
//        printAll(Display); //  <Display> : ArrayList<Prodect> list 참조변수와 생성자 불일치로 컴파일에러
    }

    public static void printAll(ArrayList<Prodect> list) {
        for (Prodect p : list) {
            System.out.println(p);
        }
    }
}
