package annotationn.ex1;

import Generics.ex1.Prodect;
import modifider.ex4.Parent;

public class DeprecatedTest {
    public static void main(String[] args) {
        Child child = new Child();
        child.printMembers(); //printMembers에 커서를 대면 printMembers()' is deprecated 설명을 볼 수 있다.
                              //실행은 되지만 사용하지 않을 것을 권함.
    }


}
class Child extends Parent {

    @Override
    @Deprecated
    public void printMembers() {
        super.printMembers();
    }
}
