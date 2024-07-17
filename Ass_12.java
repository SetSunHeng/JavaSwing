package Interface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ass_12 extends JFrame implements ActionListener {

    public Ass_12(){
        JToolBar tb = new JToolBar("Menu");
        JMenuBar mb = new JMenuBar();

        mb.setBounds(25, 10, 435, 40);
        tb.setBounds(30, 15, 30, 30);
        mb.add(tb);
        add(mb);


        setLayout(null);
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ass_12();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
