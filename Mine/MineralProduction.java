package com.company;

public class MineralProduction {

    MineSetup test;

    private int copperPrice = 1;
    private int silverPrice = 10;
    private int goldPrice = 100;

    void bronzeProduction() {
        try {
            Thread.sleep(test.getProdTime(test.getMineNumber()));
            test.getProdAmount(test.getMineNumber());
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void silverProduction() {

    }

    void goldProduction() {

    }

}
