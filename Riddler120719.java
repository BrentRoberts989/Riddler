import java.java.math.random;

/**
 * A class to solve the 12/7/2019 Riddler Classic Problem
 * 
 * @author Brent Roberts
 */
public class Riddler120719 {

    private final static int AVGPRESS = 49;

    /**
     * Guess what this does?
     * 
     * @param args Not used
    */
    public static void main(String[] args) {
        try {
            runAvgPresses(Math.pow(10, 10));
        } catch(Exception e) {
            System.out.println("Broke already? Here is the error:\n");
        }
    }


    /**
     * Calculates how many button presses to 42.
     * 
     * @param songNumber the number of the song to be tested.
     */
    private static int presses(int songNumber) {
        return songNumber <= 42 ? 42- songNumber : 142 - songNumber;
    }

    /**
     * Guess
     * 
     * @return A random int from 1 to 100
     */
    private static int rand100() {
        return (int)(100 *Math.random()+1);
    }

    /**
     * Calculates the average button presses from 42 of a random number
     * @return (results in 49)
     */
    private static int avgRand() {
        int result = 0;
        for (double i = 1; i <= 100; i++) {
            result += presses(i);
        }
        return result/100;
    }

    /**
     * Code to be run to calculate average number of presses
     * 
     * @return resulting average of a single run
     */
    private static int avgPresses() {
        boolean not42 = true;
        int song = rand100();
        int buttonPresses = 0;
        while (not42){
            if (song == 42) {
                not42 = false; //looks prettier with these.
                return buttonPresses;
            } else if (presses(song) <= AVGPRESS ) {
                not42 = false;
                return buttonPresses + presses(song); 
            } else {
                //System.out.println("Random roll");
                buttonPresses +=1;
                song = rand100();
                if (buttonPresses >= 100) { //escape hatch
                    System.out.println("Used Escape hatch");
                    return buttonPresses;
                }
            }
        }
        return buttonPresses;
    }

    /**
     * Function to print pretty numbers
     */
    private static void runAvgPresses(double n) {
        int  run = 0;
        double result = 0;
        System.out.println("\n");
        for (double i = 1; i<= n; i++) {
            run  = avgPresses();
            //System.out.print(run+" "); Wanted to speed up
            /*if (i % 20 == 0) {
                System.out.println();
            }*/
            if (i % 10000000 == 0) {
                System.out.println(i);
            }
            result += (double)run;
        }
        System.out.println("\n\nn for this run was: "+n+"\nThe average presses was: "+result/n+"\ntotal number of presses simulated was:"+result);
    }
}