package main.javacode.Warehouse;

import javax.swing.*;
import java.awt.*;

public class WarehouseAdd extends JFrame{
    private JFrame fr;
    private JPanel pn;
    private JPanel pn1;
    private JPanel pn2;
    
    private JPanel pn3;
    private JPanel pn4;
    private JPanel pn5;
    private JPanel pn6;
    private JPanel pn8;
    private JPanel dp1;

    private JLabel HeadLine;
    private JLabel Description;
    private JLabel ID;
    private JLabel Name;
    private JLabel Quantity;
    private JLabel Status;
    
    private JTextField InputID;
    private JTextField InputName;
    private JTextField InputQ;
    private JTextField InputS;
    
    private JButton AddWorker;
    private JButton Cancel;
    private JButton Edit;
    
    public WarehouseAdd(){
        fr = new JFrame("WareHouseAdd");
        fr.setLayout(new BorderLayout());
        pn = new JPanel(new BorderLayout());

        pn.setPreferredSize(new Dimension(200 ,720));
        pn1 = new JPanel(new BorderLayout());
        pn2 = new JPanel(new GridLayout(7,1));
        pn8 = new JPanel(new BorderLayout());

        pn3 = new JPanel();
        pn4 = new JPanel();
        pn5 = new JPanel();
        pn6 = new JPanel();
        dp1 = new JPanel();
        
        HeadLine = new JLabel("Headline");
        Description = new JLabel("Description");
        ID = new JLabel("ID");
        Name = new JLabel("Name");
        Quantity = new JLabel("Quantity");
        Status = new JLabel("Status");
        
        AddWorker = new JButton("Add Worker");
        InputID = new JTextField();
        InputName = new JTextField();
        InputQ = new JTextField();
        InputS = new JTextField();
        dp1 = new JPanel(new FlowLayout());
        Cancel = new JButton("Cancel/Return");
        Edit = new JButton("Edit");

        pn8.add(pn1, BorderLayout.NORTH);
        pn8.add(pn2, BorderLayout.CENTER);
        pn1.add(HeadLine, BorderLayout.NORTH);
        pn1.add(Description, BorderLayout.SOUTH);
        pn2.add(ID);
        pn2.add(Name);
        pn2.add(InputID);
        pn2.add(InputName);
        pn2.add(Quantity);
        pn2.add(Status);
        pn2.add(InputQ);
        pn2.add(InputS);
        pn2.add(pn3);
        pn2.add(pn4);
        pn2.add(pn5);
        pn2.add(pn6);
        pn2.add(dp1);
        dp1.add(AddWorker);
        dp1.add(Cancel);
        dp1.add(Edit);
        
        fr.add(pn8, BorderLayout.CENTER);
        fr.add(pn, BorderLayout.WEST);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1280, 720);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new WarehouseAdd();
    }
}