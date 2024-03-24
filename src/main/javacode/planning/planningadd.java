package main.javacode.planning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class planningadd extends JPanel implements ActionListener {
    private JLabel titleLabel;
    private JTextArea planningTextArea;
    private JScrollPane scrollPane;
    private JButton addButton;
    private JButton returnButton;
    private planninghome previousPanel;

    public planningadd(planninghome previousPanel) {
        this.previousPanel = previousPanel;

        titleLabel = new JLabel("Planning Add Panel");
        planningTextArea = new JTextArea();
        scrollPane = new JScrollPane(planningTextArea);
        addButton = new JButton("Add Planning");
        returnButton = new JButton("Return");

        // เพิ่ม event ปุ่ม
        addButton.addActionListener(this);
        returnButton.addActionListener(this);

        planningTextArea.setEditable(false);

        setLayout(new BorderLayout());

        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(titleLabel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(returnButton, BorderLayout.EAST);
        add(addButton, BorderLayout.SOUTH);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(addButton)) {
            // Add planning functionality here
            // For example, you could open a dialog to add new planning details
            JOptionPane.showMessageDialog(null, "Add Planning functionality goes here");
        }
        else if (ae.getSource().equals(returnButton)) {
            // Return to planninghome panel
            switchToPanel(previousPanel);
        }
    }
    private void switchToPanel(JPanel panel) {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(this);
        frame.getContentPane().add(panel);
        frame.getContentPane().revalidate();
        frame.getContentPane().repaint();
    }
}
