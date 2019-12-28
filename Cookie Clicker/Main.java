package com.jetbrains;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GUI run = new GUI();
        run.guiConfig();
        run.gameLabelPositioning();
        run.frameVisibility();
        while(true) {
            run.upgradeIncreaser();
        }
    }
}
