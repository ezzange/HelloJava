package classss.ex7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass2 {
    public static void main(String[] args) {
        Button button = new Button("start");
        button.addActionListener(new EventHandler2());
    }
}
class EventHandler2 implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("ActionEvent");
    }
}