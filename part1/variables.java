
import java.util.Scanner;

public class variables {

  public static void main(String[] args) {
    String text = "contains text";
    int wholeNumber = 12;
    double floatingPoint =3.14;
    boolean trueOrFalse = true;

    System.out.println(text);
    System.out.println(wholeNumber);
    System.out.println(floatingPoint);
    System.out.println(trueOrFalse);

    //readingTexts
    Scanner textReader = new Scanner(System.in);

    System.out.println("Enter a text:");
    String textValue = textReader.nextLine();
    System.out.println(textValue);

    //convertingStringToInt
    String valueAsString = "42";
    int valueAsInt = Integer.valueOf(valueAsString);
    System.out.println(valueAsInt);

    //readingIntegers
    Scanner valueString = new Scanner(System.in);

    System.out.println("Enter a number:");
    int valueInt = Integer.valueOf(valueString.nextLine());
    System.out.println(valueInt);

    //convertingStringToDouble

    String stringAsDouble = "43.43";
    double valueAsDouble = Double.valueOf(stringAsDouble);
    System.out.println(valueAsDouble);

    //readingDoubles

    Scanner stringDouble = new Scanner(System.in);

    System.out.println("Enter a double number:");
    double valueDouble = Double.valueOf(stringDouble.nextLine());
    System.out.println(valueDouble);

    //readingBooleans

    Scanner stringBoolean = new Scanner(System.in);

    System.out.println("Enter a boolean type:");
    boolean valueBoolean = Boolean.valueOf(stringBoolean.nextLine());
    System.out.println(valueBoolean);

  }
}
