public class OppositeNumberTriangles {
    public static void main(String[] args) {
        int rows = 5;  // Number of rows for each triangle

        // Print both triangles
        for (int i = 1; i <= rows; i++) {
            // First triangle (upwards, left side)
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print spaces between the two triangles
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }

            // Second triangle (downwards, right side)
            for (int j = i; j <= i; j++) {
                System.out.print(j);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}