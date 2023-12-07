/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Madiha Abdul Maajid, maa525@scarletmail.rutgers.edu, maa525
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
        double[] copiedArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }

        return copiedArray;
        
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {

        for(int i = 0; i < x.length; i++) {
            x[i] = x[i]*alpha;
        }
        

        for(int j = 0; j < y.length; j++) {
            y[j] = y[j]*alpha;
        }

    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
        for(int i = 0; i < x.length; i++) {
            x[i] = x[i] + dx;
        }
        
        for(int j = 0; j < y.length; j++) {
            y[j] = y[j] + dy;
        }
	
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {

        double[] copyX = copy(x);
        double[] copyY = copy(y);
        theta = Math.toRadians(theta);
        for(int i = 0; i < x.length; i++) {
            
             x[i] = copyX[i]*Math.cos(theta)-copyY[i]*Math.sin(theta);
             y[i] = copyY[i]*Math.cos(theta)+copyX[i]*Math.sin(theta);
    }
        
	
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {

        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1};
        copy(x);
        copy(y);

        // scales polygon by 2
        // StdDraw.setScale(-5.0, +5.0);
        // double alpha = 2.0;

        // StdDraw.setPenColor(StdDraw.RED);
        // StdDraw.polygon(x,y);

        // scale(x,y,alpha);
        // StdDraw.setPenColor(StdDraw.BLUE);
        // StdDraw.polygon(x,y);


        //for(int n = 0; n < x.length; n++) {
        //System.out.println("x val:" + x[n] + "y-val" + y[n]);
        //}

        //Translates polygon by 2,1
        // StdDraw.setScale(-5.0, +5.0);
        // double dx = 2.0, dy = 1.0;

        // StdDraw.setPenColor(StdDraw.RED);
        // StdDraw.polygon(x,y);

        // translate(x,y,dx,dy);
        // StdDraw.setPenColor(StdDraw.BLUE);
        // StdDraw.polygon(x,y);


        // Rotates polygon by 45 degrees
        StdDraw.setScale(-5.0, +5.0);
        double theta = 30;
        System.out.println(theta);

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x,y);

        rotate(x,y,theta);
    

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x,y);
        
    }
}
