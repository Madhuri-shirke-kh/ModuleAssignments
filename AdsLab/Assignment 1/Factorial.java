import java.util.Scanner;

public class Factorial {

    
    static long factorial(int number) {
        long result = 1; 
        
        
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fact = factorial(number);
            System.out.println("Factorial of " + number + " is: " + fact);
        }
        
        sc.close();
    }
}