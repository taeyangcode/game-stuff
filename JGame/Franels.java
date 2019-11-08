import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class Franels extends MouseAdapter {
    int width, height;
    int amount = 0;
    
    JFrame cookieGameWindow = new JFrame("Title");
    
    JPanel cookieHolder = new JPanel();
    
    JLabel cookieAmount = new JLabel(String.valueOf(amount));
    JLabel cookieImage = new JLabel();
    
    ImageIcon image = new ImageIcon();
    
    public void FrameConfig(int width, int height) {
        this.width = width;
        this.height = height;
        cookieGameWindow.setSize(width, height);
        cookieGameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cookieGameWindow.setVisible(true);
        cookieGameWindow.setResizable(false);
        
        cookieGameWindow.add(cookieHolder);
    }
    
    public void CookiePosOrganize() {
        cookieHolder.setLayout(new GridLayout(3, 1));
        
        cookieHolder.add(cookieAmount);
        cookieHolder.add(cookieImage);
    }
    
    public void AmountLConfig() {
        cookieAmount.setForeground(Color.black);
        cookieAmount.setFont(new Font("Times New Roman", Font.PLAIN, 48));
        cookieAmount.setHorizontalAlignment(JLabel.CENTER);
        cookieAmount.setVerticalAlignment(JLabel.TOP);
    }
    
    public void CookieLConfig() {
        cookieImage.setIcon(new ImageIcon("C:\\Users\\cmostero\\Downloads\\Webp.net-resizeimage.png"));
        cookieImage.setHorizontalAlignment(JLabel.CENTER);
        
        cookieImage.addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent e) {
            amount++;
            cookieAmount.setText(String.valueOf(amount));
        }
        });
    }
    
    
    
    
}
