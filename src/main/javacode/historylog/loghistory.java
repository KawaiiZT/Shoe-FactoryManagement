package main.javacode.historylog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

public class loghistory extends JPanel {
    private JPanel currentPanel;
    private JTable logtable;
    private JLabel header;
    private JScrollPane sp;

    public loghistory(){
        String data[][] = {{"15-03-2024", "add new Staff", "15-03-2024 13:56"},{"16-03-2024", "add new planning", "16-03-2024 14:00"}};
        String columns[] = {"Date", "Action", "Date & Time"};
        DefaultTableModel model = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells uneditable
            }
        };

        setLayout(new FlowLayout());
        currentPanel = new JPanel(new BorderLayout());
        add(currentPanel);
        logtable = new JTable(model);
        header = new JLabel("log history");
        currentPanel.add(header, BorderLayout.NORTH);
        sp = new JScrollPane(logtable);
        currentPanel.add(sp, BorderLayout.CENTER);
    }
}
