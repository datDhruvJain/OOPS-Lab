import javax.swing.*;
import java.awt.*;

public class JPanelExample {
    JPanelExample(){
        JFrame frame = new JFrame("Panel Example");
        JPanel panel = new JPanel();

        panel.setBounds(100,100,200,200);
        panel.setBackground(Color.darkGray);

        JButton btn1 = new JButton();
        btn1.setText("Button 1");
        btn1.setBackground(Color.cyan);
        panel.add(btn1);

        JButton btn2 = new JButton();
        btn2.setText("Button 2");
        btn2.setBackground(Color.GREEN);
        panel.add(btn2);

        frame.add(panel);
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JPanelExample();
    }
}
