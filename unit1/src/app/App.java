package app;
import java.util.Scanner;
public class App {
    public static void main(final String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        String answer1 =input.nextLine();

        System.out.println("What is 4/2 ?");
        answer1 = input.nextLine();{

            if ( 4 % 2 == 2 ) {
                System.out.println(answer1 + "Correct");
            } else {
                System.out.println(answer2 + " Wrong answer");
            }
        }

        System.out.println("all finished");
    }
}