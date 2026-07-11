package Botton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class MyFrame extends JFrame {

     JButton button = new JButton();

    MyFrame(){
        //ImageIcon icon = new ImageIcon("image.png");
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comi Sans", Font.BOLD, 23));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(e -> System.out.println("Poo"));
        button.setText("I am a button");
        button.setFocusable(false);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
       // button.setEnabled(false);



       
    
      
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(700, 700 );
        
       // button.setIcon(icon);
        this.add(button);
        this.setVisible(true); 
    }

    
}
