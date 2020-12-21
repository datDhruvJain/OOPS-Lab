import javax.swing.*;
import java.awt.*;
public class EventHandlingUsingInstance {
    JFrame jf;
    EventHandlingUsingInstance(){
        jf = new JFrame("My Window");
        JButton jb = new JButton("Say Hello");

        jf.add(jb);
        jf.setLayout(new FlowLayout());

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setSize(400,400);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        EventHandlingUsingInstance ev = new EventHandlingUsingInstance();
    }
}
