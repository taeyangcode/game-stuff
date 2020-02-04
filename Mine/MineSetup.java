package com.jetbrains;

public class MineSetup {

    private String mineName;
    private String mineType;

    private int cost;
    private int prodAmount;
    private int prodTimeMilli;

    /*
    needed for mines:
    size in the game,
    what it produces,
    how much it produces,
    upgrades,
    */

    MineSetup(String mineName, String mineType, int cost, int prodAmount, int prodTimeMilli) {
    }

    void setMineName(String mineName) {
        this.mineName = mineName;
    }

    String getMineName() {
        return mineName;
    }

    void setMineType(String mineType) {
        this.mineType = mineType;
    }

    String getMineType() {
        return mineType;
    }

    void setCost(int cost) {
        this.cost = cost;
    }

    int cost() {
        return cost;
    }

    void setProdAmount(int prodAmount) {
        this.prodAmount = prodAmount;
    }

    int getProdAmount() {
        return prodAmount;
    }

    void setProdTime(int prodTimeMilli) { this.prodTimeMilli = prodTimeMilli; }

    int getProdTime() {
        return prodTimeMilli;
    }

}
