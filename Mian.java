import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Mian {
    public static void main(String[] args){
        
        // Crear a panal
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250 );
 
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
        myFrame.add(redPanel);
        
    }
    
}
