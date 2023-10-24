package classss;

public class DisplayArr {
//    Display displayArr = new Display()[3];
//    displayArr[0] = new Display();
//    displayArr[1] = new Display();
//    displayArr[2] = new Display();

//길이가 3인 Display 타입의 참조 변수 배열을 선언 하고 선언 및 초기화 (참조 변수는 자동으로 초기화 -> null )
//참조변수는 객체주소 값을 저장하는 변수이기 때문에 선언 후 반드시 객체를 생성하여 각 요소에 (기본 값 null이 아닌 메모리 주소값을)저장 해야 한다.

    Display[] displayArr = {
            new Display(),
            new Display(),
            new Display()
    };
}
