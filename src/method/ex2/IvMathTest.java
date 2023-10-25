package method.ex2;

class IvMathTest{
    public static void main(String[] args){ //static 메서드
                        //class이름.메서드이름() 로 static 메서드 사용
        System.out.println(IvMath.add(200L, 100L)); //static 메서드는 객체 생성없이 호출 가능
        IvMath ivMath = new IvMath();  // 인스턴스 메서드 사용시 인스턴스 객체 생성
        // iv 참조변수
        ivMath.a = 200L;
        ivMath.b = 100L;
        System.out.println(ivMath.add());// 인스턴스 메서드 호출하여 사용
                          //참조변수.메서드이름()
    }
}