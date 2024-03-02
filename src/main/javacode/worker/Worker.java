package main.javacode.worker;

import main.javacode.SidebarMenu;

import javax.swing.*;
import java.awt.*;

public class Worker extends JFrame{
    private JFrame fr;
    private JTable tableinfo;
    private JScrollPane sp;
    private JLabel header;
    private JPanel p1;
    private JPanel p2;

    public Worker() {
        String data[][] = {{"101", "Trisit", "Charoenparipat"}};
        String column[] = {"ID", "FIRSTNAME", "LASTNAME"};

        fr = new JFrame("ShoeFactoryManagement");
        tableinfo = new JTable(data, column);
        header = new JLabel("Worker");
        SidebarMenu sidebarMenu = new SidebarMenu();
        p1 = new JPanel();
        p1.add(sidebarMenu);
        p2 = new JPanel(new BorderLayout(2,0));
        fr.setLayout(new BorderLayout(0,2));
        fr.add(p1, BorderLayout.WEST);
        fr.add(p2);
        p2.add(header);
        sp = new JScrollPane(tableinfo);
        p2.add(sp); // Adding JScrollPane instead of JTable
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1280, 720);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new Worker();
    }
}