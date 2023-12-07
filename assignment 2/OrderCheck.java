/*************************************************************************
 *  Compilation:  javac OrderCheck.java
 *  Execution:    java OrderCheck 5 10 15 2
 *
 *  @author: Madiha Abdul Maajid, maa525@scarletmail.rutgers.edu, maa525
 *
 *  Prints true if the four integer inputs are in strictly ascending
 *  or descending order, false otherwise
 *
 *  % java OrderCheck 5 10 15 2
 *  false
 *
 *  % java OrderCheck 15 11 9 4
 *  true
 *
 *************************************************************************/

public class OrderCheck {

    public static void main(String[] args) {

        int w = Integer.parseInt(args[0]); /*Inputs through command line*/
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        int z = Integer.parseInt(args[3]);

        boolean output = (w>x) && (x>y) && (y>z) || (z>y) && (y>x) && (x>w); /*Comparison of int values and boolean condition*/
        System.out.println(output); /*Output true or false*/
        
	
    }
}
