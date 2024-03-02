package main.javacode.worker;

import main.javacode.SidebarMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WorkerRemove extends JFrame{
    private JFrame fr;
    private JPanel pn1;
    private JPanel pn2;

    public WorkerRemove(){
        fr = new JFrame("ShoeFactoryManagement");
        fr.setLayout(new BorderLayout());
        pn1 = new JPanel();
        pn2 = new JPanel();

        fr.add(pn1, BorderLayout.WEST);
        fr.add(pn2, BorderLayout.EAST);
        SidebarMenu sidebarMenu = new SidebarMenu();
        pn1.add(sidebarMenu);

      fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1280, 720);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new WorkerRemove();
    }

}
