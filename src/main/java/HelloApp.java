/**
* HelloApp - UC5 - A simple Java application that greets multiple users by name if
* provided as command-line arguments, or defaults to greeting "World" if no names are given.
*
* Greet Multiple Users - The application accepts multiple names as command-line
* arguments and displays a personalized greeting for all users using an enhanced for loop.
*
* Usage: java HelloApp [name1] [name2] ... [nameN]
* - If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the console
* - If no names are provided, it will display "Hello, World!"
*
* @author JOSH (@Josh-git-lab)
* @version 5.0
* @since UC1
*/

// Key Concepts for HelloAppUC5:
// 1. Default Values: Providing a fallback value when no input is given
// 2. Command-line Arguments: Accessing user input via args[] parameter
// 3. Conditional Statements: Using if to check conditions
// 4. Array Length Check: Using args.length == 0 to detect no input
// 5. Enhanced For Loop: Using for-each loop for cleaner iteration
// 6. StringBuilder: Efficiently building a string from multiple parts
// 7. Conditional Delimiter Logic: Avoiding leading/trailing commas
// 8. Readable Control Flow: Separating no-input and input-present logic


public class HelloApp {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Hello, ");

        if (args.length == 0) {
            builder.append("World");
        } else {
            boolean first = true;

            for (String name : args) {
                if (!first) {
                    builder.append(", ");
                }
                builder.append(name);
                first = false;
            }
        }

        builder.append("!");
        System.out.println(builder.toString());
    }
}
