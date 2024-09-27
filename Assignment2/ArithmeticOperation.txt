import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        
        // Accept the arithmetic operator from the user
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        
        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
               
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please enter one of +, -, *, /.");
        }

        
        scanner.close();
    }
}