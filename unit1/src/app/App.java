package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       Scanner input = new Scanner(System.in);

       System.out.println("Please enter a place.");
       String place = input.nextLine();
       System.out.println("Ben regularly visits the " + place + " every tuesday.");
       System.out.println("Please enter an adjective ");
       String adjective1 = input.nextLine();
       System.out.println("Please enter a food (plural)");
       String food = input.nextLine();
       System.out.println("While at " + place + " Ben eats " + adjective1 + " " + food);
       System.out.println("Please enter a verb");
       String verb1= input.nextLine();
       System.out.println("He normally " + verb1 + " after eating");
       System.out.println("Please enter an adjective");
       String adjective2 = input.nextLine();
       System.out.println("he likes " + adjective2 + " friends");
       

    }
}