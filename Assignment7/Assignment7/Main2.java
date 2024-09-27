import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        
        int[] arr = new int[5];

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        
        int max = findMax(arr);
        int min = findMin(arr);

        
        System.out.println("\nMaximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
        
        scanner.close(); 
    }

    
    public static int findMax(int[] arr) {
        int max = arr[0];  
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  
            }
        }
        return max;
    }

    
    public static int findMin(int[] arr) {
        int min = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];  
            }
        }
        return min;
    }
}