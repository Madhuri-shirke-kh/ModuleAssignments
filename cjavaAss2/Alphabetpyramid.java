import java.util.Scanner;

public class AlphabetPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            char alphabet = 'A';  
		char end='z';
		
		
           
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            
            for (int j = 1; j <= 2 * i - 1; j++) {
		for(int k=alphabet;k<=end;k++)
		{
                System.out.print(alphabet);
		
                }
		
		alphabet++;
            }

           
            System.out.println();
        }

        scanner.close();
    }
}