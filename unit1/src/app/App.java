package app;
import java.util.Scanner;

public class App {
     public static void main(final String[] args) throws Exception{

       
      Scanner input = new Scanner(System.in);
     System.out.println("Pick a number 0-100");{
        int value = input.nextInt();

             if ( value == 4) {
            System.out.println( value + " is correct");{

            }
        }
             else if (value <= 3) {
             System.out.println("higher");
             }
             else if (value >= 5)
             System.out.println("Lower");
            }

    }

   }
 
