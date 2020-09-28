package app;

public class App {
    public static void main(final String[] args) throws Exception {

        for (int i = 1; i <= 20; i++) {
            if (i % 4 == 0) {
                System.out.println(i + " is devisable by 4");
            } else {
                System.out.println(i + " isn't divisible by 4");
            }
        }

        System.out.println("all finished");
    }
}