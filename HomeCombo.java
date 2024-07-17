package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class HomeCombo extends JFrame {

    JTextField txtLength = new JTextField(20);
    String []item = {"Riel", "Dollar", "Euro", "Pound"};
    JComboBox<String> combo = new JComboBox<>(item);
    public HomeCombo(){
        setLayout(new FlowLayout(FlowLayout.LEADING));
        add(txtLength);
        add(combo);

        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Print Text in Console

                System.out.print(combo.getSelectedItem() + ",  Index : ");
                System.out.println(combo.getSelectedIndex());

                // បោះ Text from ComboBox to TextField

                txtLength.setText(Objects.requireNonNull(combo.getSelectedItem()).toString());
            }
        });

        pack();
        setLocationRelativeTo(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HomeCombo();
    }
}
