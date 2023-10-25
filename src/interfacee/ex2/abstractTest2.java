package interfacee.ex2;

public class abstractTest2 {
    public static void main(String[] args) {
        Unit[] group = new Unit[3];
        group[0] = new FireMinion();
        group[1] = new WaterMinion();
        group[2] = new WindMinion();

        for(int i=0; i<group.length; i++){ //ERROR
        group[i].move(30,60);
        }
        //모든 클래스의 부모클래스인 Object클래스로 선언할 경우 다형성이 성립되어 객체를 생성할 수는 있지만.
        // Object클래스에는 move메서드가 없기 때문에 move메서드를 호출 할 수 없다.
//    Object[] group = new Object[3];
//    group[0] = new FireMinion();
//    group[1] = new WaterMinion();
//    group[2] = new WindMinion();
//
//    for(int i=0; i<group.length; i++){ //ERROR
//        group[i].move(30,60);
//    }
    }
}
