package main.javacode.worker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

public class Worker extends JPanel implements ActionListener {
    private JFrame fr;
    private JPanel buttonPanel;
    private JTable tableinfo;
    private JLabel header;
    private JButton bt1, bt2;
    private DefaultTableModel model;
    public Worker() {
        String data[][] = {{"101", "Trisit", "Charoenparipat"}};
        String columns[] = {"ID", "FIRSTNAME", "LASTNAME"};

        fr = new JFrame();
        buttonPanel = new JPanel();
        tableinfo = new JTable(model);
        header = new JLabel("Worker");
        bt1 = new JButton("Add Worker");
        bt2 = new JButton("Edit/Remove Worker");
        model = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells uneditable
            }
        };

        buttonPanel.add(bt1);
        buttonPanel.add(bt2);

        // Connect to another Page WorkerAdd and WorkerRemove
        bt1.addActionListener(this);
        bt2.addActionListener(this);

        fr.setLayout(new BorderLayout());
        fr.add(header, BorderLayout.NORTH);
        fr.add(new JScrollPane(tableinfo), BorderLayout.CENTER); // Adding JScrollPane instead of JTable
        fr.add(buttonPanel, BorderLayout.SOUTH);

        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ตั้งตำแหน่งการเปิด GUI เป็นกลางหน้าจอ
        fr.setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bt1)) {
            // Open WorkerAdd frame
            WorkerAdd workerAddFrame = new WorkerAdd();
            workerAddFrame.setVisible(true);
        } else if (ae.getSource().equals(bt2)) {
            // Open WorkerRemove frame
            WorkerRemove workerRemoveFrame = new WorkerRemove();
            workerRemoveFrame.setVisible(true);
        }
    }
    public static void main(String[] args) {
        Worker w = new Worker();
    }
}
