package inheritance.ex6;

class Point3D3 extends Point3 {
    int z;
    Point3D3(int x, int y, int z) {
        super(x,y); //부모클래스의 생성자를 호출하여 부모클래스 멤버 x,y 초기화
        this.z = z; //자신의 멤버를 초기침
    }
}

