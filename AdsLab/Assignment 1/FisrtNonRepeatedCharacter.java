import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {

    
    static char firstNonRepeatedCharacter(String str) {
        
        str = str.toLowerCase();
        
        
        Map<Character, Integer> charCountMap = new HashMap<>();
        
               for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        
        
        for (char ch : str.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                return ch; 
            }
        }
        
        return '\0'; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        char result = firstNonRepeatedCharacter(input);
        
        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
        
        sc.close();
    }
}