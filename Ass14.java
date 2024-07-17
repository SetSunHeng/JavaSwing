package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ass14 extends JFrame {

    JLabel name = new JLabel("Name");
    JTextField tName = new JTextField(18);
    JButton add = new JButton("ADD");
    public Ass14(){

        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(name);
        add(tName);
        tName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                name.setText(tName.getText());
            }
        });
        add(add);

        pack();
        setLocationRelativeTo(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ass14();
    }
}
