package main.javacode.home;
import main.javacode.MenuDashboard;
import main.javacode.worker.Worker;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
public class home {
    private JFrame fr;
    private JPanel pn1;
    private JLabel item;
    private JLabel numofItem;
    private JLabel worker;
    private JLabel numofworker;
    private JTable itemdetail;
    private JTable Workerdetail;
    public home(){
        fr = new JFrame("ShoeFactoryManagement");
        pn1 = new JPanel();
        fr.setLayout(new BorderLayout());
        MenuDashboard menu = new MenuDashboard();


        pn1.add(menu);
        fr.add(pn1, BorderLayout.WEST);


        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1280, 720);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new home();
    }
}
