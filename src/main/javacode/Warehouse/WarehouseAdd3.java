package main.javacode.Warehouse;

import javax.swing.*;
import java.awt.*;

public class WarehouseAdd3 extends JFrame {
    private JPanel Panel;
    private JPanel input;
    private JPanel button;

    private JLabel headline;
    private JLabel description;
    private JLabel id;
    private JLabel name;
    private JLabel quantity;
    private JLabel status;

    private JTextField idF;
    private JTextField nameF;
    private JTextField quantityF;
    private JTextField statusF;

    private JButton addB;
    private JButton cancelB;
    private JButton editB;

    public WarehouseAdd3() {
        setTitle("Warehouse Add");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel = new JPanel(new BorderLayout());
        input = new JPanel(new GridLayout(0, 1, 5, 5));
        button = new JPanel(new FlowLayout(FlowLayout.CENTER));

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

        Font headlineFont = new Font("Arial", Font.BOLD, 24);
        headline.setFont(headlineFont);
        headline.setHorizontalAlignment(JLabel.CENTER);

        Font labelFont = new Font("Arial", Font.PLAIN, 16);
        description.setFont(labelFont);
        id.setFont(labelFont);
        name.setFont(labelFont);
        quantity.setFont(labelFont);
        status.setFont(labelFont);

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

        input.add(createLabelFieldPanel(id, idF));
        input.add(createLabelFieldPanel(name, nameF));
        input.add(createLabelFieldPanel(quantity, quantityF));
        input.add(createLabelFieldPanel(status, statusF));

        JLabel label1 = new JLabel("Label 1:");
        JTextField textField1 = new JTextField(10);
        JLabel label2 = new JLabel("Label 2:");
        JTextField textField2 = new JTextField(10);

        label1.setFont(labelFont);
        label2.setFont(labelFont);
        textField1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        textField2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        textField1.setBackground(Color.WHITE);
        textField2.setBackground(Color.WHITE);
        textField1.setPreferredSize(new Dimension(150, 30));
        textField2.setPreferredSize(new Dimension(150, 30));

        input.add(createLabelFieldPanel(label1, textField1));
        input.add(createLabelFieldPanel(label2, textField2));

        button.add(addB);
        button.add(cancelB);
        button.add(editB);

        Panel.add(headline, BorderLayout.NORTH);
        Panel.add(description, BorderLayout.CENTER);
        Panel.add(input, BorderLayout.WEST);
        Panel.add(button, BorderLayout.SOUTH);

        getContentPane().add(Panel);
        setSize(500, 400); //
        setLocationRelativeTo(null);
        setVisible(true);
    }


    private JPanel createLabelFieldPanel(JLabel label, JTextField textField) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(label);
        panel.add(textField);
        return panel;
    }

    public static void main(String[] args) {
        new WarehouseAdd3();
    }
}