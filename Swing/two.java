import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class two {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Window");
        jf.setSize(600, 400);
        jf.setVisible(true);

        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");

        JLabel label = new JLabel();

        btn1.setSize(100, 30);
        btn2.setSize(100, 30);
        btn3.setSize(100, 30);
        btn4.setSize(100, 30);

        jf.add(btn1);
        jf.add(btn2);
        jf.add(btn3);
        jf.add(btn4);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("btn 1 was pressed");
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("btn 2 was pressed");
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("btn 3 was pressed");
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("btn 4 was pressed");
            }
        });

        jf.add(label);

        jf.setLayout(new FlowLayout());
    }
}