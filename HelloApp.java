/**
 * HelloApp.java
 * UC6: Display "Hello" using Enhanced For-Loop and Substring Method
 *
 * @author hk9981
 */
public class HelloApp {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            String names = "";

            // Enhanced for-loop
            for (String name : args) {
                names += name + ", ";
            }

            // Remove trailing ", "
            names = names.substring(0, names.length() - 2);

            System.out.println("Hello, " + names + "!");
        }
    }
}