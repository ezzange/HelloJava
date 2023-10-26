package exceptionn.ex2;

public class ExceptionTest2 {
    public static void main(String[] args) {
        try{
            System.out.println(0/0); // ArithemticException 예외발생!!
        } catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();
            System.out.println(arithmeticException.getMessage());
        } catch (Exception e) {
        }
//        1. System.out.println(0/0);문장 실행시 예외발생
//        2. 예외 객체 생성(객체안에 예외정보와 메서드 포함된 객체)
//        3. 예외발생 이후 문장들은 실행되지 않고 예외 처리를 위해 캐치 블럭으로 내려옴
//        4. 발생된 예외처리와 캐치블럭이 일치하면 참조변수 ae는 예외객채의 주소를 가르킴
//                (참조변수 ae의 유효범위 : 해당 캐치블럭 내)
//        5.참조변수 ae와 객체안에 있던 메서드를 이용하여 예외객체의 예외 정보를 가져온다.
//        (ArithmeticException.printSrackTrace();, System.out.println(as.getMessage());)
    }
}
