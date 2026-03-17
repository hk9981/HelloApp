/**
 * HelloApp.java
 * UC3: Display "Hello" with Command-Line Argument or Default Message
 *
 * @author hk9981
 */
public class UC3PrintHello {
    public static void main(String[] args) {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }
        System.out.println("Hello, " + name + "!");
    }
}