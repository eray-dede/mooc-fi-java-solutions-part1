import java.util.Scanner;

public class calculatingWithNumbers {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Enter the number of days:");
    Integer days = Integer.valueOf(reader.nextLine());

    int seconds = days * 24 * 60 * 60;

    System.out.println("The seconds in that given days:" + seconds);

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int number1 = Integer.valueOf(scan.nextLine());
    System.out.println("Enter the second number:");
    int number2 = Integer.valueOf(scan.nextLine());
    System.out.println("Enter the third number:");
    int number3 = Integer.valueOf(scan.nextLine());

    int sum = number1 + number2 + number3;
    System.out.println(sum);

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first number:");
    int num1 = Integer.valueOf(scanner.nextLine());
    System.out.println("Enter the second number:");
    int num2 = Integer.valueOf(scanner.nextLine());

    int sum1 = num1 + num2;

    System.out.println(num1 + " + " + num2 + " = " + sum1);

    Scanner scanner1 = new Scanner(System.in);

    System.out.println("Enter the first number:");
    double numb1 = Double.valueOf(scanner1.nextLine());
    System.out.println("Enter the second number:");
    double numb2 = Double.valueOf(scanner1.nextLine());

    double div1 = (numb1+numb2)/2;
    System.out.println("The average of 2 numbers:" + div1);
  }
}
