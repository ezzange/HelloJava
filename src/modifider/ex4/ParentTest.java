package modifider.ex4;

public class ParentTest {
    public static void main(String[] args) {
        Parent parent = new Parent();
//        System.out.println( parent.privateInt); //접근 제한으로 에러 발생
        System.out.println( parent.defaultInt);
        System.out.println( parent.protectedInt);
        System.out.println( parent.publicInt);
    }
}
