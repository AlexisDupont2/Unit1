package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       Scanner input = new Scanner(System.in);

       System.out.println("Please enter a place.");
       String place = input.nextLine();
       System.out.println("Ben regularly visits the " + place + " every tuesday.");
       System.out.println("Please enter an adjective ");
       String adjective = input.nextLine();
       System.out.println("Please enter a food");
       String food = input.nextLine();
       System.out.println("While at " + place + " Ben eats " + adjective + " " + food);
       System.out.println("Please enter a verb");
       String verb= input.nextLine();
       System.out.println("He normally " + verb + " after eating");
       System.out.println("Please enter an adjective");
       System.out.println("he likes " + adjective + " friends");
       

    }
}