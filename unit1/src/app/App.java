package app;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(final String[] args) throws Exception {
        String redblk[] = { "0", "RED", "BLACK", "RED", "BLACK", "RED", "BLACK", "RED", "BLACK", "RED", "BLACK",
                "BLACK", "RED", "BLACK", "RED", "BLACK", "RED", "BLACK", "RED", "RED", "BLACK", "RED", "BLACK", "RED",
                "BLACK", "RED", "BLACK", "RED", "BLACK", "BLACK", "RED", "BLACK", "RED", "BLACK", "RED", "BLACK",
                "RED" };
        int rbnum[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
                26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36 };
        String evenodd[] = { "even", "odd", "even", "odd", "even", "odd", "even", "odd", "even", "odd", "even", "odd",
                "even", "odd", "even", "odd", "even", "odd", "even", "odd", "even", "odd", "even", "odd", "even", "odd",
                "even", "odd", "even", "odd", "even", "odd", "even", "odd", "even", "odd", };
        int betchips[] = new int [10];
        String bets[] = new String[10];
        int num1 = 0;
        boolean keepgo = false;
        boolean keepgo1 = false;
        Scanner input = new Scanner(System.in);
        String outsidebet = null;
        int chips = 100;

        while (keepgo1 == false) {
            while (keepgo == false) {
                for(int i = 0; i < 10; i++){
                System.out.println("would you like to make an inside or outside bet? (enter in lowercase)");
                String inout1 = input.nextLine();
         
                if (inout1.equals("inside")) {
                    System.out.println("Enter the Number you would like to bet on (1-36)");
                    bets[i] = input.nextLine();
                    System.out.println("How much would you like to bet on " + bets[i]);
                    betchips[i]= input.nextInt();
                    input.nextLine();
            }
                else if (inout1.equals("outside")) {
                    System.out.println("Would you like to bet even, odd, BLACK, or RED? (enter colors in caps)");
                    bets[i] = input.nextLine();
                System.out.println("How much would you like to bet on " + bets[i]);
                    betchips[i]= input.nextInt();
                    input.nextLine();
                }
                else {
                    System.out.println("IVALID BET");
                }
            
                System.out.println("You will bet $" + betchips[i] + " On " + bets[i]);
                    input.nextLine();

                    System.out.println("You have " + bets + " remaining");
                System.out.println("would you like to bet again? you have " + chips + " chips remaining");
                String kepgo = input.nextLine();
                if (kepgo.equals("yes")) {
                    keepgo = false;
                }
                if (kepgo.equals("no")) {
                    keepgo = true;
                }
            }
        

            Random rnd = new Random();

            // 0 to 36
            int n1 = rnd.nextInt(37);
            String resultcolor;
            System.out.println("Sprinning.. ");

            if (redblk[n1].equals("BLACK")) {
                resultcolor = "BLACK";
            } else if (n1 == 0) {
                resultcolor = "green";
            } else {
                resultcolor = "RED";
            }
            String evenodd1;
            if (evenodd[n1].equals("even")) {
                evenodd1 = "even";
            }
            else {
                evenodd1 = "odd";
            }

            System.out.println(rbnum[n1]);
            System.out.println(redblk[n1]);
            System.out.println(evenodd[n1]);
            input.nextLine();
            if (rbnum[n1] == num1) {
                System.out.println("Winner!");
            }
            if (redblk[n1].equals(outsidebet) ) {
            System.out.println("Winner!");
            
                        
        }
        else {
            System.out.println(" You lost, You now have " + chips + " chips remaining");
        }

            System.out.println("Would you like to keep playing? you have " + chips + " chips remaining");
            String kepgo1 = input.nextLine();
            if (kepgo1.equals("yes")) {
                keepgo1 = false;
            }
            if (kepgo1.equals("no")) {

                keepgo1 = true;
            }
            System.out.println("Program Ended");
          
        }
    }
}
}