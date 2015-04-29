
/**
 *
 * @author jh215727
 */
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class FlowLayoutDemo extends JFrame{
    JPanel p = new JPanel();
    
    public FlowLayoutDemo(){
        setTitle("FlowLayoutDemo");
        setSize(700,105);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        p.setLayout(new FlowLayout());
        p.add(new JButton("Button 1"));
        p.add(new JButton("Button 2"));
        p.add(new JButton("Button 3"));
        p.add(new JButton("Button 4"));
        p.add(new JButton("Button 5"));
        p.add(new JButton("Button 6"));
        
        add(p);
    }
    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
    
}
