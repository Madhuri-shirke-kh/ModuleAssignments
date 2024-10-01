import java.util.Scanner;

public class SquareRoot {

    
    static int findSquareRoot(int num) {
        if (num == 0 || num == 1) {
            return num; 
        }
        
        int low = 1, high = num, result = 0;
        
                while (low <= high) {
            int mid = (low + high) / 2;
            
            
            if (mid * mid == num) {
                return mid;
            }
            
            
            if (mid * mid < num) {
                low = mid + 1;
                result = mid; 
            }
        
            else {
                high = mid - 1;
            }
        }
        
        return result; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        
        int sqrt = findSquareRoot(number);
        
        System.out.println("The integer approximation of the square root of " + number + " is: " + sqrt);
        
        sc.close();
    }
}