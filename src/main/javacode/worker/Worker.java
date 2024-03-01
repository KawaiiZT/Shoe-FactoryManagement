package main.javacode.worker;

import javax.swing.*;
import java.awt.*;

public class Worker {
    private JFrame fr;
    private JTable tableinfo;
    private JScrollPane sp;

    public Worker() {
        String data[][] = {{"101", "Trisit", "Charoenparipat"}};
        String column[] = {"ID", "FIRSTNAME", "LASTNAME"};

        fr = new JFrame("ShoeFactoryManagement");
        tableinfo = new JTable(data, column);
        sp = new JScrollPane(tableinfo);

        fr.add(sp); // Adding JScrollPane instead of JTable
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1280, 720);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new Worker();
    }
}