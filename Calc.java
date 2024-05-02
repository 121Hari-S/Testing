import java.util.Scanner;

class Calc{
  public static void main(String[] args) {

    char operator;
    int num1, num2 ,result;

    Scanner input = new Scanner(System.in);

    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    System.out.println("Enter first number:");
    num1 = input.nextInt();

    System.out.println("Enter second number:");
    num2 = input.nextInt();

    switch (operator) {

      case '+':
        result = num1 + num2;
        System.out.println("Result :" + result);
        break;

      case '-':
        result = num1 - num2;
        System.out.println("Result :" + result);
        break;

      case '*':
        result = num1 * num2;
        System.out.println("Result: "+ result);
        break;

      case '/':
        result = num1 / num2;
        System.out.println("Result: "+ result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}