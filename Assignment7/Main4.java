import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers for the first array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter value for arr1[" + i + "]: ");
            arr1[i] = scanner.nextInt();
        }

        
        System.out.println("\nEnter 5 integers for the second array:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter value for arr2[" + i + "]: ");
            arr2[i] = scanner.nextInt();
        }

        
        int[] intersection = findIntersection(arr1, arr2);

      
        System.out.println("\nIntersection of the two arrays:");
        if (intersection.length > 0) {
            for (int i = 0; i < intersection.length; i++) {
                System.out.print(intersection[i] + " ");
            }
        } else {
            System.out.println("No common elements found.");
        }

        scanner.close(); 
    }

    
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        // Create an ArrayList to store the intersection elements
        ArrayList<Integer> intersectionList = new ArrayList<>();

        
        for (int i = 0; i < arr1.length; i++) {
            
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !intersectionList.contains(arr1[i])) {
                    intersectionList.add(arr1[i]);
                    break; // 
                }
            }
        }

        
        int[] intersectionArray = new int[intersectionList.size()];
        for (int i = 0; i < intersectionArray.length; i++) {
            intersectionArray[i] = intersectionList.get(i);
        }

        return intersectionArray;
    }
}