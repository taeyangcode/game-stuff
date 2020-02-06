package com.company;

public class MineCreation {

    MineralProduction productionDetails;

    void copperTierOne() {
        new MineSetup("CT1", 100, 2, 5000, 0, 2);
        productionDetails.copperProduction();
    }

    void silverTierOne() {
        new MineSetup("ST1", 1000, 4, 5000, 0, 5);
        productionDetails.silverProduction();
    }

    void goldTierOne() {
        new MineSetup("GT1", 10000, 16, 10000, 0, 20);
        productionDetails.goldProduction();
    }

}
