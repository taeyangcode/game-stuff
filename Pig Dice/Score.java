import java.util.Scanner;

public class Game {
    Player p1;
    Player p2;
    Player currentPlayer;
    Scanner sc = new Scanner(System.in);
    
    public Game() {
        System.out.println("What is Player 1's name?");
        String p1Name = sc.nextLine();
        System.out.println("What is Player 2's name?");
        String p2Name = sc.nextLine();
        p1 = new Player(p1Name);
        p2 = new Player(p2Name);
        currentPlayer = p1;
    }
    public static void main(String[] args) {
        Game pigDice = new Game();
        pigDice.start();
    }
    public void start() {
        while(true) {
            System.out.println(currentPlayer.getName() + " it's your turn");
            currentPlayer.printScore();
            currentPlayer.rollingDice();
            
            if(currentPlayer.checkOnesValue()) {
                currentPlayer.zeroGameScore();
                currentPlayer.zeroRoundScore();
                changePlayer();
            }
            else if(currentPlayer.checkIfDoubles()) {
                currentPlayer.zeroRoundScore();
                changePlayer();
            }
            else {
                rollAgain();
            }
            System.out.println();
            System.out.println();
        }
    }
    public void changePlayer() {
        if(currentPlayer.equals(p1)) {
            currentPlayer = p2;
        }
        else {
            currentPlayer = p1;
        }
    }
    public void rollAgain() {
        //make sure to make else if
        System.out.println("Would you like to roll? Y/N");
        String answer = sc.nextLine().toUpperCase();
        if(answer.equals("Y")) {
            currentPlayer.updateRoundScore();
        }
        else {
            
            currentPlayer.updateGameScore();
            changePlayer();
        }
    }
}
