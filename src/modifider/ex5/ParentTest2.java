package modifider.ex5;

import modifider.ex4.Parent;
//Parent와 다른 패키지에 있는 클래스
public class ParentTest2 {
    public static void main(String[] args) {
        Parent parent = new Parent();
//        System.out.println( parent.privateInt); //접근 제한으로 에러 발생
//        System.out.println( parent.defaultInt); //접근 제한으로 에러 발생
//        System.out.println( parent.protectedInt); //접근 제한으로 에러 발생
        System.out.println( parent.publicInt);
    }
}
