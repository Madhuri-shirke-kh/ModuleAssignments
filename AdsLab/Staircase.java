import java.util.*;
public class Staircase {
    
    public static int countWays(int n) {
        if (n == 0) return 1;
        if (n < 0) return 0;

        
        int[] p = new int[n + 1];

        
        p[0] = 1; 
        if (n >= 1) p[1] = 1;  
        if (n >= 2) p[2] = p[1] + 1; 

        
        for (int i = 3; i <= n; i++) {
            p[i] = p[i - 1] + p[i - 2] + p[i - 3];
        }

        return p[n];  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the number of stairs: ");
        int n = scanner.nextInt();
        
    
        System.out.println("Number of ways to reach stair " + n + ": " + countWays(n));
        
        scanner.close();
    }
}