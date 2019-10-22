import java.util.Random;

public class Minion {
    Time pause = new Time();
    Random rd = new Random();
    
    int minionHp[] = new int[6];
    
    public void minionHpMaker() {
        for(int i = 0; i < 6; i++) {
            int num = (rd.nextInt(5) + 1);
            minionHp[i] = num * 5;
            System.out.println(num);
            System.out.println(minionHp[i]);
        }
    }
    
    
    
    
    
}
