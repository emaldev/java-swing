import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Mian {
    public static void main(String[] args){

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0 , 0, 250, 250);
        // add ad ble panel.
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        // add a green panale.
        JPanel greePanel = new JPanel();
        greePanel.setBackground(Color.green);
        greePanel.setBounds(112, 0, 350, 350);
        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.black);
        blackPanel.setBounds(0, 250, 250, 250);
        
        
          JFrame frame = new JFrame();
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setLayout(null);
          frame.setSize(750, 750);
          frame.setVisible(true);
          frame.add(redPanel);
          frame.add(bluePanel);
          frame.add(greePanel);
          frame.add(blackPanel);
          
      
        
    }
    
}
