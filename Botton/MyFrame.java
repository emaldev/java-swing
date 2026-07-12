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
        button.setHorizontalTextPosition(JButton.CENTER);// تیظم کردن دکمه در وست 
        button.setVerticalTextPosition(JButton.BOTTOM);// قراردادن در بالا 
        button.setFont(new Font("Comi Sans", Font.BOLD, 23));// درشت کردن خطوط داخل دکمه 
        button.setIconTextGap(-15);// کم کردن درشتی خطوط
        button.setForeground(Color.cyan);// رنگ بکگروند خطوط داخل  
        button.setBounds(100, 100, 250, 100);// اندازه دکمه 
        button.addActionListener(e -> System.out.println("Poo"));// متن که باید چاپ کند 
        button.setText("I am a button");// اضافه کردن متن 
        button.setFocusable(false);// 
        button.setBackground(Color.lightGray);// رنگ بگروند 
        button.setBorder(BorderFactory.createEtchedBorder());// اضافه کردن باردر 
       // button.setEnabled(false); // درصورت یک بار استفاده از کار می افتد 



       
    
      
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(700, 700 );
        
       // button.setIcon(icon);
        this.add(button);
        this.setVisible(true); 
    }

    
}
