/**
* HelloApp - UC6 - A simple Java application that greets multiple users by name if
* provided as command-line arguments, or defaults to greeting "World" if no names are given.
*
* Greet Multiple Users - The application accepts multiple names as command-line
* arguments and displays a personalized greeting using an enhanced for loop.
* It removes the trailing delimiter using substring().
*
* Usage: java HelloApp [name1] [name2] ... [nameN]
* - If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the console
* - If no names are provided, it will display "Hello, World!"
*
* @author JOSH (@Josh-git-lab)
* @version 6.0
* @since UC1
*/

// Key Concepts for HelloAppUC6:
// 1. Default Values: Handling no input case ("World")
// 2. Command-line Arguments: Using args[]
// 3. Enhanced For Loop: Clean iteration over arguments
// 4. StringBuilder: Efficient string construction
// 5. substring(): Removing trailing delimiter (", ")
// 6. String Length: Using length() for substring logic
// 7. Delimiter Handling: Append always, then remove at end
// 8. Clean Code Design: Separation of building and cleanup logic

public class HelloApp {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Hello, ");

        if (args.length == 0) {
            builder.append("World");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Append all names with delimiter
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", "
            if (nameBuilder.length() > 0) {
                String names = nameBuilder.substring(0, nameBuilder.length() - 2);
                builder.append(names);
            }
        }

        builder.append("!");
        System.out.println(builder.toString());
    }
}