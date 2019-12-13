import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener;

public class Map {
    JLabel[][] mapSample = new JLabel[14][14];
    
    public void mapSetup() {
        for(int i = 0; i < 14; i++) {
            for(int k = 0; k < 14; k++) {
                mapSample[i][k] = new JLabel();
                mapSample[i][k].setOpaque(true);
            }
        }
    }
    
    
}
