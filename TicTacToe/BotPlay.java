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
        if(checkTwo(0, 1, 2)) {
            return 2;
        }
        else if(checkTwo(0, 2, 1)) {
            return 1;
        }
        else if(checkTwo(1, 2, 0)) {
            return 0;
        }
        else if(checkTwo(3, 4, 5)) {
            return 5;
        }
        else if(checkTwo(3, 5, 4)) {
            return 4;
        }
        else if(checkTwo(4, 5, 3)) {
            return 3;
        }
        else if(checkTwo(6, 7, 8)) {
            return 8;
        }
        else if(checkTwo(6, 8, 7)) {
            return 7;
        }
        else if(checkTwo(7, 8, 6)) {
            return 6;
        }
    }
    
    boolean checkTwo(int fill1, int fill2, int unfill) {
        if(checkXFilled().contains(num1) && checkXFilled().contains(num2) && !checkXFilled().contains(unfill) && !checkOFilled().contains(unfill)) {
            return true;
        }
        else {
            return false;
        }
    }

}
