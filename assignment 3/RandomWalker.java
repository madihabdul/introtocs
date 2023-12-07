/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Madiha Abdul Maajid, maa525, maa525@scarletmail.rutgers.edu
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/
import java.util.Random;

 public class RandomWalker {

    public static void main(String[] args) {
        int step = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;

        System.out.println("(0,0)");
        for(int i = 0; i < step; i++) {
            Random r = new Random();
            int low = 1;
            int high = 5;
            int result = r.nextInt(high-low) + low;
            // System.out.println("result = " + result);
            if (result == 1) {
                x++; // east
            }
            else if (result == 2) {
                x--; // west
            }
            else if (result == 3) {
                y++; // north
            }
            else if (result == 4) {
                y--; // south
            }
            System.out.println("(" +x + "," +y + ")");
        }
        double euclidean = (x)*(x) + (y)*(y);
        System.out.println("Squared distance = " + euclidean);

    }
}
