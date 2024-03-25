package main.javacode.logging;

import main.javacode.MenuDashboard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class logging_history  {
    private JFrame fr;
    private JTable TableInfo;
    private JLabel lb1;
    private JPanel p1, p2, p3;
    private JButton hasError, hasResponse, forward, backward, refresh, reset;
    private MenuDashboard menu;
    private JScrollPane sp;
    public logging_history(){
        // test data
        String column[] = {"ID", "STATUS", "METHOD", "PATH", "OPERATION", "USER_ID", "SESSION_ID", "IP", "DURATION"};
        String data[][] = {{"1", "200", "GET", "/auth", "Authenticate", "1", "bdODeOkAnS", "::1", "0.6984468"}};

        fr = new JFrame("Logging History");
        TableInfo = new JTable(data, column);
        lb1 = new JLabel("Logging        ");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        sp = new JScrollPane(TableInfo);
        hasError = new JButton("Has Errors");
        hasResponse = new JButton("Has Response");
        ImageIcon iconforward = new ImageIcon("forward.png");
        ImageIcon iconbackward = new ImageIcon("backward.png");
        ImageIcon iconrefresh = new ImageIcon("refresh.png");
        ImageIcon iconreset= new ImageIcon("reset.png");
        forward = new JButton(iconforward);
        backward = new JButton(iconbackward);
        refresh = new JButton(iconrefresh);
        reset = new JButton(iconreset);
        menu = new MenuDashboard();

        p3.add(hasResponse); p3.add(hasError); p3.add(reset); p3.add(backward); p3.add(forward); p3.add(refresh);
        p1.add(menu);
        p2.setLayout(new BorderLayout());
        p2.add(lb1, BorderLayout.NORTH);
        p2.add(sp, BorderLayout.CENTER);
        p2.add(p3, BorderLayout.SOUTH);
        fr.add(p1, BorderLayout.WEST);
        fr.add(p2, BorderLayout.CENTER);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1280, 720);
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new logging_history();
    }
}
