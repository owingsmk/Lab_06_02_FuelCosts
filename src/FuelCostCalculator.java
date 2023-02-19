import java.util.Scanner; //Import to activate scanner function
public class FuelCostCalculator {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in); //Scanner function for the variables
        System.out.print("How many gallons in your gas tank: "); //Output requesting the information for first variable
        double gallonsGas = in.nextDouble(); //Variable for gas
        System.out.print("What is your fuel efficiency in miles per gallon: ");
        //This variable is for the fuel
        // but it will also be a weird number depending on the person due to mpg
        double milesPerGallon = in.nextDouble();
        System.out.print("What is the price per gallon right now: ");
        double perGallon = in.nextDouble(); //
        double per100Miles = (perGallon*100); //This is figuring out how much it will cost per 100 miles
        System.out.print("Your cost per 100 miles is " + per100Miles);
        double distanceTraveled = (milesPerGallon*gallonsGas*100) //This is figuring out the distance and mpg and then multiply it all by 100 to get the distance
        System.out.println("THis is the distance you can travel with what is in your tank " + distanceTraveled);


    }
}