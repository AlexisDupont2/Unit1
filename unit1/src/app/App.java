package app;
import java.util.Random;
import java.util.Scanner;

public class App {
     public static void main(final String[] args) throws Exception{
         int redblk[]=new int[37];
         redblk [0]=0
        
        int num1 = 0;
        boolean keepgo = false;
        
        Scanner input = new Scanner(System.in);
         int chips = 100;


         while(keepgo == false)
         System.out.println("would you like to make an inside or outside bet? (enter in lowercase)");
         String inout1 = input.nextLine();

         if (inout1.equals("inside") ) {
             System.out.println("Enter the Number you would like to bet on");
             num1 = input.nextInt();
             input.nextLine();
         }
         else if ( inout1.equals("outside") ) {
             System.out.println("Would you like to bet even, odd, black, or red?");
             num1 = input.nextInt();
             input.nextLine();
         }

          System.out.println("How much would you like to bet?");
         int bet1 = input.nextInt();
         input.nextLine();

         System.out.println("You will bet " + bet1 + " On " + num1);
         input.nextLine();

         System.out.println("would you like to bet again? you have " + chips + " chips remaining");
         

         Random rnd = new Random();
         
         // 0 to 36
         int n1 = rnd.nextInt (37);
         System.out.println("Sprinning.. ");
         System.out.println(n1);
         




         

    }

   }
 
