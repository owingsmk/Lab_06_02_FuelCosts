import java.text.DecimalFormat;
import java.util.Scanner; //Import to activate scanner function
public class FuelCostCalculator {
    public static void main(String[] args) {

        DecimalFormat df2 =new DecimalFormat("0.00");
    Scanner in = new Scanner(System.in); //Scanner function for the variables
        System.out.print("How many gallons in your gas tank: "); //Output requesting the information for first variable
        double gas = in.nextDouble(); //Variable for gas
        System.out.print("What is your fuel efficiency in miles per gallon: ");
        //This variable is for the fuel
        // but it will also be a weird number depending on the person due to mpg
        if (gas<1){
            System.out.println(gas+ " is an Invalid Input");
            System.exit(0);
        }
        double milesPerGallon = in.nextDouble(); //Variable for Fuel efficency
        System.out.print("What is the price per gallon right now: ");
        if (milesPerGallon<1){
            System.out.println(milesPerGallon+ " is an Invalid Input");
            System.exit(0);
        }
        double gasPrice = in.nextDouble(); //Variable for gas price
        if (gasPrice<1){
            System.out.println(gasPrice+ " is an Invalid Input");
            System.exit(0);
        }
        double per100Miles = ((gasPrice*gas)/100); //This is figuring out how much it will cost per 100 miles
        System.out.println("Your cost per 100 miles is " + per100Miles);
        double distanceTraveled = ((milesPerGallon/gas)*100); //This is figuring out the distance and mpg and then multiply it all by 100 to get the distance
        System.out.println("This is the distance you can travel with what is in your tank " + distanceTraveled);


    }
}