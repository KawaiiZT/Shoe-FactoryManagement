package main.javacode.worker;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KoonD
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Worker {
    private JFrame fr;
    private JLabel lb1;
    private JTextArea InID;
    private JLabel lb2;
    private JTextArea InName;
    private JLabel lb3;
    private JTextArea InPass;
    private JLabel lb4;
    private JTextArea InPhone;
    private JButton Create;
    private JLabel lb5;
    private JComboBox selectRole;
    private JRadioButton SexSelected;
    private JTable tableinfo;
    public Worker(){
        lb1 = new JLabel("ID input");
        lb2 = new JLabel("Input Name");
        lb3 = new JLabel("Input Password");
    }
    
}
