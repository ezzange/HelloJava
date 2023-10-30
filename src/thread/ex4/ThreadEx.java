package thread.ex4;

import javax.swing.*;

public class ThreadEx {
    public static void main(String[] args) {
        MultiThread multiThread = new MultiThread();
        multiThread.start();
        System.out.println("isInterrupred() = " + multiThread.isInterrupted()); // 상태 false
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " +input +"입니다." );
        multiThread.interrupt(); // interrupt()는 상태 false -> true 반환
        System.out.println("threadTest isInterrupted() : = " + multiThread.isInterrupted()); // 상태 true
//        System.out.println("thread interrupted() : = " + Thread.interrupted()); // interrupted()는 상태 true -> false로 초기화
    }
}
