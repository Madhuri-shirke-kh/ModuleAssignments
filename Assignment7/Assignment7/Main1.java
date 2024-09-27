import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        
        int[] arr = new int[5];
        
        
        acceptRecord(arr);

        
        printRecord(arr);
    }

    
    public static void acceptRecord(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers to fill the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }
        scanner.close(); 
    }

    
    public static void printRecord(int[] arr) {
        System.out.println("\nCurrent state of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}