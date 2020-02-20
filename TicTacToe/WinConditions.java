package com.jetbrains;

public class WinConditions {

    private TTTBoxes getBoxes = new TTTBoxes();

    void winScenariosX() {
        if(getBoxes.getPosition(0) == "X" && getBoxes.getPosition(1) == "X" && getBoxes.getPosition(2) == "X") {

        }
        else if(getBoxes.getPosition(0) == "X" && getBoxes.getPosition(3) == "X" && getBoxes.getPosition(6) == "X") {

        }
        else if(getBoxes.getPosition(2) == "X" && getBoxes.getPosition(5) == "X" && getBoxes.getPosition(8) == "X") {

        }
        else if(getBoxes.getPosition(6) == "X" && getBoxes.getPosition(7) == "X" && getBoxes.getPosition(8) == "X") {

        }
    }

    void winScenariosO() {
        if(getBoxes.getPosition(0) == "O" && getBoxes.getPosition(1) == "O" && getBoxes.getPosition(2) == "O") {

        }
        else if(getBoxes.getPosition(0) == "O" && getBoxes.getPosition(3) == "O" && getBoxes.getPosition(6) == "O") {

        }
        else if(getBoxes.getPosition(2) == "O" && getBoxes.getPosition(5) == "O" && getBoxes.getPosition(8) == "O") {

        }
        else if(getBoxes.getPosition(6) == "O" && getBoxes.getPosition(7) == "O" && getBoxes.getPosition(8) == "O") {

        }
    }

}
