package main.javacode.planning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class planninghome extends JPanel {
    private JPanel currentPanel;
    private JPanel mainPanel; // Reference to the main panel

    public planninghome() {
        setLayout(new BorderLayout());

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        JMenuItem planningAddItem = new JMenuItem("Add Planning");

        planningAddItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Remove current panel and add planning add panel
                switchToPanel(new planningadd(planninghome.this));
            }
        });

        menu.add(planningAddItem);
        menuBar.add(menu);
        add(menuBar, BorderLayout.NORTH);

        // Create main panel
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        JLabel mainLabel = new JLabel("Main Panel");
        mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(mainLabel, BorderLayout.CENTER);

        JButton returnButton = new JButton("Return");
        returnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Return to main panel
                switchToPanel(mainPanel);
            }
        });
        mainPanel.add(returnButton, BorderLayout.SOUTH);

        // Initially, display the main panel
        currentPanel = mainPanel;
        add(currentPanel, BorderLayout.CENTER);
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
                frame.setSize(400, 300);
                frame.add(new planninghome());
                frame.setVisible(true);
            }
        });
    }
}