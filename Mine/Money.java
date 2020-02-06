package com.company;

public class Money {

    MineSetup mineDetails;

    private int currentMoney = 500;

    boolean canBuyMine() {
        boolean canBuy = false;
        if(currentMoney - mineDetails.getCost(mineDetails.getMineNumber()) >= 0) {
            canBuy = true;
        }
        return canBuy;
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
