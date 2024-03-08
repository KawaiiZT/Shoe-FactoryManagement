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
    private JPanel pn2;
    private JPanel pn3;
    private JButton itembutton;
    private JLabel headline;
    private JLabel item;
    private JLabel numofItem;
    private JLabel worker;
    private JLabel numofworker;
    private JTable itemdetail;
    private JTable Workerdetail;
    public home(){
        fr = new JFrame("ShoeFactoryManagement");
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        headline = new JLabel("Dashboard");
        itembutton = new JButton();
        item = new JLabel("Item in Stock");
        fr.setLayout(new BorderLayout());
        MenuDashboard menu = new MenuDashboard();


        pn1.add(menu);
        fr.add(pn1, BorderLayout.WEST);
        fr.add(pn2, BorderLayout.CENTER);
        pn2.setLayout(new GridLayout(10,0));
        pn2.add(headline);
        pn2.add(pn3);
        pn3.setLayout(new GridLayout(1,3,0,20));
        pn3.add(itembutton);
        itembutton.setLayout(new GridLayout(4,0));
        itembutton.add(item);
        itembutton.setBackground(Color.black);



        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1280, 720);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new home();
    }
}
