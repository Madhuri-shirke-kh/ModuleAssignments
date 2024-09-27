import java.util.Scanner;
import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {
        
        int[] arr = new int[10];

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers (duplicates allowed):");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        
        int[] newArr = removeDuplicates(arr);

        
        System.out.println("\nArray after removing duplicates:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        
        scanner.close(); 
    }

    
    public static int[] removeDuplicates(int[] arr) {
        
        Arrays.sort(arr);

        
        int[] temp = new int[arr.length];
        int j = 0;

        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        
        temp[j++] = arr[arr.length - 1];

        
        int[] uniqueArr = new int[j];
        for (int i = 0; i < j; i++) {
            uniqueArr[i] = temp[i];
        }

        return uniqueArr;
    }
}
