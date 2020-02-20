package com.jetbrains;

import javax.swing.*;
import java.awt.*;

public class GameMap {

    private TTTBoxes getBoxes = new TTTBoxes();

    private JPanel gamePanel = new JPanel();

    void panelConfig() {
        gamePanel.setLayout(new GridLayout(2, 2));
    }

    void addPanel() {
        for(int i = 0; i < getBoxes.getArraySize(); i++) {
            gamePanel.add(getBoxes.makeButton());
        }
    }

}
