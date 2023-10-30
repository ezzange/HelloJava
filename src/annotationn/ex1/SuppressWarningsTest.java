package annotationn.ex1;

//둘 이상의 경고를 동시에 억제
//@SuppressWarnings("deprecation", "unchecked", "varargs")
@SuppressWarnings("deprecation")
public class SuppressWarningsTest {
    public static void main(String[] args) {

        Child child = new Child();
        child.printMembers(); //deprecated된 메서드 사용
                            //해당 메서드에 커서를 올리면 deprecated 경고를 볼 수 없음.
                            //내가 예상할 수 있는 경고를 억제하고 내가 예상하지 못한 경고를 확인하기 위해 사용 가능


    }
}