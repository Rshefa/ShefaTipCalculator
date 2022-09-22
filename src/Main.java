import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            final int end = 0;
            System.out.println("Welcome to the tip calculator!");
            System.out.println("How many people are in your group? ");
            int group = scan.nextInt();
            System.out.println("What's the tip percentage? (0 - 100): ");
            int tip = scan.nextInt();


             System.out.println("Enter a cost in dollars and cents, eg. 12.50 (0 to end): ");
             double cost = scan.nextDouble();

        while (cost != 0) { //While loop
            System.out.println("Enter a cost in dollars and cents, eg. 12.50 (0 to end): ");
             cost = scan.nextDouble();
        }

      //  int number = scan.nextInt();

        scan.close();
    }
}
