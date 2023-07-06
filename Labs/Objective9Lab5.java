import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    double num1, num2;
    boolean keepGoing = true;
    int choice;
    double answer = 0.0;

    // Part 1:
    // prompt the user to provide one number and store their input in num1
    System.out.print("Please provide the first number: ");
    num1 = kb.nextDouble();

    // Part 2:
    // Prompt the user for another number and store their input in num2
    System.out.print("Please provide the second number: ");
    num2 = kb.nextDouble();

    while (keepGoing) {
      printMenu();
      System.out.print("Which would you like to do? ");
      choice = kb.nextInt();

      switch (choice) {
        case 1:
          answer = findSum(num1, num2);
          System.out.println("The sum of " + num1 + " and " + num2 + " is: " + answer);
          break;
        case 2:
          answer = findAverage(num1, num2);
          System.out.println("The average of " + num1 + " and " + num2 + " is: " + answer);
          break;
        case 3:
          answer = calcTax(num1, num2);
          System.out.println("The tax amount based on " + num1 + " and " + num2 + " is: " + answer);
          break;
        case 4:
          System.out.println("Exiting...");
          keepGoing = false;
          break;
        default:
          System.out.println("Invalid choice. Please try again.");
          break;
      }
    }

    kb.close();
  }

  public static void printMenu() {
    System.out.println();
    System.out.println("========= MENU =========");
    System.out.println("|                      |");
    System.out.println("|   1. Add Numbers     |");
    System.out.println("|   2. Find Average    |");
    System.out.println("|   3. Calculate Tax   |");
    System.out.println("|   4. Exit            |");
    System.out.println("|                      |");
    System.out.println("========================");
    System.out.println();
  }

  public static double findSum(double x, double y) {
    double sum = x + y;
    return sum;
  }

  public static double findAverage(double x, double y) {
    double average = (x + y) / 2.0;
    return average;
  }

  public static double calcTax(double x, double y) {
    double taxRate = 0.0831;
    double total = x + y;
    double taxAmount = total * taxRate;
    return taxAmount;
  }

}
