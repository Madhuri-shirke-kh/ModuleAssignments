import java.util.Scanner;

public class PalindromeCheck {

    
    public static boolean isPalindrome(String str) {
        
        str = str.toLowerCase();

        
        int start = 0;
        int end = str.length() - 1;

        
        while (start < end) {
            
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            
            start++;
            end--;
        }

        
        return true;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

      
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}