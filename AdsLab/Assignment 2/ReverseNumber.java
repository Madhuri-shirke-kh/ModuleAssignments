import java.util.Scanner;

public class ReverseNumber {

    
    public static int reverseNumber(int number) {
        int reversed = 0;
        
        
        while (number != 0) {
            
            int lastDigit = number % 10;
            
            
            reversed = reversed * 10 + lastDigit;
            
           
            number = number / 10;
        }
        
        return reversed;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}