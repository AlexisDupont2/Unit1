package app;
import java.util.Scanner;
public class App {
     public static void main(final String[] args) throws Exception{
        
     Scanner console = new Scanner(System.in);
    
     final int password = 11;
     
     int attemps = 0;
      final boolean athenticated = false;
      do{
         final int EnteredPassword;
          System.out.println("Enter password");
		EnteredPassword = console.nextInt();
        
    
    }while(attemps < 3 && athenticated == false);
            
   }
}
