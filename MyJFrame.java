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

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setSize(700, 700);
        this.setBounds(50, 50, 250, 250);
        this.setLayout(null);
        this.add(button1);
        this.add(button2);
    }
    
}
