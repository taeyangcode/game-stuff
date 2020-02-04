package com.jetbrains;

import java.util.*;

public class MineSetup {

    private ArrayList<String> mineName = new ArrayList<String>();

    private ArrayList<Integer> cost = new ArrayList<Integer>();
    private ArrayList<Integer> prodAmount = new ArrayList<Integer>();
    private ArrayList<Integer> prodTimeMilli = new ArrayList<Integer>();

    private int mineAmount = 0;
    private int mineNumber;

    /*
    needed for mines:
    size in the game,
    what it produces,
    how much it produces,
    upgrades,
    */

    MineSetup(String mineName, int cost, int prodAmount, int prodTimeMilli) {
        this.mineName.add(mineName);
        this.cost.add(cost);
        this.prodAmount.add(prodAmount);
        this.prodTimeMilli.add(prodTimeMilli);
        mineAmount++;
        this.mineNumber = mineAmount;
    }

    void setMineName(int position, String mineName) {
        this.mineName.set(position, mineName);
    }

    String getMineName(int position) {
        return mineName.get(position);
    }

    void setCost(int position, int cost) {
        this.cost.set(position, cost);
    }

    int cost(int position) {
        return cost.get(position);
    }

    void setProdAmount(int position, int prodAmount) {
        this.prodAmount.set(position, prodAmount);
    }

    int getProdAmount(int position) {
        return prodAmount.get(position);
    }

    void setProdTime(int position, int prodTimeMilli) {
        this.prodTimeMilli.set(position, prodTimeMilli);
    }

    int getProdTime(int position) {
        return prodTimeMilli.get(position);
    }

    void setMineNumber(int setNumber) {
        this.mineNumber = setNumber;
    }

    int getMineNumber() {
        return mineNumber;
    }

}
