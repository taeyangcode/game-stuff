import java.util.Scanner;
import java.util.ArrayList

public class Messages {
    Timer pause = new Timer();
    
    
    public void playerMsg(ArrayList<String> list) {
        for(String name: list) {
            System.out.println(name);
        }
    }
    public void gameMsg() {
        
    }
}
