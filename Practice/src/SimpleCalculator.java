import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame{
    public SimpleCalculator() {
        setTitle("Simple Calculator App");

        JTextField firstNumber = new JTextField();
        firstNumber.setBounds(100,10,100,40);
        add(firstNumber);

        JTextField secondNumber = new JTextField();
        secondNumber.setBounds(100,50,100,40);
        add(secondNumber);

        JLabel ans = new JLabel();
        ans.setBounds(100,100, 200, 40);
        add(ans);
        ans.setText("Calculator V1");

        JButton addition = new JButton("+");
        addition.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ans.setText("Sum = " + Integer.toString(Integer.parseInt(firstNumber.getText()) + Integer.parseInt(secondNumber.getText())));
            }
        });
        addition.setBounds(50,150, 50, 50 );
        add(addition);

        JButton substraction = new JButton("-");
        substraction.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ans.setText("Diff = " + Integer.toString(Integer.parseInt(firstNumber.getText()) - Integer.parseInt(secondNumber.getText())));
            }
        });
        substraction.setBounds(100,150, 50, 50 );
        add(substraction);

        JButton multiplication = new JButton("x");
        multiplication.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ans.setText("product = " + Float.toString(Float.parseFloat(firstNumber.getText()) * Float.parseFloat(secondNumber.getText())));
            }
        });
        multiplication.setBounds(150,150, 50, 50 );
        add(multiplication);

        JButton division = new JButton("/");
        division.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ans.setText("quotient = " + Float.toString(Float.parseFloat(firstNumber.getText()) / Float.parseFloat(secondNumber.getText())));
            }
        });
        division.setBounds(200,150, 50, 50 );
        add(division);



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new FlowLayout());
        setLayout(null);
        setSize(300,500);
        setVisible(true);

    }

    public static void main(String[] args) {
        SimpleCalculator lol = new SimpleCalculator();
    }
}
