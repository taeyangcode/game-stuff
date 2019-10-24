import java.util.Scanner;
import java.util.Random;

public class Die {
    Random rd;
    int numSides;
    int value;
    
    public Die(int num) {
        rd = new Random();
        numSides = num;
        value = rd.nextInt(numSides) + 1;
    }
    public void roll() {
        value = rd.nextInt(numSides) + 1;
    }
    public int getValue() {
        return value;
    }
}
