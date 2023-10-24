package modifider;

public final class FinalTest { //부모클래스가 될 수 없는 클래스
    final int MAX_SIZE = 10; //값을 변경할 수 없는 멤버변수(상수)

    final void getMaxSize(){ //오버라이딩할 수 없는 메서드
        final int LV = MAX_SIZE; //값을 변경할 수 없는 지역변수(상수)

    }
}
