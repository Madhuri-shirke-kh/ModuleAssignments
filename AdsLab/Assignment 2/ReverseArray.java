public class ReverseArray {

    public static void main(String[] args) {
       
        int[] arr = {1, 2, 3, 4, 5};
        
       
        System.out.println("Original Array: ");
        printArray(arr);
        
        
        reverseArray(arr);
        
        
        System.out.println("Reversed Array: ");
        printArray(arr);
    }

    
    public static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        
       
        while (i < j) {
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            
            i++;
            j--;
        }
    }

    
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}