package main.javacode.worker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

public class Worker extends JPanel implements ActionListener {
    private JPanel buttonPanel;
    private JTable tableinfo;
    private JLabel header;
    private JButton bt1, bt2;
    private DefaultTableModel model;
    public Worker() {
        String data[][] = {{"101", "Trisit", "Charoenparipat"}};
        String columns[] = {"ID", "FIRSTNAME", "LASTNAME"};

        buttonPanel = new JPanel();
        model = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells uneditable
            }
        };
        tableinfo = new JTable(model);

        header = new JLabel("Worker");
        bt1 = new JButton("Add Worker");
        bt2 = new JButton("Edit/Remove Worker");

        buttonPanel.add(bt1);
        buttonPanel.add(bt2);

        // Connect to another Page WorkerAdd and WorkerRemove
        bt1.addActionListener(this);
        bt2.addActionListener(this);

        setLayout(new BorderLayout());
        add(header, BorderLayout.NORTH);
        add(new JScrollPane(tableinfo), BorderLayout.CENTER); // Adding JScrollPane instead of JTable
        add(buttonPanel, BorderLayout.SOUTH);

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
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println(e);
        }
        new Worker();
    }
}
