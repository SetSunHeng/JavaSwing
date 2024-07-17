package Interface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class T1 extends JFrame implements ActionListener {
    JLabel lb = new JLabel("Name");
    JButton btn = new JButton("ADD");
    JTextField tf = new JTextField();
    public T1(){
        lb.setBounds(50, 50, 80, 30);
        add(lb);

        tf.setBounds(150, 50, 200, 30);
        add(tf);

        btn.setBounds(100, 200, 200,50);
        add(btn);
        btn.addActionListener(this);

        setLayout(null);
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new T1();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println(tf.getText());

    }
}
