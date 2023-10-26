package classss.ex7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {
    public static void main(String[] args) {
        Button button = new Button("start");
                                //클래스의 객체생성과 정의를 동시에
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("ActionEvent");
            }
        });
    }
}


