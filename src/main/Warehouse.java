package main;

import main.javacode.SidebarMenu;

import javax.swing.*;
import java.awt.*;

public class Warehouse extends JFrame {
    public Warehouse() {
        setTitle("Warehouse");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SidebarMenu sidebarMenu = new SidebarMenu();
        JPanel panel = new JPanel(new BorderLayout());

        panel.add(sidebarMenu, BorderLayout.WEST);
        add(panel);

        pack();
        setSize(1280, 720);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Warehouse();
    }
}
