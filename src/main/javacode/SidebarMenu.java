package main.javacode;

// ดึงข้อมูลในไฟล์ Worker, Warehouse
import main.javacode.worker.Worker;
import main.javacode.Warehouse.Warehouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SidebarMenu extends JPanel implements ActionListener {
    private JButton bt1, bt2, bt3;
    public SidebarMenu() {
        //button section
        bt1 = new JButton("Home");
        bt2 = new JButton("Worker");
        bt3 = new JButton("WareHouse");

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(Box.createRigidArea(new Dimension(0, 10)));
        add(bt1);

        add(Box.createRigidArea(new Dimension(0, 10)));
        // add 10-pixel ghost spacing
        add(bt2);

        add(Box.createRigidArea(new Dimension(0, 10)));
        add(bt3);

        //connect to another Page
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        // Set the background color to white
        setBackground(Color.decode("#711925"));

        // Make the JPanel opaque so the background color is visible
        setOpaque(true);

        // Set the preferred size of the sidebar
        setPreferredSize(new Dimension(200, 720));
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bt1)) {
            // Open Home Frame
        } else if (ae.getSource().equals(bt2)) {
            Worker w = new Worker();
            w.setVisible(true);
        } else if (ae.getSource().equals(bt3)) {
            Warehouse wh = new Warehouse();
            wh.setVisible(true);
        }
    }
}
