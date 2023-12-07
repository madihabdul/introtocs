import java.util.Scanner;
import java.util.Random;

public class Dungeon {

    public int xDimension;
    public int yDimension;
    public int numSqaures;

    /* generates the dungeon */
    // public Dungeon (int xDimension, int yDimension, int numSquares) { // constructor -> special method that initializes the object

    // }

    // weapons could be a boolean so that if true then add stats, same thing for accessories

    // classes: template where you can construct objects, can define what properties and methods each object has
        // object is where those values live
    // constructor: special method that initialized the object

    public static void main(String args[]) {

        Scanner gameLines = new Scanner(System.in);
        System.out.println("Hello! Welcome to the Dungeon.");
        System.out.println("Please enter your hero's name!");
        String HeroName = gameLines.nextLine();
        System.out.println("Great choice, " + HeroName + ", let's begin generating your stats.");
        Hero player = new Hero(0,0,0);
        //System.out.println(player);
        System.out.println("Now, let's check out a monster's stats.");
        Monster monster = new Monster(0,0); // this can generate monsters!!!
        System.out.println("Monster 2 check");
        Monster monster2 = new Monster(0,0);
        System.out.println("Last test for wizard stats!");
        Wizard wizard = new Wizard(0,0); // wizard generation 0.0

        //Accessories key = true; -> figure out event trigger for key 


        gameLines.close();
    }
}
