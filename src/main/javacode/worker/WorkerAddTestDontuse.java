package main.javacode.worker;

import main.javacode.MenuDashboard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class WorkerAddTestDontuse extends JFrame implements ActionListener, Serializable {
    private JFrame fr;
    private JPanel pn1;
    private JPanel pn2;
    private JPanel pn3;
    private JPanel pn4;
    private JPanel pn5;
    
    private JPanel pn6;
    private JPanel pn7;
    private JPanel pn8;
    private JPanel dp1;

    private JLabel HeadLine;
    private JLabel Description;
    private JLabel FirstN;
    private JLabel LastN;
    private JLabel PhoneNum;
    private JLabel Email;
    private JLabel CitiID;
    private JLabel Address;
    private JButton AddWorker;
    private JTextField InputFN;
    private JTextField InputLN;
    private JTextField InNum;
    private JTextField InEmail;
    private JTextField InCiti;
    private JTextArea InAddress;
    private JButton Cancel;
    private ObjectWorker ow;
    public WorkerAddTestDontuse(){
        fr = new JFrame("ShoeFactoryManagement");
        fr.setLayout(new BorderLayout());

        pn1 = new JPanel(new BorderLayout());
        pn2 = new JPanel(new GridLayout(9,1));
        pn8 = new JPanel(new BorderLayout());

        pn3 = new JPanel();
        pn4 = new JPanel();
        pn5 = new JPanel();
        pn6 = new JPanel();
        pn7 = new JPanel();
        dp1 = new JPanel();

        MenuDashboard sidebarMenu = new MenuDashboard();
        fr.add(pn8, BorderLayout.CENTER);
        fr.add(pn7, BorderLayout.WEST);
        pn7.add(sidebarMenu);


        HeadLine = new JLabel("Headline");
        Description = new JLabel("Description");
        FirstN = new JLabel("FirstName");
        LastN = new JLabel("LastName");
        PhoneNum = new JLabel("PhoneNumber");
        Email = new JLabel("Email");
        CitiID = new JLabel("CitizenID");
        Address = new JLabel("Address");
        AddWorker = new JButton("Add Worker");
        InputFN = new JTextField();
        InputLN = new JTextField();
        InNum = new JTextField();
        InEmail = new JTextField();
        InCiti = new JTextField();
        InAddress = new JTextArea();
        dp1 = new JPanel(new FlowLayout());
        Cancel = new JButton("Cancel/Return");

        pn8.add(pn1, BorderLayout.NORTH);
        pn8.add(pn2, BorderLayout.CENTER);
        pn1.add(HeadLine, BorderLayout.NORTH);
        pn1.add(Description, BorderLayout.SOUTH);
        pn2.add(FirstN);
        pn2.add(LastN);
        pn2.add(InputFN);
        pn2.add(InputLN);
        pn2.add(Email);
        pn2.add(PhoneNum);
        pn2.add(InEmail);
        pn2.add(InNum);
        pn2.add(CitiID);
        pn2.add(pn3);
        pn2.add(InCiti);
        pn2.add(pn4);
        pn2.add(Address);
        pn2.add(pn5);
        pn2.add(InAddress);
        pn2.add(pn6);
        pn2.add(dp1);
        dp1.add(AddWorker);
        dp1.add(Cancel);
        AddWorker.addActionListener(this);
        Cancel.addActionListener(this);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1280, 720);
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(AddWorker)) {
            // Create ObjectWorker
            ow = new ObjectWorker(InputFN.getText(), InputLN.getText(), InEmail.getText(), InNum.getText(), InCiti.getText(), InAddress.getText());
            writeObjectWorkerFile();
            readObjectWorkerFile();
        } else if (ae.getSource().equals(Cancel)) {
            // Open WorkerAdd frame
            Worker worker = new Worker();
            worker.setVisible(true);
        }
    }
    public void writeObjectWorkerFile() {
        try(FileOutputStream fos = new FileOutputStream("ObjectWorker.csv");
            ObjectOutputStream ojos = new ObjectOutputStream(fos);) {
            ojos.writeObject(ow);
            ojos.flush();
            System.out.println("Write");
        } catch(IOException e) {
            System.out.println(e);
        }
    }
    public ObjectWorker readObjectWorkerFile() {
        ow = new ObjectWorker();
        try(FileInputStream fis = new FileInputStream("ObjectWorker.csv");
            ObjectInputStream ojos = new ObjectInputStream(fis);) {
            ow = (ObjectWorker)ojos.readObject();
            System.out.println("Read");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return ow;
    }
    public static void main(String[] args) {
        new WorkerAddTestDontuse();

    }

}