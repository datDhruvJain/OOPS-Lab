import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class JButtonExample {
    static int count = 1;
    static String name = "";
    static void getStringHelper(){
        switch (count){
            case 1: name = "";break;
            case 2: name += "D";break;
            case 3: name += "H";break;
            case 4: name += "R";break;
            case 5: name += "U";break;
            case 6: name += "V";break;
            case 7: name = ""; count = 1; break;
            default: name = "";break;
        }
    }
    static String getString(){
        getStringHelper();
        count++;
        return name;
    }
    public static void main(String[] args) {


        JFrame jf = new JFrame("JButton Example");

        Label tf = new Label();
        //final TextArea tf = new TextArea();
        tf.setBounds(150,50,200,100);

        JButton jb = new JButton("click me");
        jb.setBounds(150,150,200,100);

        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //final int temp = getCount();
                tf.setText(getString());
            }
        });

        jf.add(tf);
        jf.add(jb);
        jf.setSize(500,300);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

