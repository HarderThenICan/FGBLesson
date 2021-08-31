package HW8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    public GUI() {
        setTitle("Окно Домашки");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400, 400, 400, 400);

        setVisible(true);

        JPanel panel = new JPanel(new GridLayout(2, 2));
        JButton btn1 = new JButton("Привет");
        JButton btn2 = new JButton("Пока");

        ActionListener actionListener = new Listener();

        btn2.addActionListener(actionListener);
        panel.add(btn1);
        panel.add(btn2);

        add(panel, BorderLayout.CENTER);

    }
}

