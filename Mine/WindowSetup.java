package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class WindowSetup {

    MineCreation creationDetails;
    MineToMap mapDetails;

    private JFrame gameWindow;
    private JPanel gamePanel;

    private int screenWidth, screenHeight;

    public WindowSetup() {
        getScreenSize();
        frameSetup();
    }

    void frameSetup() {
        gameWindow.setSize(screenWidth, screenHeight);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setTitle("Mine Game");
        gameWindow.setLocationRelativeTo(null);
        gameWindow.add(gameWindowSetup(), BorderLayout.NORTH);
        gameWindow.add(buyCopperMine(), BorderLayout.SOUTH);
    }

    void getScreenSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        screenWidth = (int) (screenSize.getWidth() * .75);
        screenHeight = (int) (screenSize.getHeight() * .75);
    }

    JPanel gameWindowSetup() {
        gamePanel.setLayout(new GridLayout(8, 8));
        return gamePanel;
    }

    JButton buyCopperMine() {
        JButton copperBuy = new JButton("Copper Mine");
        copperBuy.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                gamePanel.add(mapDetails.addMine());
            }
        });
        return copperBuy;
    }

    /*
    JButton buySilverMine() {

    }

    JButton buyGoldMine() {

    }
    */

}
