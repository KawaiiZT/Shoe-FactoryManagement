package main.javacode.planning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class planningadd extends JPanel{
    private planninghome previousPanel;

    public planningadd(planninghome previousPanel) {
        this.previousPanel = previousPanel;

        setLayout(new BorderLayout());
        JLabel titleLabel = new JLabel("Planning Add Panel");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel, BorderLayout.NORTH);

        JTextArea planningTextArea = new JTextArea();
        planningTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(planningTextArea);
        add(scrollPane, BorderLayout.CENTER);

        JButton addButton = new JButton("Add Planning");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add planning functionality here
                // For example, you could open a dialog to add new planning details
                JOptionPane.showMessageDialog(null, "Add Planning functionality goes here");
            }
        });
        add(addButton, BorderLayout.SOUTH);

        // Create Return button
        JButton returnButton = new JButton("Return");
        returnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Return to planninghome panel
                switchToPanel(previousPanel);
            }
        });
        add(returnButton, BorderLayout.EAST);
    }

    private void switchToPanel(JPanel panel) {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(this);
        frame.getContentPane().add(panel);
        frame.getContentPane().revalidate();
        frame.getContentPane().repaint();
    }
}