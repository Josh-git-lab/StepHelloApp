/**
* HelloApp - UC7 - A simple Java application that greets multiple users by name if
* provided as command-line arguments, or defaults to greeting "World" if no names are given.
*
* Greet Multiple Users - The application accepts multiple names as command-line
* arguments and displays a personalized greeting using String.join().
*
* Usage: java HelloApp [name1] [name2] ... [nameN]
* - If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the console
* - If no names are provided, it will display "Hello, World!"
*
* @author JOSH (@Josh-git-lab)
* @version 7.0
* @since UC1
*/

// Key Concepts for HelloAppUC7:
// 1. String.join(): Efficient concatenation with delimiter
// 2. Default Values: Handling no input case ("World")
// 3. Command-line Arguments: Using args[]
// 4. Conditional Logic: args.length == 0 check
// 5. No Loop Required: Direct array handling
// 6. Automatic Delimiter Handling: No trailing commas
// 7. Clean Code: Minimal and readable implementation

public class HelloApp {
    public static void main(String[] args) {

        String names = (args.length == 0) 
                ? "World" 
                : String.join(", ", args);

        System.out.println("Hello, " + names + "!");
    }
}