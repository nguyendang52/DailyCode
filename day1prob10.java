import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author nhatnguyendang
 */



public class day1prob10 {
    // Daily problem #10
    //Implement a job scheduler which takes in a function f and an integer n, 
    //and calls f after n milliseconds.
    private void Solution(int n, int f){
        new java.util.Timer().schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                System.out.println("calling funtion "+ f + " after " + n + "(s)");
            }
        }, n*1000);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        final int n;
        final int f;
        System.out.println("Input time : ");
        n = in.nextInt();
        System.out.println("Input function : ");
        f = in.nextInt();
        day1prob10 prob = new day1prob10();
        prob.Solution(n, f);
    }
}