/**
 * UC2: Display "Hello" with a Command-Line Argument
 *
 * @author hk9981
 * @version 1.2
 * @since UC1
 */

public class UC2PrintHello{
    public static void main(String[] args) {
        String name = args[0];
        System.out.println("Hello, " + name + "!");
    }
}