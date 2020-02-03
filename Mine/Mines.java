package com.company;

public class Mines {

    MineSetup getMine;

    private String mineType;
    private String productionType;

    private int productionAmount;
    private int cost;
    private int mineWidth;
    private int mineHeight;

    void makeBronzeMine() {
        new MineSetup("Bronze Mine", "Bronze", 2, 100, 1, 1);
    }

    void makeSilverMine() {
        new MineSetup("Silver Mine", "Silver", 2, 1000, 1, 1);
    }

    void makeGoldMine() {
        new MineSetup("Gold Mine", "Gold", 2, 25000, 1, 1);
    }

    void setMineType(String mineType) {
        this.mineType = mineType;
    }

    String getMineType() {
        return mineType;
    }

    void setProductionType(String productionType) {
        this.productionType = productionType;
    }

    String getProductionType() {
        return productionType;
    }

    void setProductionAmount(int productionAmount) {
        this.productionAmount = productionAmount;
    }

    int getProductionAmount() {
        return productionAmount;
    }

    void setCost(int cost) {
        this.cost = cost;
    }

    int cost() {
        return cost;
    }

    void setMineWidth(int mineWidth) {
        this.mineWidth = mineWidth;
    }

    int getMineWidth() {
        return mineWidth;
    }

    void setMineHeight(int mineHeight) {
        this.mineHeight = mineHeight;
    }

    int getMineHeight() {
        return mineHeight;
    }

}
