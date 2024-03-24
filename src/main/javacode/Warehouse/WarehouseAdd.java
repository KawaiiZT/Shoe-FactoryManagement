package main.javacode.Warehouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WarehouseAdd extends JFrame implements ActionListener {
    private JPanel panel, input, button;
    private JLabel headline, description, id, name, quantity, status, label1, label2;
    private JTextField idF, nameF, quantityF, statusF, textField1, textField2;
    private JButton addB, cancelB, editB;
    private Font headlineFont, labelFont;
    public WarehouseAdd() {
        setTitle("Warehouse Add");

        panel = new JPanel();
        input = new JPanel();
        button = new JPanel();

        headline = new JLabel("Warehouse Add");
        description = new JLabel("");
        id = new JLabel("ID:");
        name = new JLabel("Name:");
        quantity = new JLabel("Quantity:");
        status = new JLabel("Status:");

        idF = new JTextField(10);
        nameF = new JTextField(10);
        quantityF = new JTextField(10);
        statusF = new JTextField(10);

        addB = new JButton("Add Worker");
        cancelB = new JButton("Cancel/Return");
        editB = new JButton("Edit");

        label1 = new JLabel("Label 1:");
        textField1 = new JTextField(10);
        label2 = new JLabel("Label 2:");
        textField2 = new JTextField(10);

        headlineFont = new Font("Arial", Font.BOLD, 24);

        headline.setFont(headlineFont);
        headline.setHorizontalAlignment(JLabel.CENTER);

        labelFont = new Font("Arial", Font.PLAIN, 16);

        description.setFont(labelFont);
        id.setFont(labelFont);
        name.setFont(labelFont);
        quantity.setFont(labelFont);
        status.setFont(labelFont);
        label1.setFont(labelFont);
        label2.setFont(labelFont);

        idF.setBackground(Color.WHITE);
        nameF.setBackground(Color.WHITE);
        quantityF.setBackground(Color.WHITE);
        statusF.setBackground(Color.WHITE);

        idF.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        nameF.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        quantityF.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        statusF.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        idF.setPreferredSize(new Dimension(150, 30));
        nameF.setPreferredSize(new Dimension(150, 30));
        quantityF.setPreferredSize(new Dimension(150, 30));
        statusF.setPreferredSize(new Dimension(150, 30));

        textField1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        textField2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        textField1.setBackground(Color.WHITE);
        textField2.setBackground(Color.WHITE);
        textField1.setPreferredSize(new Dimension(150, 30));
        textField2.setPreferredSize(new Dimension(150, 30));

        input.setLayout(new GridLayout(0, 1, 5, 5));
        input.add(createLabelFieldPanel(id, idF));
        input.add(createLabelFieldPanel(name, nameF));
        input.add(createLabelFieldPanel(quantity, quantityF));
        input.add(createLabelFieldPanel(status, statusF));
        input.add(createLabelFieldPanel(label1, textField1));
        input.add(createLabelFieldPanel(label2, textField2));

        button.setLayout(new FlowLayout(FlowLayout.CENTER));
        button.add(addB);
        button.add(cancelB);
        button.add(editB);

        // เพิ่ม event ปุ่ม
        addB.addActionListener(this);
        cancelB.addActionListener(this);
        editB.addActionListener(this);

        panel.setLayout(new BorderLayout());
        panel.add(headline, BorderLayout.NORTH);
        panel.add(description, BorderLayout.CENTER);
        panel.add(input, BorderLayout.WEST);
        panel.add(button, BorderLayout.SOUTH);

        getContentPane().add(panel);

        // ตั้งขนาด GUI
        setSize(500, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // ตั้งตำแหน่งการเปิด GUI เป็นกลางหน้าจอ
        setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(addB)) {
            // Add warehouse
        } else if (ae.getSource().equals(cancelB)) {
            // Cancel warehouse
        } else if (ae.getSource().equals(editB)) {
            // Edit warehouse
        }
    }
    private JPanel createLabelFieldPanel(JLabel label, JTextField textField) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.add(label);
        panel.add(textField);
        return panel;
    }
    public static void main(String[] args) {
        new WarehouseAdd();
    }
}
