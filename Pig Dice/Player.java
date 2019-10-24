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
    
    public boolean winGameCheck() {
        if(scorekeeper.getGameScore() >= 100) {
            System.out.println(name + " has won the game!");
            System.out.println(scorekeeper.getGameScore() + " points!");
            return true;
        }
        else {
            return false;
        }
    }
    
    public void rollingDice() {
        pairOfDice.rollDice();
        System.out.println("You rolled a " + pairOfDice.getD1() + " and a " + pairOfDice.getD2());
    }

}
