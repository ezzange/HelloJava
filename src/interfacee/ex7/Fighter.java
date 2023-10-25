package interfacee.ex7;

public class Fighter extends Unit implements Fightable{
    //오버라이딩 규칙 : 부모타입보다 접근 제어자가 좁을 수 없다.
    public void move(int x, int y) {
        System.out.println("[ "+x+", "+y+" ]로 이동");
    }

    public void attack(Fightable fightable) {
        System.out.println(fightable+"를 공격합니다.");
    }

    public String toString() {
        return "Fighter";
    }
    // 반환 타입이 인터페이스인 메서드
    public Fightable getFightable(){
        //Fighter을 생성해서 반환
        Fighter fighter = new Fighter();
        return fighter;//반환타입에 맞춰 (Fightable)fighter 인데 생략되어 있다.
     }
}
