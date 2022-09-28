import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            final int end = 0;
            System.out.print("Welcome to the tip calculator!");
            System.out.print("How many people are in your group? ");
            int group = scan.nextInt();
            System.out.print("What's the tip percentage? (0 - 100): ");
            int tip = scan.nextInt();


             System.out.print("Enter a cost in dollars and cents, eg. 12.50 (0 to end): ");
             double cost = scan.nextDouble(); //need to figure out how to add up the costs

        while (cost != 0) { //While loop
            System.out.print("Enter a cost in dollars and cents, eg. 12.50 (0 to end): ");
             cost = scan.nextDouble();
        }

            double bill = cost;
            double totalTip = bill * tip;
            double total = bill + totalTip;


      //  int number = scan.nextInt();

        scan.close();
    }
}
