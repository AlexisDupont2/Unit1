package app;
import java.util.Random;
import java.util.Scanner;

public class App {
     public static void main(final String[] args) throws Exception{
        
        
        
        
        Scanner input = new Scanner(System.in);
         int chips = 100;

         System.out.println("would you like to make an inside or outside bet?");
         int inout1 = input.nextInt();
         input.nextLine();

         System.out.println("Enter the Number you would like to bet on");
         int num1 = input.nextInt();
         input.nextLine();

          System.out.println("How much would you like to bet?");
         int bet1 = input.nextInt();
         input.nextLine();

         System.out.println("You will bet " + bet1 + " On " + num1);

         Random rnd = new Random();
         
         // 0 to 36
         int n1 = rnd.nextInt (37);
         System.out.println("Sprinning.. ");
         System.out.println(n1);
         


    }

   }
 
