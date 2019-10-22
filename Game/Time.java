import java.util.Scanner;
import java.util.Random;

public class Time {
    Random rd = new Random();
    
    
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
    public void randomSecond() {
        try {
            Thread.sleep((rd.nextInt(4) + 1) * 1000);
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}
