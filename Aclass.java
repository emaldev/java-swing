import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Aclass {
    public static void mian(String[] args){


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 200, 200);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(200, 0, 200, 200);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(440, 0, 200, 200);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(0, 200, 300, 300);

        JPanel pinkPanel = new JPanel();
        pinkPanel.setBackground(Color.pink);
        pinkPanel.setBounds(300, 200, 300, 300);

        JFrame myFrame  = new JFrame();
        myFrame.setVisible(true);
        myFrame.setSize(600, 600);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(null);
        ImageIcon icon = new ImageIcon("Pic.jpg");
        myFrame.setIconImage(icon.getImage());
        myFrame.getContentPane().setBackground(Color.yellow);
        myFrame.add(redPanel);
        myFrame.add(bluePanel);
        myFrame.add(greenPanel);
        myFrame.add(yellowPanel);
        myFrame.add(pinkPanel);
        
        
    }
}
