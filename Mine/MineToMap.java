package com.company;

import javax.swing.*;
import java.awt.*;

public class MineToMap {

    Money moneyDetails;
    MineSetup mineDetails;
    MineCreation creationDetails;

    JPanel addMine() {
        JPanel mineName = new JPanel();
        if(moneyDetails.canBuyMine() == true) {
            mineName.setPreferredSize(new Dimension(100, 100));
            mineName.setMinimumSize(new Dimension( 100, 100));
            mineName.setMaximumSize(new Dimension(100, 100));
            mineName.setOpaque(true);
            mineName.setBackground(checkMineType());
            creationDetails.copperTierOne();
            return mineName;
        }
        else {
            return null;
        }
    }

    Color checkMineType() {
        Color mineColor = Color.WHITE;
        if(mineDetails.getMineName(mineDetails.getMineNumber()).contains("C")) {
            mineColor = Color.decode("b87333");
        }
        else if(mineDetails.getMineName(mineDetails.getMineNumber()).contains("S")) {
            mineColor = Color.decode("C0C0C0");
        }
        else if(mineDetails.getMineName(mineDetails.getMineNumber()).contains("G")) {
            mineColor = Color.decode("D4AF37");
        }
        return mineColor;
    }

}
