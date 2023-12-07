/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author: Madiha Abdul Maajid, maa525@scarletmail.rutgers.edu, maa525
 *
 *************************************************************************/
public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {
    return length * Math.sqrt(3)/2.0; // returns height
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length.  
    public static void filledTriangle(double x, double y, double length) {

        double height = height(length);

        double x1 = x-length/2.0; // triangle x
        double x2 = x+length/2.0;

        double y1 = y+height; // triangle y
            
        double[] xh = new double[] { x, x1,x2 }; // x + y coordinates for initial triangle
        double[] yh = new double[] { y, y1 , y1 };

        StdDraw.filledPolygon(xh,yh);
      }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {
        if (n > 0) {
        filledTriangle(x, y, length);
        n--;
        sierpinski(n, x, y+height(length), length/2.0); // middle triangle
        sierpinski(n, x+length/2.0, y, length/2.0); // right triangle
        sierpinski(n, x-length/2.0, y, length/2.0); // left triangle
        }

      }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {

        double length = 1;
        int n = Integer.parseInt(args[0]); // n input
        double height = height(length);

        double x1 = 0; // x coordinates for outline triangle
        double x2 = length/2;
        double x3 = length;
        double y1 = 0; // y coordinates for outline triangle
        double y2 = height;
        double y3 = 0;

        double[] p1 = new double[] { x1, x2, x3 };
        double[] p2 =  new double[] {y1, y2, y3 };

        sierpinski(n, length/2.0, 0, length/2.0);
        StdDraw.polygon(p1,p2);

      }

}
