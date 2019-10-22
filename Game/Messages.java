import java.util.Scanner;
import java.util.ArrayList;

public class Messages {
    Time pause = new Time();
    
    public void Msg(String messages) {
        String arrayMessages[] = messages.split("<lb>");
        for(String temp: arrayMessages) {
            System.out.println(temp);
            pause.twoSecond();
        }
    }
}
