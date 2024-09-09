public class RightTriangle {
    public static void main(String[] args) {
        int rows = 5;  
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                
                if (i == rows || j == 1 || j == i) {
                    System.out.print(j + " ");
                } else {
                    // Print space for hollow part
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }
    }
}