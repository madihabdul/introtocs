import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class NBody extends Canvas implements ActionListener
{
    public int n;
    public int x;
    public int y;
    public int size; // diameter = star mass
    public double dt = 0.1;
    public double maxVel = 10;
    public double vel;
    public double maxMass = 100;
    
    public int redVal = (int)Math.floor(Math.random()*(255-128+1)+128); // generates rand color value
    public int greenVal = (int)Math.floor(Math.random()*(255-128+1)+128); // generates rand color value
    public int blueVal = (int)Math.floor(Math.random()*(255-128+1)+128); // generates rand color value

    /*
    FINAL to-do:
    6. star's position and velocity over time
    7. calculate acceleration based on graviational force
    8. generate multiple stars based on command line input
    
    note: i believe 6 and 7 should be done in the actionPerformed() method

    done:
        1. star needs random starting position = [0,800]
        2. star needs random color = [128, 255]
        3. star needs random velocity = (-maxVel, maxVel)
        4. star needs random mass = [0, maxMass]
        5. each star should be filled circle with diameter == mass 
     */

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public void init(int n)
    {

        // Your initialization code here:
        this.n = n;
        // this.redVal = redVal;
        // this.greenVal = greenVal;
        // this.blueVal = blueVal;
        // this.x = x;
        // this.y = y;

        ArrayList<Integer> starLocation = new ArrayList<Integer>();
        ArrayList<Integer> starMass = new ArrayList<Integer>();
        ArrayList<Integer> numStars = new ArrayList<Integer>();

        //ArrayList<Double> starVelocity = new ArrayList<Double>();

        x = (int)Math.floor(Math.random()*(800-0+1)+0); // generates random x position value
        y = (int)Math.floor(Math.random()*(800-0+1)+0); // generates random y position value
        size = (int)Math.floor(Math.random()*(1000-0+1)+0); // generates random star size
        vel = (double)Math.floor(Math.random()*(10-(-10)+1)+(-10)); // generates random velocity

        // reflects x position change on star
        for(int i = 0; i < this.n; i++) {
            x = (int)Math.floor(Math.random()*(800-0+1)+0); // generates random x position value
            starLocation.add(x);
        }

        // reflects y position change on star
        for(int k = 0; k < this.n; k++) {
            y = (int)Math.floor(Math.random()*(800-0+1)+0); // generates random y position value
            starLocation.add(y);
        }

        // reflects size change on star
        for(int l = 0; l < this.n; l++) {
            size = (int)Math.floor(Math.random()*(20-1+1)+1); // generates random star size 
            starMass.add(size);
        }

        System.out.println("Star Location: " + starLocation);
        System.out.println("Star Mass: " + starMass);
}

    // Draw a circle centered at (x, y) with radius r
    public void drawCircle(Graphics g, int x, int y, int r)
    {
    
        //int d = 2*r;
        for(int i = 0; i <= this.n; i++) {
        int d = size; // makes diameter equal to star size
        g.fillOval(x - r, y - r, d, d);
        }
        
    }

    public void paint(Graphics g)
    {
        // Clear the screen
        super.paint(g);

        // Your drawing code here:
        // int redVal = (int)Math.floor(Math.random()*(255-128+1)+128); // generates rand color value
        // int greenVal = (int)Math.floor(Math.random()*(255-128+1)+128); // generates rand color value
        // int blueVal = (int)Math.floor(Math.random()*(255-128+1)+128); // generates rand color value

        // for(int i = 0; i <= n; i++) {
        //     //System.out.println(n);
        //     g.setColor(new Color(redVal), (greenVal), (blueVal));
        // }
        //g.setColor(Color.WHITE);

        for(int i = 0; i <= this.n; i++) {
            g.setColor(new Color(redVal, greenVal, blueVal));
            drawCircle(g, x, y, 10);
        }

        // System.out.println("Star Color Red: " + redVal);
        // System.out.println("Star Color Green: " + greenVal);
        // System.out.println("Star Color Blue: " + blueVal);

    }

    public void actionPerformed(ActionEvent e)
    {
        // Your update code here:
        
        double gravForce = 0;
        double gravConstant = 100.0;
        double dt = 0.1;
        double magVector = 0;
        double acceleration = 0;

        /*
         * to do:
         *      1. simulation: model star's position and velocity over time
         *      2. gravitational force: calculate acceleration due to gravity of two mass objects (stars)
         */

        ArrayList<Double> starPosition = new ArrayList<Double>(); // deltaPosition = velocity * dt
        ArrayList<Double> starVelocity = new ArrayList<Double>(); // deltaVelocity = acceleration * dt --> need acceleration, calculated from grav
        ArrayList<Double> starAcceleration = new ArrayList<Double>();


        for(int m = 0; m < this.n; m++) {
            vel = (double)Math.floor(Math.random()*(10-(-10)+1)+(-10)); // generates random velocity
            starPosition.add(vel*dt); // position         
        }

        

        System.out.println("Star Position: " + starPosition);

        //double deltaPos = starVelocity*0.1;

    // reflects changes on star --> use calculated gravity formulas here, etc.
        for(int i = 0; i < this.n; i++) {
            for(int k = 0; k < this.n; k++) {
                if(i != k) {


                    magVector = Math.sqrt((x * x) + (y*y)); // magnitude of vector == distance between objects

                    if(magVector < 5) {
                        magVector = 5;
                    }


                    // note: not sure how to get masses for separate objects as i can't create multiple objects as of right now, only 1 star generates
                    // i calculate mass for each object in the init() method, how to call those values here? the below formula should work:
                    
                    // gravForce += gravConstant*(mass1.get(i)*mass2.get(k)) / (magVector * magVector); // gravitationl force between two objects
                    // acceleration = gravForce/mass;
                    // gravForce = mass*acceleration;

                }
            }
        }


        x++;
        y++;


        // Repaint the screen
        repaint();
        Toolkit.getDefaultToolkit().sync();
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int n = Integer.parseInt(args[0]);

        NBody nbody = new NBody();
        nbody.setBackground(Color.BLACK);
        nbody.size = 800;
        nbody.maxVel = 10;
        nbody.maxMass = 10;
        nbody.dt = 0.1;
        nbody.setPreferredSize(new Dimension(nbody.size, nbody.size));
        nbody.init(n);

        frame.add(nbody);
        frame.pack();

        Timer timer = new Timer(16, nbody);
        timer.start();

        frame.setVisible(true);
    }
}