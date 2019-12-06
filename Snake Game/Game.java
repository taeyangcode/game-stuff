import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.concurrent.TimeUnit;

public class Game {
    int gameRow = 15, gameCol = 15;
    int snakeX = 1, snakeY = 1;
    int snakeHead, snakeBody;
    
    GridLayout gameBoardLayout = new GridLayout(gameRow, gameCol);
    JFrame gameScreen = new JFrame();
    JPanel panelScreen = new JPanel();
    JLabel[][] gameLayout = new JLabel[gameRow][gameCol];
    
    public void swingSetup(int screenW, int screenH) {
        gameScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameScreen.setSize(screenW, screenH);
        gameScreen.setResizable(false);
        gameScreen.setTitle("Snake Game");
        gameScreen.add(panelScreen);
        
        panelScreen.setLayout(gameBoardLayout);
        
        for(int i = 0; i < gameRow; i++) {
            for(int k = 0; k < gameCol; k++) {
                gameLayout[i][k] = new JLabel();
                gameLayout[i][k].setBorder(new LineBorder(Color.BLACK, 1));
                gameLayout[i][k].setOpaque(true);
                panelScreen.add(gameLayout[i][k]);
            }
        }
        
        gameScreen.setVisible(true);
    }
    
    public void moveConfig(KeyEvent e) {
        boolean moveUp = false;
        boolean moveRight = false;
        boolean moveDown = false;
        boolean moveLeft = false;
        
        int key = e.getKeyCode();
    
        if(key == KeyEvent.VK_UP) {
            moveUp = true;
            moveRight = moveDown = moveLeft = false;
            while(moveUp == true) {
                snakeY++;
                try {
                    Thread.sleep(250);
                }
                catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                if(key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_DOWN || key == KeyEvent.VK_LEFT) {
                    moveUp = false;
                }
            }
        }
        else if(key == KeyEvent.VK_RIGHT) {
            moveRight = true;
            moveDown = moveLeft = moveUp = false;
            while(moveRight == true) {
                snakeX++;
                try {
                    Thread.sleep(250);
                }
                catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                if(key == KeyEvent.VK_DOWN || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_UP) {
                    moveRight = false;
                }
            }
        }
        else if(key == KeyEvent.VK_DOWN) {
            moveDown = true;
            moveLeft = moveUp = moveRight = false;
            while(moveDown == true) {
                snakeY--;
                try {
                    Thread.sleep(250);
                }
                catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                if(key == KeyEvent.VK_LEFT || key == KeyEvent.VK_UP || key == KeyEvent.VK_RIGHT) {
                    moveDown = false;
                }
            }
        }
        else if(key == KeyEvent.VK_LEFT) {
            moveLeft = true;
            moveUp = moveRight = moveDown = false;
            while(moveLeft == true) {
                snakeX--;
                try {
                    Thread.sleep(250);
                }
                catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                if(key == KeyEvent.VK_UP || key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_DOWN) {
                    moveLeft = false;
                }
            }
        }
    }
    
    public void snakeSetup() {
    
    }
}
