package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class KeyListener extends JFrame implements java.awt.event.KeyListener, ActionListener {

    JLabel lb = new JLabel("Name");
    JTextField tf = new JTextField(20);
    JButton btn = new JButton("OK");
    public KeyListener(){


        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(lb);
        add(tf);
        add(btn);

        tf.addKeyListener(this);
        btn.addActionListener(this);

        setBounds(500, 200, 500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyListener();
    }
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Type");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Released");
        btn.setText(tf.getText());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(tf.getText());
    }
}
