package main.javacode.home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import main.javacode.worker.Worker;

public class HomeCard extends JFrame implements ActionListener {
    private JPanel cards;
    private CardLayout cardLayout;
    private JList<String> sidebarMenu;
    private JPanel card2, card3;
    private Worker workerPanel;

    public HomeCard() {
        // Sidebar menu setup
        JPanel sidebarMenuPanel = new JPanel();
        sidebarMenuPanel.setLayout(new GridLayout(0, 1)); // Vertical layout
        sidebarMenuPanel.setPreferredSize(new Dimension(150, 400));

        JButton homeItem = new JButton("Home");
        homeItem.setBackground(new Color(52, 152, 219)); // Set background color
        homeItem.setForeground(Color.WHITE); // Set text color
        homeItem.setFont(new Font("Arial", Font.BOLD, 14)); // Set font
        homeItem.setBorderPainted(false); // Remove border
        homeItem.setFocusPainted(false); // Remove focus border
        homeItem.setContentAreaFilled(true); // Set content area filled

        JButton menuItem2 = new JButton("Card 2");
        JButton menuItem3 = new JButton("Card 3");
        JButton workerItem = new JButton("Worker");

        // Adding ActionListener to each button
        homeItem.addActionListener(this);
        menuItem2.addActionListener(this);
        menuItem3.addActionListener(this);
        workerItem.addActionListener(this);

        // Add buttons to sidebar menu panel
        sidebarMenuPanel.add(homeItem);
        sidebarMenuPanel.add(menuItem2);
        sidebarMenuPanel.add(menuItem3);
        sidebarMenuPanel.add(workerItem);

        // Cards setup
        Home homePanel = new Home();
        card2 = new JPanel();
        card2.setBackground(Color.GREEN);
        card3 = new JPanel();
        card3.setBackground(Color.BLUE);
        workerPanel = new Worker();

        // Card layout setup
        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);
        cards.add(homePanel, "Home");
        cards.add(card2, "Card 2");
        cards.add(card3, "Card 3");
        cards.add(workerPanel, "Worker");

        // Add components to content pane
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(sidebarMenuPanel, BorderLayout.WEST);
        getContentPane().add(cards, BorderLayout.CENTER);

        setTitle("ShoeFactoryManagement");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 700);
        // ตั้งตำแหน่งการเปิด GUI เป็นกลางหน้าจอ
        setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println(e);
        }
        String command = ae.getActionCommand();
        cardLayout.show(cards, command);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HomeCard example = new HomeCard();
            example.setVisible(true);
        });
    }
}
