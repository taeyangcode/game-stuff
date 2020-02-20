package com.jetbrains;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;

public class TTTBoxes {

    private BorderCreation getBorder = new BorderCreation();
    private WinConditions winCheck = new WinConditions();
    private BotPlay getBot = new BotPlay();

    private ArrayList<JButton> gameButtons = new ArrayList<>(9);

    JButton makeButton() {
        JButton tttBox = new JButton();

        tttBox.setHorizontalAlignment(SwingConstants.CENTER);
        tttBox.setVerticalAlignment(SwingConstants.CENTER);
        tttBox.setBorder(getBorder.blackBorder());
        tttBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tttBox.setText("X");
                winCheck.winScenariosX();
                setButtonO();
                winCheck.winScenariosO();
            }
        });

        gameButtons.add(tttBox);

        return tttBox;
    }

    void setButtonO() {
        gameButtons.get(getBot.placeO()).setText("O");
    }

    int getArraySize() {
        return gameButtons.size();
    }

    String getPosition(int position) {
        return gameButtons.get(position).getText();
    }

}
