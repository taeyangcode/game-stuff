package com.jetbrains;

import java.util.*;

public class BotPlay {

    private TTTBoxes getBoxes = new TTTBoxes();

    int placeO() {
        if(checkXFilled().size() == 1) {
            return loseCheckOne();
        }
        else if(checkXFilled().size() == 2) {

        }
        else if(checkXFilled().size() == 3) {

        }
        else if(checkXFilled().size() == 4) {

        }
        else if(checkXFilled().size() == 5) {

        }
    }

    ArrayList<Integer> checkXFilled() {
        ArrayList<Integer> filledXPosition = new ArrayList<>();
        for(int i = 0; i < 9; i++) {
            if(getBoxes.getPosition(i).equalsIgnoreCase("X")) {
                filledXPosition.add(i);
            }
        }

        return filledXPosition;
    }

    ArrayList<Integer> checkOFilled() {
        ArrayList<Integer> filledOPosition = new ArrayList<>();
        for(int i = 0; i < 9; i++) {
            if(getBoxes.getPosition(i).equalsIgnoreCase("O")) {
                filledOPosition.add(i);
            }
        }

        return filledOPosition;
    }

    int loseCheckOne() {
        if(checkXFilled().contains(4)) {
            return 0;
        }
        else {
            return 4;
        }
    }

    int loseCheckTwo() {
        if(checkXFilled().contains(0) && checkXFilled().contains(1) && !checkXFilled().contains(2)) {
            return 2;
        }
        else if(checkXFilled().contains(1) && checkXFilled().contains(2) && !checkXFilled().contains(0)) {
            return 2;
        }
    }

}
