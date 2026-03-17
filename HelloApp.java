/**
 * HelloApp.java
 * UC5: Display "Hello" using Enhanced For-Loop with Multiple Arguments or Default Message
 *
 * @author hk9981
 */
public class HelloApp {
    public static void main(String[] args) {

        // If no arguments → default
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            // Enhanced for-loop
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }

    }
}