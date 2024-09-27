public class ArrayExample {
    
    private int[] arr;

    
    public ArrayExample(int size) {
        arr = new int[size]; // Instantiate array with given size
    }

    
    public void setValue(int index, int value) {
        if (index >= 0 && index < arr.length) {
            arr[index] = value;
        } else {
            System.out.println("Index out of bounds!");
        }
    }

    
    public int getValue(int index) {
        if (index >= 0 && index < arr.length) {
            return arr[index];
        } else {
            System.out.println("Index out of bounds!");
            return -1; // Default error value
        }
    }

   
    public void printArray() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        ArrayExample arrayExample = new ArrayExample(5);

        
        arrayExample.setValue(0, 10);
        arrayExample.setValue(1, 20);
        arrayExample.setValue(2, 30);
        arrayExample.setValue(3, 40);
        arrayExample.setValue(4, 50);

        
        System.out.println("Value at index 0: " + arrayExample.getValue(0));
        System.out.println("Value at index 1: " + arrayExample.getValue(1));

        
        System.out.print("Array elements: ");
        arrayExample.printArray();
    }
}