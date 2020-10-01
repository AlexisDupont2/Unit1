package app;
import java.util.Scanner;
public class App {
    public static void main(final String[] args) {
        
    
    
        final Scanner keyboard = new Scanner(System.in);

        System.out.println("Pick a number 1-5 for random cat fact");{
        final int value = keyboard.nextInt();

            if (value == 1)
             {
                System.out.println(" They always land on their feet");
             }
             else if (value == 2)
             {
                System.out.println("A cat was the Mayor of an Alaskan town for 20 years");
             }
             else if (value == 3)
             {
                 System.out.println("Cats spend 70% of their lives sleeping");
             }
             else if (value == 4)
             {
                 System.out.println("Cats have 4 legs");
             }
             else if (value == 5)
             {
                 System.out.println("cats like drinking moving water");
             }
             else if (value >= 6)
             {
                 System.out.println("Error pick a number between 1-5");
             }
            }
   }
}