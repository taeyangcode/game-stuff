
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener;
import javax.swing.border.*;

public class Game implements KeyListener {
    int gameRow = 15, gameCol = 15;
    int snakeX = 1, snakeY = 1;
    
    Border gridBorder = new LineBorder(Color.BLACK, 1);
    Border snakeBorder = new LineBorder(Color.decode("#228B22"), 4);
    GridLayout gameBoardLayout = new GridLayout(gameRow, gameCol);
    JFrame gameScreen = new JFrame();
    JPanel panelScreen = new JPanel();
    JPanel endscreen = new JPanel();
    JLabel[][] gameLayout = new JLabel[gameRow][gameCol];
    
    public void swingSetup(int screenW, int screenH) {
        gameScreen.addKeyListener(this);
        
        gameScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameScreen.setSize(screenW, screenH);
        gameScreen.setResizable(false);
        gameScreen.setTitle("Snake Game");
        gameScreen.add(panelScreen);
        
        panelScreen.setLayout(gameBoardLayout);
        
        for(int i = 0; i < gameRow; i++) {
            for(int k = 0; k < gameCol; k++) {
                gameLayout[i][k] = new JLabel();
                gameLayout[i][k].setBorder(gridBorder);
                gameLayout[i][k].setOpaque(true);
                panelScreen.add(gameLayout[i][k]);
            }
        }
        
        gameLayout[snakeY][snakeX].setBorder(snakeBorder);
        
        gameScreen.setVisible(true);
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
    
        if(key == KeyEvent.VK_UP) {
            System.out.println(snakeY);
            snakeY--;
            gameLayout[snakeY][snakeX].setBorder(snakeBorder);
            
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        else if(key == KeyEvent.VK_RIGHT) {
            System.out.println(snakeX);
            snakeX++;
            gameLayout[snakeY][snakeX].setBorder(snakeBorder);
            
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        else if(key == KeyEvent.VK_DOWN) {
            System.out.println(snakeY);
            snakeY++;
            gameLayout[snakeY][snakeX].setBorder(snakeBorder);
            
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        else if(key == KeyEvent.VK_LEFT) {
            System.out.println(snakeX);
            snakeX--;
            gameLayout[snakeY][snakeX].setBorder(snakeBorder);
            
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    @Override 
    public void keyReleased(KeyEvent e) {
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }
    
    public void snakeSetup() {
        
    }
}
