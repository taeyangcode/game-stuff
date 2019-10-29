import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Franels extends MouseAdapter {
    int width, height;
    int amount = 0;
    
    JFrame frame = new JFrame("Title");
    JPanel panel = new JPanel();
    JButton button = new JButton("Hello");
    JLabel label = new JLabel();
    
    public void FrameConfig(int width, int height) {
        this.width = width;
        this.height = height;
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
        
        frame.add(panel);
        
        frame.getContentPane().addMouseListener(this);
    }
    
    public void PanelConfig() {
        panel.setBounds(300, 300, 300, 300);
        panel.setBackground(Color.blue);
        panel.setVisible(true);
        
        panel.add(label);        
    }
    
    public void LabelConfig() {
        label.setForeground(Color.red);
    }
    
    public void mouseClicked(MouseEvent e) {
        amount++;
        label.setText(String.valueOf(amount));
    }
    
    
    
    
}
