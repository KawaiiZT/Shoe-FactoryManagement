package main.javacode;
import main.Warehouse;
import main.javacode.worker.Worker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SidebarMenu extends JPanel{
    public SidebarMenu(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //button section
        JButton btn1 = new JButton("Home");
        JButton btn2 = new JButton("Worker");
        JButton btn3 = new JButton("WareHouse");

        add(Box.createRigidArea(new Dimension(0, 10)));

        add(btn1);
        add(Box.createRigidArea(new Dimension(0, 10)));
        // add 10-pixel ghost spacing

        add(btn2);
        add(Box.createRigidArea(new Dimension(0, 10)));

        add(btn3);

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Worker worker = new Worker();
                worker.setVisible(true);
            }

        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Warehouse wh = new Warehouse();
                wh.setVisible(true);
            }

        });

        // Set the background color to white
        setBackground(Color.decode("#711925"));

        // Make the JPanel opaque so the background color is visible
        setOpaque(true);

        // Set the preferred size of the sidebar
        setPreferredSize(new Dimension(200, 720));
    }
}
