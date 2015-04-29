

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
/**
 *
 * @author jh215727
 */
public class BorderLayoutDemo extends JFrame {
    private JButton b1, b2, b3, b4, b5, b6;
    public BorderLayoutDemo(){
        b1 = new JButton("Button1");
        b2 = new JButton("Button2");
        b3 = new JButton("Button3");
        b4 = new JButton("Button4");
        b5 = new JButton("Button5");
        b6 = new JButton("Button6");
        setLayout(new BorderLayout());
            
        setSize(new Dimension(390,300));
        setLayout(new BorderLayout(5,5));
     
        add(new JButton("Button1"),BorderLayout.PAGE_START);
        add(new JButton("Button2"),BorderLayout.CENTER);
        add(new JButton("Button3"),BorderLayout.PAGE_END);
        add(new JButton("Button4"),BorderLayout.LINE_END);
        add(new JButton("Button5"),BorderLayout.CENTER);
        add(new JButton("Button6"),BorderLayout.LINE_START);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }   
}