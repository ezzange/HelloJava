package exceptionn.ex4;


import java.io.File;

public class ExceptionEx {
    public static void main(String[] args) {

        try {
            File file = createFile(args[0]);
            System.out.println("파일 생성중...");
        } catch (Exception e) {
            System.out.println("다시 입력하세요.");
        }
    }

    static File createFile(String fileName) throws Exception{
        if( fileName==null || fileName.equals(""))
            throw new Exception("파일 이름이 유효하지 않습니다.");
        //파일이름이 공백과 널이 아닐 경우 파일타입의 인스턴스를 생성하고 해당 객체의참조를 반환한다.
        File file = new File(fileName);
        file.createNewFile();
        return file;
    }
}
//      1. 메인 메서드 실행 createFile() 호출
//      2. createFile() 실행 createFile() 호출
//      3. createFile() 실행 중 예외 발생 메인메서드로 예외 전달
//      4. 메인 메서드에서 예외 처리
//      5. 프로그램 정상 종료


