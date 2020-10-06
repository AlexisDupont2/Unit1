package app;
import java.util.Scanner;

public class App {
     public static void main(final String[] args) throws Exception{
        
      Scanner insert = new Scanner(System.in);
    
     final int password = 11;
     
     final int attemps = 0;
      final boolean authenticated = false;
     do {
         final int EnteredPassword;
         System.out.println("Enter password");
         EnteredPassword = insert.nextInt();
         System.out.println("password entered is " + EnteredPassword);
        
         if (password == EnteredPassword); {
        System.out.println("the birds are working for the bourgeoisie");
         boolean athenticated = true;
         
         } else {
         System.out.println("Wrong password try again");
         attemps ++;
    
        }while(attemps < 3 && authenticated == false);{    
   }
}
