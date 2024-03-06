/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.javacode.expense;


import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class Expense {
    public JFrame fr;
    public JPanel p1 ,p2, p3;
    public JLabel text;
    public JScrollPane scrollPane;
    public JTable table;
    public JButton b;
    public Expense() {
        fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        text = new JLabel("INCOME-EXPENSE");
        scrollPane = new JScrollPane();
        table = new JTable();
        scrollPane.setViewportView(table);
        b = new JButton("ADD");
        p2.setLayout(new BorderLayout());
        fr.setLayout(new BorderLayout());
        fr.setSize(1280, 720);
        p1.setPreferredSize(new Dimension(200 ,720));
        
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.addColumn("DATE"); 
        model.addColumn("ORDER");
        model.addColumn("INCOME"); 
        model.addColumn("EXPENSE");
        model.addColumn("NOTE");
        model.addRow(new Object[]
        {"jk", "ghjghj", "sdfs", "vbn", "ghj"});
        
        
        fr.add(p1, BorderLayout.WEST);
        fr.add(p2);
        p2.add(text, BorderLayout.NORTH);
        p2.add(scrollPane, BorderLayout.CENTER);
        p2.add(p3, BorderLayout.SOUTH);
        p3.add(b);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public static void main(String[] args) { new Expense(); }
}

