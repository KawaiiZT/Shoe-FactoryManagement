package main.javacode;
import javax.swing.*;
import java.awt.*;
public class SidebarMenu extends JPanel{
    public SidebarMenu(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //button section
        JButton btn1 = new JButton("btn1");
        JButton btn2 = new JButton("btn2");
        JButton btn3 = new JButton("btn3");

        add(Box.createRigidArea(new Dimension(0, 10)));
        add(btn1);
        add(Box.createRigidArea(new Dimension(0, 10)));
        // add 10-pixel ghost spacing

        add(btn2);
        add(Box.createRigidArea(new Dimension(0, 10)));

        add(btn3);

        // Set the background color to white
        setBackground(Color.GRAY);

        // Make the JPanel opaque so the background color is visible
        setOpaque(true);

        // Set the preferred size of the sidebar
        setPreferredSize(new Dimension(200, 720));
    }
}
