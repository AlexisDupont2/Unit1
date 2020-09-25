package app;

public class App {
    public static void main(final String[] args) throws Exception{
       
        for (int i = 0; i <= 10; i = i + 1){
            System.out.println(" The count is " + i);
            System.out.println(" Lets keep counting");
        }
        for (int i = 10; i <= 20; i = i + 1){
            System.out.println("The count is now " + i);
            System.out.println("Lets keep going");
        }
        for (int i = 10; i <= 100; i = i + 1){
            System.out.println("Now the count is " + i);
            System.out.println("Lets continue");
        }
        for (int i = 1000; i <= 256000; i = i + 1){
            System.out.println("The count is " + i);
            System.out.println("Lets keep going");
        }
        for (int i = 11; i <= 12; i = i +1){
            System.out.println("Now this is the count " + 1);
            System.out.println("Lets continue counting");
        }
        for (int i = 10; i >= 0; i = i - 1){
            System.out.println("The count is now " + i);
            System.out.println("Lets keep counting");
        }
        System.out.println("we are done counting");
    }
}