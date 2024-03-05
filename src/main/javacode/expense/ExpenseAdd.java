package main.javacode.expense;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExpenseAdd implements ActionListener {
    private JFrame f;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JComboBox cb;
    private JButton b1;
    private JButton b2;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    Date d = new Date();


    public ExpenseAdd() {
        f = new JFrame("Add");
        l1 = new JLabel("Date");
        l2 = new JLabel();
        l3 = new JLabel("Order");
        l4 = new JLabel("Note");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        cb = new JComboBox();
        b1 = new JButton("Confirm");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();

        f.setLayout(new GridLayout(5, 0));
        p1.setLayout(new GridLayout(0, 2));
        p2.setLayout(new GridLayout(0, 2));
        p3.setLayout(new GridLayout(0, 2));
        p4.setLayout(new GridLayout(0, 2));

        cb.addItem("Income");
        cb.addItem("Expense");

        l2.setText(df.format(d));

        p1.add(l1);
        p1.add(l2);

        p2.add(l3);
        p2.add(t1);

        p3.add(cb);
        p3.add(t2);

        p4.add(l4);
        p4.add(t3);

        p5.add(b1);

        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        f.add(p5);

        b1.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 200);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(b1)) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }

    public static void main(String[] args) {
        new ExpenseAdd();
    }
}

