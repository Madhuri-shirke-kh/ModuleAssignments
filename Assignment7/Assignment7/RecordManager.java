import java.util.Scanner;

public class RecordManager {
    
    private int[] records;

    
    public RecordManager(int size) {
        
        records = new int[size];
    }

    
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + records.length + " numbers:");
        for (int i = 0; i < records.length; i++) {
            System.out.print("Enter value for position " + (i + 1) + ": ");
            records[i] = scanner.nextInt();
        }
    }

   
    public void printRecord() {
        System.out.println("The records are:");
        for (int i = 0; i < records.length; i++) {
            System.out.println("Record " + (i + 1) + ": " + records[i]);
        }
    }

    
    public static void main(String[] args) {
        
        RecordManager manager = new RecordManager(5);

        
        manager.acceptRecord();

       
        manager.printRecord();
    }
}