import java.util.*;
class pyramid
{
 public static void main(String[] args)
 {
	System.out.println("Enter the number of lines:");
	Scanner sc=new Scanner(System.in);
	int rows=sc.nextInt();
	for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces inside the pyramid
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            
            System.out.println();
        }

       

 }
}