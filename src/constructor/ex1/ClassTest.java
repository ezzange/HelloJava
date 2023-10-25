package Constructor.ex1;

public class ClassTest {
    int x;   //iv
    int y = x;   //iv

    void method(){
        int i;      //lv
        //	int j = i;   // ERROR =>lv를 초기화하지 않고 사용
    }
}
