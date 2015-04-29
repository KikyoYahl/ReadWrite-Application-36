

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Jisheng
 */
public class GridLayoutDemo {
    
    public GridLayoutDemo(){
        JFrame frame = new JFrame("GridLayoutDemo");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        JButton b6 = new JButton("Button 6");
        
        panel1.setLayout(new GridLayout(2,2));
        panel2.setLayout(new GridLayout(2,2));
        
        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);
        panel2.add(b4); 
        panel2.add(b5);
        panel2.add(b6);
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setSize(200,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GridLayoutDemo();
    }
    
}
