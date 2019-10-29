import javax.swing.*;
import java.awt.*;

public class Franels {
    int width, height;
    
    Game taker;
    
    JFrame frame = new JFrame("Title");
    JPanel panel = new JPanel();
    JButton button = new JButton("Hello");
    JTextArea textArea = new JTextArea(taker.getAmount());
    
    public void JFrame(int width, int height) {
        this.width = width;
        this.height = height;
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
        
        frame.add(panel);
        
        frame.getContentPane().addMouseListener(new Game());
    }
    
    public void JPanel() {
        panel.setBounds(300, 300, 300, 300);
        panel.setBackground(Color.blue);
        panel.setVisible(true);
        
        //panel.add(button);
        panel.add(textArea);
    }
    
    public void JText() {
        textArea.setEditable(false);
    }
    
    //public void JButton() {
        //button.setBounds(300, 300, 80, 30);
        //button.setBackground(Color.red);
        //button.setVisible(true);
    //}
    
    
    
    
    
    
}
