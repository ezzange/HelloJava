package modifider.ex5;

import modifider.ex4.Parent;
//Parent와 다른 패키지에 있는 Parent의 자식 클래스 child
public class Child extends Parent {
    public void printMember() {
//        System.out.println( privateInt); //접근 제한으로 에러 발생
//        System.out.println( defaultInt); //접근 제한으로 에러 발생
        System.out.println( protectedInt);
        System.out.println( publicInt);
    }
}
