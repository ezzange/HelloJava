package overriding.ex1;

class Child extends Parent {
    int bbb;
    // 부모의 callValue 메서드를 오버라이딩
    String returnValue() {
        return "aaa : " + aaa + ", bbb : " + bbb;
    }
}
