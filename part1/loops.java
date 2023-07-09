import java.util.Scanner;

public class loops {

  public static void main(String[] args) {
    //speeding ticket
    Scanner reader = new Scanner(System.in);

    System.out.println("Enter an integer:");
    int number = Integer.valueOf(reader.nextLine());

    if(number>120) {
      System.out.println("Speeding ticket");
    }

    //orwell
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number:");
    int number1 = Integer.valueOf(scan.nextLine());

    if(number1 == 1984) {
      System.out.println("Orwell");

    }
    //ancient history

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a year:");
    int year = Integer.valueOf(scanner.nextLine());

    if(year<2015) {
      System.out.println("Ancient history");
    }
    //positivity

    Scanner scan1 = new Scanner(System.in);

    System.out.println("Enter a number");
    int num2 = Integer.valueOf(scan1.nextLine());

    if(num2>0) {
      System.out.println("The number is positive");
    } else {
      System.out.println("The number is not positive");
    }
    //adulthood

    Scanner scan2 = new Scanner(System.in);

    System.out.println("Enter your age:");
    int age = Integer.valueOf(scan2.nextLine());

    if(age>=18) {
      System.out.println("You are an adult.");
    } else {
      System.out.println("You are not an adult.");
    }
    //greater number
    Scanner scan3 = new Scanner(System.in);

    System.out.println("Enter a number:");
    int a = Integer.valueOf(scan3.nextLine());
    System.out.println("Enter another number:");
    int b = Integer.valueOf(scan3.nextLine());

    if(a>b) {
      System.out.println("Greater number is: " + a);
    } else if(b>a) {
      System.out.println("Greater number is: " + b);
    } else {
      System.out.println("The numbers are equal.");
    }
    //grades and points

    Scanner scan4 = new Scanner(System.in);

    System.out.println("Enter your grade");
    int grade = Integer.valueOf(scan4.nextLine());

    if(grade<0) {
      System.out.println("Enter a valid grade");
    } else if (grade<=49) {
      System.out.println("Failed");
    } else if (grade<=59) {
      System.out.println("1");
    } else if (grade<=69) {
      System.out.println("2");
    } else if (grade<=79) {
      System.out.println("3");
    } else if (grade<=89) {
      System.out.println("4");
    } else if (grade<=100) {
      System.out.println("5");
    } else {
      System.out.println("Enter a valid grade");
    }
    //odd or even

    Scanner scan5 = new Scanner(System.in);

    System.out.println("Enter a number:");
    int number5 = Integer.valueOf(scan5.nextLine());

    if(number5 % 2 == 0) {
      System.out.println("The number is even");
    } else {
      System.out.println("The number is odd");
    }

    //comparison of strings

    Scanner reader2 = new Scanner(System.in);

    System.out.println("Enter a string");
    String text1 = reader2.nextLine();

    if (text1.equals("A string")) {
      System.out.println("Correct!");
    } else {
      System.out.println("Not the same string!");
    }
    // password program

    Scanner reader3 = new Scanner(System.in);

    System.out.println("Enter the password");
    String password = reader3.nextLine();

    if (password.equals("Caput Draconis")) {
      System.out.println("Welcome!");
    } else {
      System.out.println("Off with you!");
    }
    // 2 input string comparison

    Scanner reader4 = new Scanner(System.in);

    System.out.println("Enter first string");
    String text2 = reader4.nextLine();
    System.out.println("Enter second string");
    String text3 = reader4.nextLine();

    if(text2.equals(text3)) {
      System.out.println("Same strings");
    } else {
      System.out.println("The strings are different");
    }
    //checking age

    Scanner reader5 = new Scanner(System.in);

    System.out.println("Enter your age");
    int ageVerif = Integer.valueOf(reader5.nextLine());

    if (ageVerif>=0 && ageVerif<=120) {
      System.out.println("OK!");
    } else {
      System.out.println("Impossible");
    }
    //leapYear

    Scanner yearReader = new Scanner(System.in);

    System.out.println("Enter a year:");
    int leapYear = Integer.valueOf(yearReader.nextLine());

    if(leapYear%4 != 0) {
      System.out.println("The number you have entered is not a leap year.");
    } else if (leapYear%100 == 0 && leapYear%400 != 0) {
      System.out.println("The number you have entered is not a leap year");
    } else {
      System.out.println("Leap year!");
    }
    //gift tax

    Scanner valueOfGift = new Scanner(System.in);

    System.out.println("Enter the value of the gift:");
    int giftValue = Integer.valueOf(valueOfGift.nextLine());

    if (giftValue<5000) {
      System.out.println("No tax!");
    } else if (giftValue>=5000 && giftValue<25000) {
      double tax1 = 180 + (giftValue-5000)*0.08;
      System.out.println("Tax: " + tax1);
    } else if (giftValue>=25000 && giftValue<55000) {
      double tax2 = 1700 + (giftValue-25000)*0.1;
      System.out.println("Tax:" + tax2);
    } else if (giftValue>=55000 && giftValue<200000) {
      double tax3 = 4700 + (giftValue-55000)*0.12;
      System.out.println("Tax:" + tax3);
    } else if (giftValue>=200000 && giftValue<1000000) {
      double tax4 = 22100 + (giftValue-200000)*0.15;
      System.out.println("Tax:" + tax4);
    } else {
      double tax5 = 142000 + (giftValue-1000000)*0.17;
      System.out.println("Tax:" + tax5);
    }
  }
}
