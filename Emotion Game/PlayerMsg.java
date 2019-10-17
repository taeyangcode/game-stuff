import java.util.Scanner;

public class PlayerMsg {
    String playerTalk;
    String gameTalk;
    
    public void playerGameMsg(String playerTalk, String gameTalk) {
        this.playerTalk = playerTalk;
        this.gameTalk = gameTalk;
        System.out.println(playerTalk);
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(gameTalk);
    }
}
