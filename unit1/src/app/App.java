package app;
import java.util.Scanner;
public class App {
    public static void main(final String[] args) throws Exception {
        int score = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("What is 4/2 ?");{
        String answer1 =input.nextLine();

            if ( answer1.equals("2") ) {
                System.out.println(answer1 + " is  Correct");
                score++;
            } else {
                System.out.println(" is Wrong answer, The correct answer is 2");
            }
        }
        System.out.println("What color is a banana?");{
        String answer2 =input.nextLine();

            if ( answer2.equals("yellow") ) {
                System.out.println(answer2 +  " is Correct");
                score++;
            } else {
                System.out.println(answer2 + " is Wrong answer, the correct answer is: Yellow");
            }
        }
         System.out.println(" What is 3x6?");{
        String answer3 =input.nextLine();

            if ( answer3.equals("21") ) {
                System.out.println(answer3 + " is Correct");
                score++;
            } else {
                System.out.println(answer3 + " is Wrong answer, the correct answer is: 21");
            }
        }
         System.out.println(" What is the color of the moon?");{
        String answer4 =input.nextLine();

            if ( answer4.equals("Grey") ) {
                System.out.println(answer4 + " is Correct");
                score++;
            } else {
                System.out.println(answer4 + " is Wrong answer, the correct answer is Grey");
            }
        } System.out.println(" Why do cows moo");{
        String answer5 =input.nextLine();

            if ( answer5.equals("because they do") ) {
                System.out.println(answer5 + " is Correct");
                score++;
            } else {
                System.out.println(answer5 + " is Wrong answer, The correct answer is: because they do");
            }
        }
     System.out.println("all finished");
     System.out.println("Your score is "  + score + "/5");
    }
}