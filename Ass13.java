package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ass13 extends JFrame implements KeyListener {

    JLabel name = new JLabel("Name");
    JTextField txtName = new JTextField(15);
    JButton btnAdd = new JButton("Add");
    public Ass13(){

        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(name);add(txtName);add(btnAdd);
        txtName.addKeyListener(this);

        pack();
        setLocationRelativeTo(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ass13();
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        name.setText(txtName.getText());
    }
}
