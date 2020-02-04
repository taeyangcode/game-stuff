package com.jetbrains;

public class CopperMine {

    private int copperOneAmount = 0, copperTwoAmount = 0, copperThreeAmount = 0;

    void copperTierOne() {
        copperOneAmount++;
        new MineSetup("B1" + copperOneAmount, 100, 1, 5000);
    }

    void copperTierTwo() {
        copperTwoAmount++;
        new MineSetup("B2" + copperTwoAmount, 1000, 4, 10000);
    }

    void copperTierThree() {
        copperThreeAmount++;
        new MineSetup("B3" + copperThreeAmount, 15000, 10, 15000);
    }

}
