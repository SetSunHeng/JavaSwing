package Interface;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.*;


public class BY_ME extends JFrame implements ActionListener {

    JLabel lab = new JLabel();
    JButton btn = new JButton();
    JCheckBox chb = new JCheckBox();
    JTextField txt = new JTextField();
    public BY_ME(){

        lab.setText("name");
        lab.setBounds(50, 100, 100, 30);
        add(lab);
        txt.setBounds(170, 100, 100, 30);
        setFont(new Font("", Font.BOLD, 24));
        add(txt);
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                lab.setText(txt.getText());
            }
        });
        btn.setText("Add");
        btn.setBounds(300, 200, 100, 50);
        add(btn);
        btn.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Hi ${You are Win!}");
            }
        });

        setLayout(null);
        setBounds(200, 200, 500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BY_ME();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
