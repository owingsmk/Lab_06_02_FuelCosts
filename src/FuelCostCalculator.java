import java.text.DecimalFormat; //decmial format for program
import java.util.Scanner; //Import to activate scanner function
public class FuelCostCalculator {
    public static void main(String[] args) {
    DecimalFormat df2 =new DecimalFormat(".00");
    Scanner in = new Scanner(System.in); //Scanner function for the variables
        System.out.print("How many gallons in your gas tank: "); //Output requesting the information for first variable
        int gas = in.nextInt(); //Variable for gas
        if (gas<0){
            System.out.print(gas + " is an Invalid Input");
        }
        System.out.print("What is your fuel efficiency in miles per gallon: ");
        //This variable is for the fuel
        // but it will also be a weird number depending on the person due to mpg
        double milesPerGallon = in.nextDouble(); //Variable for Fuel efficency
        double mpg = (milesPerGallon*1.00);
        if (milesPerGallon<1){
            System.out.println(milesPerGallon+ " is an Invalid Input");
            System.exit(0);
        }
        System.out.print("What is the price per gallon right now: ");
        double gasPrice = in.nextDouble(); //Variable for gas price
        double gp = (gasPrice*1.00);
        if (gasPrice<1){
            System.out.println(gasPrice+ " is an Invalid Input");
            System.exit(0);
        }
        double hundered = ((gas/mpg)*100);
            System.out.println("Your cost per 100 miles is " + df2.format(hundered));


        double miles = (mpg*0.6214);  //formula to figure out mpg
        double gallons = (gp*0.2642);
        double mg = (miles/gallons);

        System.out.print("Miles/gallons: " + df2.format(mg)); //Output of the miles a gallon the user uses

    }
}