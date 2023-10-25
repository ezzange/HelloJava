package method.ex2;

class IvMath{
    long a,b; //iv 인스턴스 변수 (클래스 내에서 사용)

    long add(){ //인스턴스 메서드
        return a + b;
    }
    //메서드 내에서 사용된 지역변수
    static long add(long a, long b){ //static 매소드

        return a + b; //Lv 지역변수 (메서드 내에서 사용)

    }
}