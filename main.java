import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Double num1 = 0.0;
    Double num2 = 0.0;
    Double result = 0.0;

    System.out.println("Write the first number:");
    num1 = input.nextDouble();
    input.nextLine(); // Hardcoded line jump

    System.out.println("Write the second number");
    num2 = input.nextDouble();
    input.nextLine();

    System.out.println("Choose an operation (+ - / *):");
    String operation = input.nextLine();

    switch (operation) {
      case "+":
        result = num1 + num2;
        break;
      case "-":
        result = num1 - num2;
        break;
      case "*":
        result = num1 * num2;
        break;
      case "/":
        if (num1 == 0.0 || num2 == 0) {
          System.err.println("A number cannot be divided by zero");
        } else {
          result = num1 / num2;
        }
        break;
      default:
        System.err.println("Choose a valid operation");
        break;
    }

    System.out.println("result: " + result);
    input.close();
  }
}
