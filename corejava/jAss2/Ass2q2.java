import java.util.Scanner;

public class Ass2q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

    
        double bmi = weight / (height * height);

        
        System.out.printf("Your BMI is: %.2f\n", bmi);

        
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
            } else if (bmi >= 30 && bmi < 34.9) {
            System.out.println("You are obese (Class 1).");
        } else if (bmi >= 35 && bmi < 39.9) {
            System.out.println("You are obese (Class 2).");
        } else {
            System.out.println("You are extremely obese (Class 3).");
        }

    
    
    }
}