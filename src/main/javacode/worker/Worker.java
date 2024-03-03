package main.javacode.worker;

import main.javacode.SidebarMenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Worker extends JFrame{
    private JFrame fr;
    private JTable tableinfo;
    private JScrollPane sp;
    private JLabel header;
    private JPanel p1;
    private JPanel p2;
    private JLabel l1;
    private JButton bn1;
    private JPanel p3;
    private JButton bn2;
    public Worker() {
        String data[][] = {{"101", "Trisit", "Charoenparipat"}};
        String column[] = {"ID", "FIRSTNAME", "LASTNAME"};

        fr = new JFrame("ShoeFactoryManagement");
        tableinfo = new JTable(data, column);
        header = new JLabel("Worker");
        SidebarMenu sidebarMenu = new SidebarMenu();
        p1 = new JPanel();
        p2 = new JPanel(new BorderLayout());
        fr.setLayout(new BorderLayout());
        sp = new JScrollPane(tableinfo);
        l1 = new JLabel("Worker");
        p3 = new JPanel();
        bn1 = new JButton("Add Worker");
        bn2 = new JButton("Edit/Remove Worker");

        p1.add(sidebarMenu);
        fr.add(p1, BorderLayout.WEST);
        fr.add(p2);
        p2.add(l1, BorderLayout.NORTH);
        p2.add(sp, BorderLayout.CENTER); // Adding JScrollPane instead of JTable
        p2.add(p3, BorderLayout.SOUTH);
        p3.add(bn1);
        p3.add(bn2);
        //Connect to another Page WorkerAdd and WorkerRemove
        bn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open WorkerAdd frame
                WorkerAdd workerAddFrame = new WorkerAdd();
                workerAddFrame.setVisible(true);
            }
        });
        bn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WorkerRemove workerRemoveFrame = new WorkerRemove();
                workerRemoveFrame.setVisible(true);
            }
        });

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1280, 720);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new Worker();
    }
}