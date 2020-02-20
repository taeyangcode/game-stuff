package com.jetbrains;

import javax.swing.*;
import java.awt.*;

public class WindowConfig {

    private JFrame gameWindow = new JFrame();

    private int windowWidth, windowHeight;

    void frameConfig() {
        gameWindow.setSize(windowWidth, windowHeight);
        gameWindow.setLocationRelativeTo(null);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setResizable(false);
    }

    void getWindowSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        windowWidth = (int) screenSize.getWidth();
        windowWidth = (int) screenSize.getHeight();
    }

    void frameVisibility(boolean visible) {
        gameWindow.setVisible(visible);
    }

    void addFrame(JPanel panel) {
        gameWindow.add(panel);
    }

}
