package main.javacode.Warehouse;

import main.javacode.MenuDashboard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Warehouse extends JFrame implements ActionListener {
    private JFrame fr;
    private JTable tableinfo;
    private JScrollPane sp;
    private JLabel header, l1;
    private MenuDashboard menu;
    private JPanel p1, p2, p3;
    private JButton bt1, bt2;

    public Warehouse() {
        // test data
        String column[] = {"ID", "NAME", "QUANTITY", "STATUS"};
        String data[][] = {{"001", "SHOE", "999", "READY TO BE SOLD"}};

        fr = new JFrame("ShoeFactoryManagement");
        tableinfo = new JTable(data, column);
        sp = new JScrollPane(tableinfo);
        header = new JLabel("Warehouse");
        l1 = new JLabel("Warehouse");
        menu = new MenuDashboard();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        bt1 = new JButton("Add Item");
        bt2 = new JButton("Edit/Remove Item");

        // เพิ่ม event ปุ่ม
        bt1.addActionListener(this);
        bt2.addActionListener(this);

        p1.add(menu);

        p2.setLayout(new BorderLayout());
        p2.add(header, BorderLayout.NORTH);
        p2.add(sp, BorderLayout.CENTER); // Adding JScrollPane instead of JTable
        p2.add(p3, BorderLayout.SOUTH);

        p3.add(bt1);
        p3.add(bt2);

        fr.setLayout(new BorderLayout());
        fr.add(p1, BorderLayout.WEST);
        fr.add(p2);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1280, 720);
        fr.setVisible(true);
        // ตั้งตำแหน่งการเปิด GUI เป็นกลางหน้าจอ
        fr.setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bt1)) {
            // Open WorkerAdd frame
            WarehouseAdd warehouseAdd = new WarehouseAdd();
            warehouseAdd.setVisible(true);
        } else if (ae.getSource().equals(bt2)) {
            // Open Edit/Remove frame
        }
    }
    public static void main(String[] args) {
        new Warehouse();
    }
}
