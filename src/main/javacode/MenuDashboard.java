package main.javacode;
import javax.swing.*;
public class MenuDashboard extends JFrame{
    public MenuDashboard(){
        setTitle("MenuDashboard");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SidebarMenu sidebarMenu = new SidebarMenu();
        add(sidebarMenu);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuDashboard();
    }
}
