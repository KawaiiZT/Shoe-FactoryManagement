package main.javacode.home;
import main.javacode.MenuDashboard;
import main.javacode.worker.Worker;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
public class home {
    private JFrame fr;
    private JPanel pn1;
    private JPanel pn2;
    private JPanel pn3;
    private JButton itembutton;
    private JLabel headline;
    private JLabel item;
    private JLabel numofItem;
    private JPanel workerPanel;
    private JLabel worker;
    private JLabel numofworker;
    private JTable itemdetail;
    private JTable Workerdetail;
    private JPanel no1;
    private JPanel no2;

    private JTable test;

    private JPanel no4;
    private JPanel no3;
    private JScrollPane sp;

    public home(){
        fr = new JFrame("ShoeFactoryManagement");
        String data[][] = {{"101", "Trisit", "Charoenparipat"},{"102","Tester2","Tester2"}};
        String columns[] = {"ID", "FIRSTNAME", "LASTNAME"};
        DefaultTableModel model = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells uneditable
            }
        };
        
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        headline = new JLabel("Dashboard");
        itembutton = new JButton();
        workerPanel = new JPanel();
        worker = new JLabel("Worker in data");
        numofworker = new JLabel("     0");
        numofworker.setFont(new Font("Arial", Font.PLAIN, 24));
        item = new JLabel("Item in Stock");
        no1 = new JPanel();
        no2 = new JPanel();
        no3 = new JPanel();
        test = new JTable(model);
        sp = new JScrollPane(test);

        no4 = new JPanel();
        fr.setLayout(new BorderLayout());
        MenuDashboard menu = new MenuDashboard();


        pn1.add(menu);
        fr.add(pn1, BorderLayout.WEST);
        fr.add(pn2, BorderLayout.CENTER);
        pn2.setBorder(BorderFactory.createEmptyBorder(-30,4,-70,10));
        pn2.setLayout(new GridLayout(5,0));
        pn2.add(headline);
        pn2.add(pn3);

        //Button and Panel that show how many are there in the data
        pn3.setLayout(new GridLayout(1,6,30,0));
        pn3.setBorder(BorderFactory.createEmptyBorder(0,0,40,0));
        //item
        pn3.add(itembutton);
        itembutton.setLayout(new GridLayout(4,0));
        itembutton.add(item);
        itembutton.setBackground(Color.RED);
        //worker
        pn3.add(workerPanel);
        workerPanel.setLayout(new GridLayout(4,0));
        workerPanel.setBorder(BorderFactory.createEmptyBorder(0,20,0,0));
        workerPanel.add(worker);
        workerPanel.add(numofworker);
        workerPanel.setBackground((Color.CYAN));

        //stillworkingonit
        pn3.add(no1);
        no1.setBackground(Color.GREEN);
        //stillworkingonit2
        pn3.add(no2);
        no2.setBackground(Color.YELLOW);

        //JTable for Static
        pn2.add(no4);
        no4.setBackground(Color.DARK_GRAY);
        no4.setLayout(new GridLayout(0,2));
        no4.add(sp);
        no4.add(no3);
        no3.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        no3.setBackground(Color.ORANGE);
        no4.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));



        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1280, 720);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new home();
    }
}
