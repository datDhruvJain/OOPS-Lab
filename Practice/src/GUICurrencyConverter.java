import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICurrencyConverter {
    public GUICurrencyConverter() {


    JFrame jf = new JFrame();
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel l = new JLabel("Currency converter");
    l.setHorizontalAlignment(JLabel.CENTER);
    //l.setBounds(10,10,100,100);
    jf.add(l);


    JLabel jcbl1 = new JLabel("Enter Input Currency");
    String[] currencyFrom = {"USD", "GBP"};
    JComboBox jc1 = new JComboBox(currencyFrom);
    //jcbl1.setBounds(40,40,100,100);
    //jc1.setBounds(150,40,100,100);
    jf.add(jcbl1);
    jf.add(jc1);


    JLabel jtfl = new JLabel("Enter amount");
    JTextField jf1 = new JTextField();
    //jtfl.setBounds(150,40, 100,100);
    //jf1.setBounds(150,150,100,100);
    jf.add(jf1);
    jf.add(jtfl);

    JLabel jcbl2 = new JLabel("Enter Output Currency");
    String[] currencyTo = {"INR", "AED"};
    JComboBox jc2 = new JComboBox(currencyTo);
    //jcbl2.setBounds(250,150,100,100);
    //jc2.setBounds(250,40,100,100);
    jf.add(jc2);


    JLabel finalAmount = new JLabel();
   //finalAmount.setBounds(300,40,100,100);
    jf.add(finalAmount);

    JButton jbutton = new JButton("Convert");
    //jbutton.setBounds(300,300,30,30);
    jbutton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            float amt;
            String jc1Text = (String) jc1.getItemAt(jc1.getSelectedIndex());
            String jc2Text = (String) jc2.getItemAt(jc2.getSelectedIndex());
            if(jc1Text.equalsIgnoreCase("USD")){
                if(jc2Text.equalsIgnoreCase("INR")){
                    amt = Float.parseFloat(jf1.getText());
                    amt = amt*72;
                    finalAmount.setText("Final amount = " + amt);
                }
                if(jc2Text.equalsIgnoreCase("AED")){
                    amt = Float.parseFloat(jf1.getText());
                    amt = amt * (float)3.65;
                    finalAmount.setText("Final amount = " + amt);
                }
            }
            if(jc1Text.equalsIgnoreCase("GBP")) {
                if (jc2Text.equalsIgnoreCase("INR")) {
                    amt = Float.parseFloat(jf1.getText());
                    amt = amt * 92;
                    finalAmount.setText("Final amount = " + amt);
                }
                if (jc2Text.equalsIgnoreCase("AED")) {
                    amt = Float.parseFloat(jf1.getText());
                    amt = amt * (float) 4.63;
                    finalAmount.setText("Final amount = " + amt);
                }
            }
        }
    });
    jf.add(jbutton);
    jf.setLayout(new BoxLayout(jf.getContentPane(),1));
    jf.setSize(400,400);
    jf.setVisible(true);
    }


    public static void main(String[] args) {
        GUICurrencyConverter lol = new GUICurrencyConverter();
    }

}
