import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyJFrame extends JFrame{
    MyJFrame(){
        JButton button1 = new JButton();
        button1.setBounds(0,0 , 80, 50);
        button1.addActionListener(e -> System.out.println("X"));
        button1.setText("Button 1.");
        button1.setBackground(Color.CYAN);
        button1.setBorder(BorderFactory.createEtchedBorder());
        JButton button2 = new JButton();
        button2.addActionListener(e -> System.out.println("0"));
        button2.setBounds(150, 0, 80, 50);
        button2.setText("Button 2.");
        button2.setBackground(Color.MAGENTA);
        button2.setBorder(BorderFactory.createEtchedBorder());
        JButton[] buttons = new JButton[9];
        for(int i  = 0; i < 9; i++){
            buttons[i] = new JButton();
            int row = i/ 3;
            int col = i % 3;
            
            int x = 50 + col * 80;
            int y = 50 + row * 80;
            buttons[i].setBounds(x, y, 80, 80);
            
            this.add(buttons[i]);
        


        }

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        this.setLayout(null);
        this.add(button1);
        this.add(button2);
       
        this.setVisible(true);
        this.setSize(700, 700);
        
    }
    
}
