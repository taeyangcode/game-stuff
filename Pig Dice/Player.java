import java.util.Scanner;

public class Player {
    String name;
    String p1Name;
    String p2Name;
    Score scorekeeper;
    Dice pairOfDice;
    int turnNumber;
    Scanner sc = new Scanner(System.in);
    
    public Player(String name) {
        this.name = name;
        scorekeeper = new Score();
        pairOfDice = new Dice();
        turnNumber = 1;
    }
    
    public String pigDice() {
        String pigDice = "          _____                    _____                    _____                            _____                    _____                    _____                    _____          \r\n         /\\    \\                  /\\    \\                  /\\    \\                          /\\    \\                  /\\    \\                  /\\    \\                  /\\    \\         \r\n        /::\\    \\                /::\\    \\                /::\\    \\                        /::\\    \\                /::\\    \\                /::\\    \\                /::\\    \\        \r\n       /::::\\    \\               \\:::\\    \\              /::::\\    \\                      /::::\\    \\               \\:::\\    \\              /::::\\    \\              /::::\\    \\       \r\n      /::::::\\    \\               \\:::\\    \\            /::::::\\    \\                    /::::::\\    \\               \\:::\\    \\            /::::::\\    \\            /::::::\\    \\      \r\n     /:::/\\:::\\    \\               \\:::\\    \\          /:::/\\:::\\    \\                  /:::/\\:::\\    \\               \\:::\\    \\          /:::/\\:::\\    \\          /:::/\\:::\\    \\     \r\n    /:::/__\\:::\\    \\               \\:::\\    \\        /:::/  \\:::\\    \\                /:::/  \\:::\\    \\               \\:::\\    \\        /:::/  \\:::\\    \\        /:::/__\\:::\\    \\    \r\n   /::::\\   \\:::\\    \\              /::::\\    \\      /:::/    \\:::\\    \\              /:::/    \\:::\\    \\              /::::\\    \\      /:::/    \\:::\\    \\      /::::\\   \\:::\\    \\   \r\n  /::::::\\   \\:::\\    \\    ____    /::::::\\    \\    /:::/    / \\:::\\    \\            /:::/    / \\:::\\    \\    ____    /::::::\\    \\    /:::/    / \\:::\\    \\    /::::::\\   \\:::\\    \\  \r\n /:::/\\:::\\   \\:::\\____\\  /\\   \\  /:::/\\:::\\    \\  /:::/    /   \\:::\\ ___\\          /:::/    /   \\:::\\ ___\\  /\\   \\  /:::/\\:::\\    \\  /:::/    /   \\:::\\    \\  /:::/\\:::\\   \\:::\\    \\ \r\n/:::/  \\:::\\   \\:::|    |/::\\   \\/:::/  \\:::\\____\\/:::/____/  ___\\:::|    |        /:::/____/     \\:::|    |/::\\   \\/:::/  \\:::\\____\\/:::/____/     \\:::\\____\\/:::/__\\:::\\   \\:::\\____\\\r\n\\::/    \\:::\\  /:::|____|\\:::\\  /:::/    \\::/    /\\:::\\    \\ /\\  /:::|____|        \\:::\\    \\     /:::|____|\\:::\\  /:::/    \\::/    /\\:::\\    \\      \\::/    /\\:::\\   \\:::\\   \\::/    /\r\n \\/_____/\\:::\\/:::/    /  \\:::\\/:::/    / \\/____/  \\:::\\    /::\\ \\::/    /          \\:::\\    \\   /:::/    /  \\:::\\/:::/    / \\/____/  \\:::\\    \\      \\/____/  \\:::\\   \\:::\\   \\/____/ \r\n          \\::::::/    /    \\::::::/    /            \\:::\\   \\:::\\ \\/____/            \\:::\\    \\ /:::/    /    \\::::::/    /            \\:::\\    \\               \\:::\\   \\:::\\    \\     \r\n           \\::::/    /      \\::::/____/              \\:::\\   \\:::\\____\\               \\:::\\    /:::/    /      \\::::/____/              \\:::\\    \\               \\:::\\   \\:::\\____\\    \r\n            \\::/____/        \\:::\\    \\               \\:::\\  /:::/    /                \\:::\\  /:::/    /        \\:::\\    \\               \\:::\\    \\               \\:::\\   \\::/    /    \r\n             ~~               \\:::\\    \\               \\:::\\/:::/    /                  \\:::\\/:::/    /          \\:::\\    \\               \\:::\\    \\               \\:::\\   \\/____/     \r\n                               \\:::\\    \\               \\::::::/    /                    \\::::::/    /            \\:::\\    \\               \\:::\\    \\               \\:::\\    \\         \r\n                                \\:::\\____\\               \\::::/    /                      \\::::/    /              \\:::\\____\\               \\:::\\____\\               \\:::\\____\\        \r\n                                 \\::/    /                \\::/____/                        \\::/____/                \\::/    /                \\::/    /                \\::/    /        \r\n                                  \\/____/                                                   ~~                       \\/____/                  \\/____/                  \\/____/         \r\n                                                                                                                                                                                       ";
        return pigDice;
    }
    
    public boolean checkOnesValue() {
        return pairOfDice.checkOnes();
    }
    
    public boolean checkIfDoubles() {
        return pairOfDice.checkDoubles();
    }
    
    public void zeroGameScore() {
        scorekeeper.setGameScore(0);
    }
    
    public void zeroRoundScore() {
        scorekeeper.setRoundScore(0);
    }
    
    public int getGameScore() {
        return scorekeeper.getGameScore();
    }
    
    public String getName() {
        return name;
    }
    
    public int getTurnNumber() {
        return turnNumber;
    }
    
    public void adjustTurnNumber() {
        turnNumber++;
    }
    
    public void setName(String input) {
        name = input;
    }
    
    public void updateGameScore() {
        scorekeeper.adjustGameScore();
    }
    
    public void updateRoundScore() {
        scorekeeper.adjustRoundScore(pairOfDice.rollValue());
    }
    
    public void printScore() {
        System.out.println("Round Score:\t " + scorekeeper.getRoundScore());
        System.out.println("Game Score:\t" + scorekeeper.getGameScore());
    }
    
    public void winGameCheck() {
        if(scorekeeper.getRoundScore() + scorekeeper.getGameScore() >= 100) {
            System.out.println(name + " has won the game!");
            System.out.println(scorekeeper.getGameScore() + scorekeeper.getRoundScore() + " points!");
            System.exit(0);
        }
        else {
        }
    }
    
    public void rollingDice() {
        pairOfDice.rollDice();
        System.out.println("You rolled a " + pairOfDice.getD1() + " and a " + pairOfDice.getD2());
    }

}
