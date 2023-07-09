//  to get inputs we have to import scanner tool.
import java.util.Scanner;

public class readingInput {

  public static void main(String[] args) {
    // created a tool for reading user input, named it reader
    Scanner reader = new Scanner(System.in);
    // printed a line to tell the user that we want an input.
    System.out.println("Enter a string:");
    // provided string assigned to a string variable called message
    String message = reader.nextLine();
    // printed the string variable
    System.out.println(message);

    System.out.println("Hello" + " World");
    System.out.println(message + " and the universe..");
  }
}
