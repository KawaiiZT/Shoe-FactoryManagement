package main.javacode.worker;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Worker extends JPanel {
    private JTable tableinfo;
    private JLabel header;
    private JButton bn1;
    private JButton bn2;

    public Worker() {
        String data[][] = {{"101", "Trisit", "Charoenparipat"}};
        String columns[] = {"ID", "FIRSTNAME", "LASTNAME"};
        DefaultTableModel model = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells uneditable
            }
        };

        tableinfo = new JTable(model);
        header = new JLabel("Worker");
        bn1 = new JButton("Add Worker");
        bn2 = new JButton("Edit/Remove Worker");

        setLayout(new BorderLayout());
        add(header, BorderLayout.NORTH);
        add(new JScrollPane(tableinfo), BorderLayout.CENTER); // Adding JScrollPane instead of JTable
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(bn1);
        buttonPanel.add(bn2);
        add(buttonPanel, BorderLayout.SOUTH);

        // Connect to another Page WorkerAdd and WorkerRemove
        bn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open WorkerAdd frame
                WorkerAdd2 workerAddFrame = new WorkerAdd2();
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
    }
}
