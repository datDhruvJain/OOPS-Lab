import javax.swing.*;
import java.awt.*;
public class EventHandlingUsingExtend extends JFrame{
    public EventHandlingUsingExtend(){
        setTitle("Using extend now");
        JLabel lb = new JLabel("label 1");
        add(lb);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        EventHandlingUsingExtend el = new EventHandlingUsingExtend();
    }
}
