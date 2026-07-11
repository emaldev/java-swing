import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Windouw {
    public static void main(String[] args){

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 600 , 150);
        

        JFrame  frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(600, 600);
        


    }

    


    
}
