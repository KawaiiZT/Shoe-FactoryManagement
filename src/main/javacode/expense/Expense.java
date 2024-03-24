package main.javacode.expense;

// ดึงข้อมูลในไฟล์ menudashboard
import main.javacode.MenuDashboard;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Expense extends JFrame implements ActionListener {
    public JFrame fr;
    public JPanel p1 ,p2, p3;
    public JLabel text;
    public JScrollPane scrollPane;
    public JTable table;
    public JButton bt;
    public Expense() {
        // ชื่อ แอพ
        fr = new JFrame("Shoe-Factory");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        text = new JLabel("INCOME-EXPENSE");
        scrollPane = new JScrollPane();
        table = new JTable();
        MenuDashboard menu = new MenuDashboard();
        bt = new JButton("ADD");
        // เพิ่ม event ปุ่ม
        bt.addActionListener(this);
        // สร้างปุ่มเลื่อนขึ้น-ลง
        scrollPane.setViewportView(table);
        // สร้างตาราง
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.addColumn("DATE"); 
        model.addColumn("ORDER");
        model.addColumn("INCOME"); 
        model.addColumn("EXPENSE");
        model.addColumn("SUMMARY");
        model.addColumn("NOTE");
        // ทดสอบการเพิ่มข้อมูล
        model.addRow(new Object[] {"jk", "ghjghj", "sdfs", "vbn", "ghj"} );

        p1.setPreferredSize(new Dimension(200 ,720));
        p1.add(menu);

        p2.setLayout(new BorderLayout());
        p2.add(text, BorderLayout.NORTH);
        p2.add(scrollPane, BorderLayout.CENTER);
        p2.add(p3, BorderLayout.SOUTH);

        p3.add(bt);

        fr.setLayout(new BorderLayout());
        fr.add(p1, BorderLayout.WEST);
        fr.add(p2);
        fr.setSize(1280, 720);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        // ตั้งตำแหน่งการเปิด GUI เป็นกลางหน้าจอ
        fr.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bt)) {
            ExpenseAdd expenseAdd = new ExpenseAdd();
            expenseAdd.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Expense();
    }
}
