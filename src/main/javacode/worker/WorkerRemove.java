package main.javacode.worker;

import main.javacode.MenuDashboard;
import main.javacode.SidebarMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WorkerRemove extends JFrame{
    private JFrame fr;
    private JPanel pn1, pn2;
    private MenuDashboard sidebarMenu;
    public WorkerRemove(){
        fr = new JFrame("ShoeFactoryManagement");
        pn1 = new JPanel();
        pn2 = new JPanel();
        sidebarMenu = new MenuDashboard();

        pn1.add(sidebarMenu);

        fr.setLayout(new BorderLayout());
        fr.add(pn1, BorderLayout.WEST);
        fr.add(pn2, BorderLayout.EAST);

        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setSize(1280, 720);
        fr.setVisible(true);
        // ตั้งตำแหน่งการเปิด GUI เป็นกลางหน้าจอ
        fr.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        WorkerRemove wr = new WorkerRemove();
    }
}
