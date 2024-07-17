package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Objects;

public class Ass15 extends JFrame {

    String []current = {"Riel", "Dollars", "Euro", "RMB"};
    JLabel curr = new JLabel("(Rate) $1 =");
    JTextField mon = new JTextField("4100",5);
    JLabel riel = new JLabel("Riel");
    JTextField txt1 = new JTextField(15);
    JTextField txt2 = new JTextField(15);
    JComboBox<String> combo1 = new JComboBox<>(current);
    JComboBox<String> combo2 = new JComboBox<>(current);

    public Ass15(){

        curr.setFont(new Font("Arial", Font.ITALIC,16));
        mon.setFont(new Font("Arial", Font.ITALIC,16));
        riel.setFont(new Font("Arial", Font.ITALIC,16));
        txt1.setFont(new Font("Arial", Font.ITALIC,16));
        txt2.setFont(new Font("Arial", Font.ITALIC,16));
        combo1.setFont(new Font("Arial", Font.ITALIC,16));
        combo2.setFont(new Font("Arial", Font.ITALIC,16));

        JPanel panelCurrent = new JPanel(new FlowLayout());
        panelCurrent.add(curr);
        panelCurrent.add(mon);
        panelCurrent.add(riel);

        JPanel panel = new JPanel(new GridLayout(2,2,5,5));
        panel.add(txt1);panel.add(txt2);
        panel.add(combo1);panel.add(combo2);

        setLayout(new BorderLayout(10,10));
        add(panelCurrent, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        txt1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                convert(txt1, txt2, combo1, combo2);
            }
        });
        txt2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                convert(txt2, txt1, combo2, combo1);
            }
        });
        combo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convert(txt2, txt1, combo2, combo1);
                curr.setText(Objects.requireNonNull(combo1.getSelectedItem()).toString());
                mon.setText("");
            }
        });
        combo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convert(txt1, txt2, combo1, combo2);
                riel.setText(Objects.requireNonNull(combo2.getSelectedItem()).toString());
            }
        });

        pack();
        setLocationRelativeTo(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void convert(JTextField text1, JTextField text2, JComboBox<String> combo1, JComboBox<String> combo2){
        int type1 = combo1.getSelectedIndex();
        int type2 = combo2.getSelectedIndex();

        if (type1 == type2 || text1.getText().isEmpty()) {
            text2.setText(text1.getText());
            return;
        }
        switch(type1){
            case 3:
                if(type2 == 0){     // RMB to Riel

                    String text = text1.getText();
                    float ftext = Float.parseFloat(text);
                    ftext *= 565.29F;

                    text = String.format("%.2f", ftext);
                    text2.setText(text);
                }
                else if(type2 == 1){    // RMB to Dollar

                    String text = text1.getText();
                    float fText = Float.parseFloat(text);
                    fText *= 0.14F;

                    text = String.format("%.2f", fText);
                    text2.setText(text);
                } else if(type2 == 2){    // RMB to Euro

                    String text = text1.getText();
                    float fText = Float.parseFloat(text);
                    fText *= 0.13F;

                    text = String.format("%.2f", fText);
                    text2.setText(text);
                }
                break;
            case 2:
                if(type2 == 0){     // Euro to Dollar

                    String text = text1.getText();
                    float ftext = Float.parseFloat(text);
                    ftext *= 4469.00F;

                    text = String.format("%.2f", ftext);
                    text2.setText(text);
                }
                else if(type2 == 1){    // Euro to Riel

                    String text = text1.getText();
                    float fText = Float.parseFloat(text);
                    fText *= 1.09F;

                    text = String.format("%.2f", fText);
                    text2.setText(text);
                } else if(type2 == 3){    // Euro to RMB

                    String text = text1.getText();
                    float fText = Float.parseFloat(text);
                    fText *= 7.93F;

                    text = String.format("%.2f", fText);
                    text2.setText(text);
                }
                break;
            case 1:
                if(type2 == 0){     // Dollar to Riel

                    String text = text1.getText();
                    float ftext = Float.parseFloat(text);
                    ftext *= 4100.00F;

                    text = String.format("%.2f", ftext);
                    text2.setText(text);
                }
                else if(type2 == 2){    // Dollar to Euro

                    String text = text1.getText();
                    float fText = Float.parseFloat(text);
                    fText *= 0.92F;

                    text = String.format("%.2f", fText);
                    text2.setText(text);
                }
                else if(type2 == 3){    // Dollar to RMB

                    String text = text1.getText();
                    float fText = Float.parseFloat(text);
                    fText *= 7.26F;

                    text = String.format("%.2f", fText);
                    text2.setText(text);
                }
                break;
            case 0:
                if(type2 == 1){     // Riel to Dollar

                    String text = text1.getText();
                    float ftext = Float.parseFloat(text);
                    ftext /= 4100.00F;

                    text = String.format("%.2f", ftext);
                    text2.setText(text);
                }
                else if(type2 == 2){    // Riel to Euro

                    String text = text1.getText();
                    float fText = Float.parseFloat(text);
                    fText /= 4469.00F;

                    text = String.format("%.2f", fText);
                    text2.setText(text);
                }
                else if(type2 == 3){    // Riel to RMB

                    String text = text1.getText();
                    float fText = Float.parseFloat(text);
                    fText *= 0.0018F;

                    text = String.format("%.2f", fText);
                    text2.setText(text);
                }
                break;
        }
    }

    public static void main(String[] args) {
        new Ass15();
    }
}
