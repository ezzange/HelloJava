package exceptionn.ex7;

import com.sun.jdi.VMOutOfMemoryException;

public class ExceptionTest7 {
    public static void main(String[] args) {
        System.out.println("메인 메서드");
        try {
            System.out.println("메인 메서드가 install() 호출");
            install();
        }catch (InstallException e){
            System.out.println("InstallException 예외 발생 당시의 호출스택 정보와 예외 메시지를 화면에 출력");
            e.printStackTrace();
        }catch (Exception e) {
            System.out.println("Exception 예외 발생 당시의 호출스택 정보와 예외 메시지를 화면에 출력");
            e.printStackTrace();
        }
    }

    private static void install() throws InstallException{
        try {
            System.out.println("install()가 startInstall() 호출");
            startInstall();
            System.out.println("install()가 copyFiles() 호출");
            copyFiles();

        } catch (SpaceException se) {
            InstallException ie = new InstallException("설치 중 예외 발생");
            ie.initCause(se); // ininCaise() : 지정한 예외를 원인 예외로 등록
            // SpaceException가 발생되면 InstallException 가 발생하도록 지정
            throw ie;
            //발생된 예외를 InstallException로 전달.
        } catch (MemoryException me) {
            InstallException ie = new InstallException("설치 중 예외 발생");
            ie.initCause(me); //
            throw ie;
        } finally {
            deleteTepFiles();
        }
    }
    private static void startInstall() throws SpaceException, MemoryException{
        System.out.println("startInstall()");

        if (!enoughSpace()) {
            System.out.println("원인 예외 : SpaceException");
            throw new SpaceException("설치 공간이 부족합니다.");
        }
        if (!enoughMemory()) {
            System.out.println("원인 예외 : MemoryException");
            throw new MemoryException("메모리 공간이 부족합니다.");
            //만약 checked 예외를 unchecked 예외로 바꾸고 싶으면 RuntimeException로 감싸주면 된다.
            //throw new RuntimeException(new MemoryException("메모리 공간이 부족합니다."));

        }
    }

    private static boolean enoughSpace() {
        System.out.println("enoughSpace()");
        System.out.println("설치 여유 공간 확인중...");
        return false;
    }
    private static boolean enoughMemory() {
        System.out.println("enoughMemory()");
        System.out.println("메모리 여유 공간 확인중...");
        return false;
    }

    private static void copyFiles() {
        System.out.println("copyFiles()");
        System.out.println("파일 복사 중...");
    }
    private static void deleteTepFiles() {
        System.out.println("deleteTepFiles()");
        System.out.println("파일 삭제 중...");
    }
}
