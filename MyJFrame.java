import javax.swing.JButton;
import javax.swing.JFrame;

public class MyJFrame extends JFrame{
    MyJFrame(){
        JButton button = new JButton();
        button.setBounds(50, 50, 70, 50);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setSize(699, 699);
        this.setBounds(0, 0, 250, 250);
        this.setLayout(null);
        this.add(button);
    }
    
}
