package interfacee.ex7;

public class InterfaceTest2 {
    public static void main(String[] args) {


        //참조변수 타입과 인스턴스 타입의 일치
        Fighter fighter = new Fighter();
        fighter.move(100, 200);
        fighter.attack(new Fighter());
        //자식타입의 참조변수로 부모타입의 인스턴스에 접근할 수 있다.
        fighter.stop();

        //인터페이스는 인터페이스타입 참조변수로 자신을 구현한 자식클래스를 이용하여 인스턴스를 생성할 수 있다.
        Unit unit=new Fighter();
        unit.move(50,100);
        unit.stop();
        //부모타입으로 자식타입을 참조하는 경우 부모가 선언한 메서드만 사용할 수 있으므로 자식타입의 메서드인 attack()는 사용 불가
//        unit.attack(new Fighter()); ERROR

        Fightable fightable = new Fighter();
        fightable.move(25, 50);
        //마찬가지로 부모타입의 인터페이스 참조변수는 자신이 선언한 메서드만 사용할 수 있다.
//        fightable.stop(); ERROR
        fightable.attack(fighter);

        Fighter fighter2 = new Fighter();
        //메서드를 사용하여 인터페이스 타입으로 인스턴스 생성
        Fightable fightable2 = fighter2.getFightable();



    }
}
