/**
 * A class to solve the 12/7/2019 Riddler Classic Problem
 * 
 * @author Brent Roberts
 */
public class Riddler120719 {


    /**
     * Guess what this does?
     * 
     * @param args Not used
    */
    public static void main(String[] args) {
        System.out.println(avgRand());
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
     * Calculates the average button presses from 42 of a random number
     * (results in 49)
     */
    private static int avgRand() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += presses(i);
        }
        return result/100;
    }

    /**
     * Code to be run to calculate average number of presses
     */
    private static int avgPresses() {

    }
}