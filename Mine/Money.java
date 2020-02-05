package com.jetbrains;

public class Money {

    MineSetup mineDetails;

    private int currentMoney = 0;

    int buyMine() {
        if(currentMoney - mineDetails.cost(mineDetails.getMineNumber()) > 0) {
            currentMoney =- mineDetails.cost(mineDetails.getMineNumber());
            //IF I CAN BUY THE MINE --> ADD MINE TO 2D ARRAY --> ELSE NOTHING (WHY THERE IS NO ELSE STATEMENT HERE)
        }
        return currentMoney;
    }

    int sellMineral() {
        for(int i = mineDetails.getMineralAmount(mineDetails.getMineNumber()); i > 0; i--) {
            currentMoney += mineDetails.getSalePrice(mineDetails.getMineNumber());
        }
        return currentMoney;
    }

    int getCurrentMoney() {
        return currentMoney;
    }

    void setCurrentMoney(int currentMoney) {
        this.currentMoney = currentMoney;
    }

}
