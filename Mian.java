import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class Mian {
    public static void main(String[] args){
 
        // Create a frame
        JFrame myFrame = new JFrame();
        ImageIcon image = new ImageIcon("Pic.jpg");
        myFrame.setIconImage(image.getImage());
        // add title the visible 
        myFrame.setTitle("Java first Swing");
        // set size of visible
        myFrame.setSize(420, 420);
        // make a frame visible 
        myFrame.setVisible(true);
        myFrame.getContentPane().setBackground(Color.blue);
        
    }
    
}
