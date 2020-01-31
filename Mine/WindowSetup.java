package com.company;

import javax.swing.*;
import java.awt.*;

public class WindowSetup {

    private JFrame gameWindow;

    private int screenWidth, screenHeight;

    public WindowSetup() {
        getScreenSize();
        frameSetup();
    }

    void frameSetup() {
        gameWindow.setSize(screenWidth, screenHeight);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setTitle("MvP");
        gameWindow.setLocationRelativeTo(null);
    }

    void getScreenSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        screenWidth = (int) (screenSize.getWidth() * .75);
        screenHeight = (int) (screenSize.getHeight() * .75);
    }

}
