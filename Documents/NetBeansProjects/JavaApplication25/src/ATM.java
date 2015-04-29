import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author Jisheng
 */
public class ATM extends JFrame{
    private JPanel displayPanel, pinpadPanel;
    private JButton[] numberButton = new JButton[10];
    private JPasswordField passwordField;
    private JButton enterButton,clearButton, zeroButton;
    private String input = ""; 
    final String CorrectPin = "1234";
    
          
    
    public ATM(){
        displayPanel = new JPanel();
        displayPanel.setBackground(Color.GRAY);
        displayPanel.setLayout(new BorderLayout());
        
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("MS San Serif", Font.BOLD, 25));
        displayPanel.add(passwordField, BorderLayout.NORTH);
        
        pinpadPanel = new JPanel();
        pinpadPanel.setBackground(Color.yellow);
        pinpadPanel.setLayout(new GridLayout(4,3));
        for(int i = 1; i < 10; i++){
            numberButton[i] = new JButton(String.valueOf(i));
            numberButton[i].addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent ae) {
                    input += ae.getActionCommand();
                    passwordField.setText(input);
                    System.out.println(input);
                }
        
        });
            pinpadPanel.add(numberButton[i]);
        }
        
        clearButton = new JButton("C");
        clearButton.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent ae) {
                    //input += ae.getActionCommand();
                    passwordField.setText("");
                    input = "";
                }
        
        });
        pinpadPanel.add(clearButton);
        zeroButton = new JButton("0");
        zeroButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                input += ae.getActionCommand();
                    passwordField.setText(input);
                    System.out.println(input);
            }
            
        });
        pinpadPanel.add(zeroButton);
        enterButton = new JButton("\u21B5");
        enterButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                if(input.equals(CorrectPin)){
                    JOptionPane.showMessageDialog(null, "Welcome !");
                }else{
                    JOptionPane.showMessageDialog(null, "Wrong Passcode !");
                }
            }
        });
        pinpadPanel.add(enterButton);
        
        
        displayPanel.add(pinpadPanel, BorderLayout.CENTER);
        
        add(displayPanel);
        setTitle("Internetional Conquer Bank");
        setSize(800,600);
        setVisible(true);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    class ClearListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
            passwordField.setText("");
        }
        
    }
}