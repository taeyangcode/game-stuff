package com.company;

public class MineralProduction {

    MineSetup mineDetails;
    Money moneyDetails;

    private int copperAmount = mineDetails.getMineralAmount(mineDetails.getMineNumber());
    private int silverAmount = mineDetails.getMineralAmount(mineDetails.getMineNumber());
    private int goldAmount = mineDetails.getMineralAmount(mineDetails.getMineNumber());

    void copperProduction() {
        try {
            Thread.sleep(mineDetails.getProdTime(mineDetails.getMineNumber()));
            copperAmount += mineDetails.getProdAmount(mineDetails.getMineNumber());
            moneyDetails.sellMineral();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void silverProduction() {
        try {
            Thread.sleep(mineDetails.getProdTime(mineDetails.getMineNumber()));
            silverAmount += mineDetails.getProdAmount(mineDetails.getMineNumber());
            moneyDetails.sellMineral();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void goldProduction() {
        try {
            Thread.sleep(mineDetails.getProdTime(mineDetails.getMineNumber()));
            goldAmount += mineDetails.getProdAmount(mineDetails.getMineNumber());
            moneyDetails.sellMineral();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
