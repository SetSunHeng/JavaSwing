package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment_12_01 extends JFrame implements ActionListener {

    JLabel lb = new JLabel("Name");
    JTextField tf = new JTextField(20);
    JButton btn = new JButton("ADD");
    public Assignment_12_01(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        //
        add(lb);add(tf);
        //
        add(btn);
        btn.addActionListener(this);

        pack();
        setLocationRelativeTo(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        new Assignment_12_01();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println(tf.getText());
    }
}
