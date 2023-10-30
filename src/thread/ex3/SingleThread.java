package thread.ex3;

import javax.swing.*;

public class SingleThread { // 싱글쓰레드의 경우
    public static void main(String[] args) throws Exception{
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " +input +"입니다." );

        for (int i = 5; i > 0; i--) {
            System.out.println("i = " + i);
            try {
                Thread.sleep(1000); //쓰레드의 작업을 1초씩 지연한다.
            } catch (Exception e) {

            }
        }
    }


}
