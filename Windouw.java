import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Windouw {
    public static void main(String[] args){
         //Create a red panel
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 600 , 150);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(0, 150, 200, 250);

        JPanel greenPanel  = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(200, 150, 200, 250);

        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.black);
        blackPanel.setBounds(400, 150, 200, 250);

        JPanel pinkPanel = new JPanel();
        pinkPanel.setBackground(Color.pink);
        pinkPanel.setBounds(0, 400, 600, 200);




        JFrame  frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        frame.add(blackPanel);
        frame.add(pinkPanel);

        


    }

    


    
}
