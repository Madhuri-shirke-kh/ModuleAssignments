import java.util.Scanner;

public class FibonacciSeries {

    
    static void printFibonacci(int n) {
        int num1 = 0, num2 = 1;
        
      
        if (n < 1) {
            System.out.println("Please enter a number greater than 0.");
            return;
        }
        
        System.out.print("First " + n + " Fibonacci numbers: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");
                       
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to print: ");
        int n = sc.nextInt();
        
        printFibonacci(n);
        
        sc.close();
    }
}