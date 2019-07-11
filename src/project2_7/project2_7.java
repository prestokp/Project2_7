package project2_7;

import java.util.Scanner; //imports Scanner class from util package

public class project2_7 {

    public static void main(String[] args) {

        int speed, distance; //declaring integer variables
        double time;         // declaring time variable, type:double

        Scanner scan = new Scanner(System.in);  //declaring new scanner object named scan, passing keyboard input as
                                                //a parameter for Scanner
        System.out.println("Enter the speed: ");
        speed = scan.nextInt(); //Takes the next integer the user types and assigns that to speed variable
        System.out.print("Enter the distance traveled: ");
        distance = scan.nextInt();

        //Calculate the time to drive distance at speed
        time = (double)distance/speed; //distance is type-casted to double in order to avoid value truncation by integer
                                       //division
        System.out.println("Time elapsed during trip: " + time);
    }
}

//Github Push test
