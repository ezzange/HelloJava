package Lambda.ex1;
@FunctionalInterface//함수형 인터페이스가 맞는지 체크해주는 애너테이션
public interface LambdaInterfaceEx {
    int max(int a, int b);
}
// 함수형 인터페이스타입의 참조변수로 해당 메서드를 아래와 같이 이용할 수 있다.
//int value = f.max(3,5);
