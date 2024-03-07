package main.javacode.Warehouse;

import main.javacode.MenuDashboard;
import main.javacode.SidebarMenu;
import main.javacode.worker.WorkerAdd2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Warehouse extends JFrame {
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
    public Warehouse() {
        String column[] = {"ID", "NAME", "QUANTITY", "STATUS"};
        String data[][] = {{"001", "SHOE", "999", "READY TO BE SOLD"}};

        fr = new JFrame("ShoeFactoryManagement");
        tableinfo = new JTable(data, column);
        header = new JLabel("Warehouse");
        MenuDashboard menu = new MenuDashboard();
        p1 = new JPanel();
        p2 = new JPanel(new BorderLayout());
        fr.setLayout(new BorderLayout());
        sp = new JScrollPane(tableinfo);
        l1 = new JLabel("Warehouse");
        p3 = new JPanel();
        bn1 = new JButton("Add Item");
        bn2 = new JButton("Edit/Remove Item");

        p1.add(menu);
        fr.add(p1, BorderLayout.WEST);
        fr.add(p2);
        p2.add(header, BorderLayout.NORTH);
        p2.add(sp, BorderLayout.CENTER); // Adding JScrollPane instead of JTable
        p2.add(p3, BorderLayout.SOUTH);
        p3.add(bn1);
        p3.add(bn2);

        bn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open WorkerAdd frame
                WarehouseAdd warehouseAdd = new WarehouseAdd();
                warehouseAdd.setVisible(true);
            }
        });
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1280, 720);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new Warehouse();
    }
}
