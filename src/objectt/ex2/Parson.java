package objectt.ex2;

public class Parson {
    int id;
    //인스턴스의 주소값이 아닌 멤버 변수 id의 값을 비교하기 위해 Object클래스의 equals()을 오버라이딩
    public boolean equals(Object object) {
        //부모클래스타입에서 자식클래스타입으로 형변환을 하기전에는 instanceof로 확인해야 한다.
        if (object instanceof Parson)
            return id == ((Parson)object).id; //형변환으로 인해 같은 타입의 변수로 비교할 수 있게 된다.
        else //같은 타입이 아니라면 비교 하지 않음.
            return false;

        // 같은 의미의 조건문
//        if (!(object instanceof EqualsTest2))
//            return false;
//        return id == ((EqualsTest2)object).id;
    }
    Parson(int id){
        this.id = id;
    }
}

