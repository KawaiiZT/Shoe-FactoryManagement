package main.javacode.expense;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ExpenseAddV2 {
    public JFrame fr;
    public JPanel p1, p2, pi2, p3, pi3, p4, pi4, p5;
    public JLabel lb, lb1, lb2, lb3, lb4, lb5;
    public JTextField txt1, txt2, txt3, txt4, txt5;
    public JComboBox box1, box2, box3, box4;
    public JButton bt;
    public Font lbfont;
    public ExpenseAddV2(){

        fr = new JFrame("ExpenseAdd");
        p1 = new JPanel();
        p2 = new JPanel();
        pi2 = new JPanel();
        p3 = new JPanel();
        pi3 = new JPanel();
        p4 = new JPanel();
        pi4 = new JPanel();
        bt = new JButton("Confirm");

        //inbox
        String[] income = {"Sale", "Other revenue"};
        String[] expense = {"COGS", "Selling Expenses", "Administrative Expenses"};
        String[] date = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
                "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        //combobox
        box1 = new JComboBox(income);
        box2 = new JComboBox(expense);
        box3 = new JComboBox(date);
        box4 = new JComboBox(month);


        //label
        lb = new JLabel("ADD Income/Expense");
        lbfont = new Font("Arial", Font.BOLD, 24);
        lb.setFont(lbfont);
        
        lb1 = new JLabel("  Order  ");
        lb2 = new JLabel("  Income  ");
        lb3 = new JLabel("  Expense  ");
        lb4 = new JLabel("  Date  ");
        lb5 = new JLabel("  Note  ");
        //textfield
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        txt4 = new JTextField();
        txt5 = new JTextField();

        //set fr
        fr.setLayout(new BorderLayout());
        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2, BorderLayout.WEST);
        fr.add(p3);
        fr.add(p4, BorderLayout.SOUTH);

        //set panel
        p1.setPreferredSize(new Dimension(75 ,50));
        p2.setLayout(new GridLayout(5,1, 30, 30));
        p3.setLayout(new GridLayout(5,1, 30, 30));
        pi2.setLayout(new GridLayout(1,2, 30, 30));
        pi3.setLayout(new GridLayout(1,2, 30, 30));
        pi4.setLayout(new GridLayout(1,3, 30, 30));
        txt3.setSize(50, 50);


        //panel1
        p1.add(lb);

        //panel2
        p2.add(lb1);
        p2.add(lb2);
        p2.add(lb3);
        p2.add(lb4);
        p2.add(lb5);

        //panel3
        p3.add(txt1);
        txt1.setPreferredSize(new Dimension(225 ,25));
        p3.add(pi2);
        p3.add(pi3);
        p3.add(pi4);
        p3.add(txt4);
        p3.add(txt5);

        //panel4
        p4.add(bt);

        //panel2.1
        pi2.add(box1, BorderLayout.WEST);
        pi2.add(txt2);
        //panel3.1
        pi3.add(box2, BorderLayout.WEST);
        pi3.add(txt3);
        //panel4.1
        pi4.add(box3, BorderLayout.WEST);
        pi4.add(box4);
        pi4.add(txt4);

        fr.setSize(400, 400);
        fr.setLocation(600, 300);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new ExpenseAddV2();
    }
}

