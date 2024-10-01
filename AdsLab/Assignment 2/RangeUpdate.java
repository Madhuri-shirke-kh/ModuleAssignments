import java.util.Scanner;

public class RangeUpdate {

    
    public static int[] rangeUpdate(int n, int[][] queries) {
        
        int[] diff = new int[n + 1];

        
        for (int[] query : queries) {
            int l = query[0]; 
            int r = query[1]; 
            int value = query[2]; 

            
            diff[l] += value;

            
            if (r + 1 < n) {
                diff[r + 1] -= value;
            }
        }

        
        int[] result = new int[n];
        
        
        result[0] = diff[0];
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + diff[i];
        }

        return result;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        
        System.out.print("Enter the number of queries: ");
        int q = scanner.nextInt();

        
        int[][] queries = new int[q][3];
        System.out.println("Enter the queries in the format (l r value): ");
        for (int i = 0; i < q; i++) {
            queries[i][0] = scanner.nextInt();  
            queries[i][1] = scanner.nextInt();  
            queries[i][2] = scanner.nextInt();  
        }

        
        int[] result = rangeUpdate(n, queries);

        
        System.out.println("Final array after range updates: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}