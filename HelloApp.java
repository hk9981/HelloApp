/**
 * HelloApp.java
 * UC4: Display "Hello" with Multiple Command-Line Arguments or Default Message
 *
 * @author hk9981
 */
public class HelloApp {
    public static void main(String[] args) {

        // If no arguments, use default
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            // Loop through all names
            for (int i = 0; i < args.length; i++) {
                System.out.println("Hello, " + args[i] + "!");
            }
        }

    }
}