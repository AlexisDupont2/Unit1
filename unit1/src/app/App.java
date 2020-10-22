package app;
import java.util.Random;
import java.util.Scanner;

public class App {
     public static void main(final String[] args) throws Exception{
         String redblk[]={"0","1 RED","2 BLACK","3 RED","4 BLACK","5 RED", "6 BLACK", "7 RED", "8 BLACK","9 RED","10 BLACK", "11 BLACK","12 RED",
         "13 BLACK","14 RED","15 BLACK","16 RED","17 BLACK","18 RED", "19 RED","20 BLACK","21 RED","22 BLACK","23 RED","24 BLACK", "25 RED",
         "26 BLACK", "27 RED", "28 BLACK", "29 BLACK","30 RED","31 BLACK","32 RED", "33 BLACK","34 RED", "35 BLACK", "36 RED"};
        
        int num1 = 0;
        boolean keepgo = false;
        
        Scanner input = new Scanner(System.in);
         int chips = 100;


        while (keepgo == false){
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

         System.out.println("You will bet $" + bet1 + " On " + num1);
         input.nextLine();

         System.out.println("would you like to bet again? you have " + chips + " chips remaining");
         String kepgo =input.nextLine();
         if(kepgo == "yes"){
        keepgo = false;
         }
         else if(kepgo == "no"){
         keepgo = true;
         }
        
         Random rnd = new Random();
         
         // 0 to 36
         int n1 = rnd.nextInt (37);
         System.out.println("Sprinning.. ");
         System.out.println(redblk[n1] );
        }
    }

   }
 
