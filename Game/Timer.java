import java.util.Scanner;
import java.util.ArrayList;

public class Timer {
    
    
    
    public void oneSecond() {
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
    }
    public void twoSecond() {
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
    }
    public void threeSecond() {
        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
    }
    public void fourSecond() {
        try {
            Thread.sleep(4000);
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
    }
    
}
