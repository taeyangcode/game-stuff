import java.util.Scanner;

public class Messages {
    Timer pause = new Timer();
    
    
    public void playerMsg(String pTalkOne, String pTalkTwo) {
        System.out.println(pTalkOne);
        pause.twoSecond();
        System.out.println(pTalkTwo);
    }
    public void gameMsg() {
        
    }
}
