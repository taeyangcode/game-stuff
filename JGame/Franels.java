import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class Franels extends MouseAdapter {
    int width, height;
    int amount = 0;
    
    JFrame cookieGameWindow = new JFrame("Title");
    
    JPanel cookiePanel = new JPanel();
    JPanel amountPanel = new JPanel();
    
    JLabel cookieAmount = new JLabel();
    JLabel cookieImage = new JLabel();
    
    ImageIcon image = new ImageIcon();
    
    public void FrameConfig(int width, int height) {
        this.width = width;
        this.height = height;
        cookieGameWindow.setSize(width, height);
        cookieGameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cookieGameWindow.setVisible(true);
        cookieGameWindow.setLayout(null);
        cookieGameWindow.setResizable(false);
        
        cookieGameWindow.add(amountPanel);
        cookieGameWindow.add(cookiePanel);
    }
    
    public void AmountPConfig() {
        amountPanel.setBounds(800, 450, 200, 200);
        amountPanel.setVisible(true);
        
        cookiePanel.add(cookieAmount);
    }
    
    public void CookiePConfig() {
        cookiePanel.setBounds(300, 300, 300, 350);
        cookiePanel.setVisible(true);
        
        cookiePanel.add(cookieImage);
    }
    
    public void AmountLConfig() {
        cookieAmount.setForeground(Color.red);
    }
    
    public void CookieLConfig() {
        cookieImage.setIcon(new ImageIcon("C:\\Users\\cmostero\\Downloads\\rsz_1cookie.png"));
        
        cookieImage.addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent e) {
            amount++;
            cookieAmount.setText(String.valueOf(amount));
        }
        });
    }
    
    
    
    
}
