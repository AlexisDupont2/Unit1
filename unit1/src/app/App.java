package app;
import java.util.Random;
import java.util.Scanner;

public class App {
     public static void main(final String[] args) throws Exception{
         String redblk[]={"0","RED","BLACK","RED","BLACK","RED", "BLACK", "RED", "BLACK","RED","BLACK", "BLACK","RED",
         "BLACK","RED","BLACK","RED","BLACK","RED", "RED","BLACK","RED","BLACK","RED","BLACK", "RED",
         "BLACK", "RED", "BLACK", "BLACK","RED","BLACK","RED", "BLACK","RED", "BLACK", "RED"};
         int rbnum[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36};
        
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
         System.out.println(rbnum[n1]); System.out.println(redblk[n1]);
         
        }
    }

   }
 
