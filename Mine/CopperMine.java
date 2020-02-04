package com.jetbrains;

public class CopperMine {

    MineSetup use;

    private int copperOneAmount = 0, copperTwoAmount = 0, copperThreeAmount = 0;

    void copperTierOne() {
        copperOneAmount++;
        new MineSetup(nameIncreaserOne(), "Bronze Tier 1", 100, 1, 5000);
    }

    void copperTierTwo() {
        copperTwoAmount++;
        new MineSetup(nameIncreaserTwo(), "Bronze Tier 2", 1000, 4, 10000);
    }

    void copperTierThree() {
        copperThreeAmount++;
        new MineSetup(nameIncreaerThree(), "Bronze Tier 3", 15000, 10, 15000);
    }

    String nameIncreaserOne() {
        return use.getMineName() + Integer.toString(copperOneAmount);
    }

    String nameIncreaserTwo() {
        return use.getMineName() + Integer.toString(copperTwoAmount);
    }

    String nameIncreaerThree() {
        return use.getMineName() + Integer.toString(copperThreeAmount);
    }

}
