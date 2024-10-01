public class PalindromeCheck {

    public static boolean isPalindrome(int number) {
        
        if (number < 0) {
            return false;
        }

        int originalNumber = number; 
        int reversedNumber = 0;       

       
        while (number != 0) {
            int digit = number % 10;  
            reversedNumber = reversedNumber * 10 + digit;  
            number /= 10;  
        }

     
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        int number = 1221;  // Example number

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}