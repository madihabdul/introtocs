/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author: Madiha Abdul Maajid, maa525, maa525@scarletmail.rutgers.edu
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {

    if (n >= 0) {
        String append = original.concat(appendNTimes(original, n - 1));
        return append;
    }
    return "";
    }

    public static void main (String[] args) {

	// WRITE TEST CASES HERE to test your method
    StdOut.println(appendNTimes("cat", 0));
    }
}
