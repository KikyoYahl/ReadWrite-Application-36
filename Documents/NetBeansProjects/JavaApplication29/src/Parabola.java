

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * @author jh215727
 */
public class Parabola extends JFrame{
    
    Polygon p = new Polygon();
   
    public Parabola(){
        setVisible(true);
        
        this.getContentPane().add(new GraphPanel());
        pack();
        setTitle("Parabola");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        Parabola parabola = new Parabola();
    }
    
    class GraphPanel extends JPanel{
        
        public GraphPanel()
        {
            setPreferredSize(new Dimension(430,250));
        }
        
         public void paintComponent(Graphics g){
        
        
        double scaleFactor = 0.1;
            for (int x=-100; x<=100; x++) {

                p.addPoint(x+200, 200- (int)(scaleFactor *x *x));

            }
        
            g.drawPolygon(p);
            
           
        }
    }
}