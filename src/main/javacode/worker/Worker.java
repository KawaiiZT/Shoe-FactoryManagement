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
public class Worker{
    private JFrame fr;
    private JTable tableinfo;
    public Worker(){
        String data[][]={ {"101","Trisit","Charoenparipat","087XXXXX","MALE","7/8/2547","000000","1101700361xxx"},    
                          };
    String column[]={"ID","FIRSTNAME","LASTNAME","PHONENUMBER,SEX,DAY/MONTH/YEAR,PASSPORT,CITIZENCARD"};        
        fr = new JFrame("ShoeFactoryManagement");
        tableinfo = new JTable(data, column);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    
}
