import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){

        //initialize object
        Scanner scan =new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        //variables
        double totalCost = 0;
        double cost = 0;
        int tip;
        int group;
        double totalWithTip;


        //user input
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        group = scan.nextInt();
        System.out.print("What's the tip percentage? (0 - 100): ");
        tip = scan.nextInt();
        scan.nextLine();

        //While loop
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, eg. 12.50 (0 to end): ");
            cost = scan.nextDouble();
            totalCost += cost;
            scan.nextLine();
        }

        //Print and calculate
        totalCost ++;
        totalWithTip = totalCost * (((double) tip / 100) + 1);
        System.out.println("-------------------------");
        System.out.println("Total Bill Before Tip: " + formatter.format(totalCost));
        System.out.println("Tip Percentage: " + tip);
        System.out.println("Total Tip: " + (formatter.format(totalWithTip - totalCost)));
        System.out.println("Total Bill With Tip: " + formatter.format(totalWithTip));
        System.out.println("Per person cost before Tip: " +(formatter.format(totalCost / group)));
        System.out.println("Tip per person: " + formatter.format(((totalWithTip - totalCost) / group)));
        System.out.println("Total cost per person: " + formatter.format(totalCost / group));


        scan.close();
    }
}

