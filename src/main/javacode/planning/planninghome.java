package main.javacode.planning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class planninghome extends JPanel implements ActionListener {
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem planningAddItem;
    private JLabel mainLabel;
    private JButton returnButton;
    private JPanel currentPanel, mainPanel; // Reference to the main panel

    public planninghome() {
        // Create menu bar
        menuBar = new JMenuBar();
        menu = new JMenu("Options");
        planningAddItem = new JMenuItem("Add Planning");
        mainLabel = new JLabel("Main Panel");
        returnButton = new JButton("Return");
        mainPanel = new JPanel();

        // Initially, display the main panel
        currentPanel = mainPanel;

        // เพิ่ม event ปุ่ม
        planningAddItem.addActionListener(this);
        returnButton.addActionListener(this);

        // เพิ่ม แทบ menu
        menu.add(planningAddItem);
        menuBar.add(menu);

        mainPanel.setLayout(new BorderLayout());

        mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(mainLabel, BorderLayout.CENTER);
        mainPanel.add(returnButton, BorderLayout.SOUTH);

        setLayout(new BorderLayout());

        add(menuBar, BorderLayout.NORTH);
        add(currentPanel, BorderLayout.CENTER);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(planningAddItem)) {
            // Remove current panel and add planning add panel
            switchToPanel(new planningadd(planninghome.this));
        }
        else if (ae.getSource().equals(returnButton)) {
            // Return to main panel
            switchToPanel(mainPanel);
        }
    }
    private void switchToPanel(JPanel panel) {
        remove(currentPanel);
        currentPanel = panel;
        add(currentPanel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Planning Home");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1280, 720);
                frame.add(new planninghome());
                frame.setVisible(true);
                // ตั้งตำแหน่งการเปิด GUI เป็นกลางหน้าจอ
                frame.setLocationRelativeTo(null);
            }
        });
    }
}
