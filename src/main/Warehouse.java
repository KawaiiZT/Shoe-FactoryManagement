package main;

import main.javacode.MenuDashboard;
import main.javacode.SidebarMenu;

import javax.swing.*;
import java.awt.*;

public class Warehouse extends JFrame {
    public Warehouse() {
        setTitle("Warehouse");


        MenuDashboard sidebarMenu = new MenuDashboard();
        JPanel panel = new JPanel(new BorderLayout());

        panel.add(sidebarMenu, BorderLayout.WEST);
        add(panel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 720);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Warehouse();
    }
}
