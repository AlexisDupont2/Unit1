package app;
import java.util.Scanner;
public class App {
    public static void main(final String[] args) throws Exception {
        int count = 0;
        String color = "red";



       while (color) {
           System.out.println("The count is " + count);
           count = count + 1;
       }

       while (color == "red"){
       System.out.println("The color is " + color);
       color = "green";

       }


       System.out.println("count finished");
    }
}