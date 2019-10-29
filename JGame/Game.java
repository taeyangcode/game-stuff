import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends MouseAdapter {
    int amount = 0;
    String myString;
    
    public void mouseClicked(MouseEvent e) {
        amount++;
    }
    
    public String getAmount() {
        return myString = Integer.toString(amount);   
    }
    
    
    
    
}
