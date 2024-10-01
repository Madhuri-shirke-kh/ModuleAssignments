import java.util.HashMap;

public class FirstNonRepeated {

    public static char findFirstNonRepeatedChar(String str) {
        
        HashMap<Character, Integer> charCountMap = new HashMap<>();

       
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
        }

        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (charCountMap.get(currentChar) == 1) {
                return currentChar; 
            }
        }

        return '\0'; 
    }

    public static void main(String[] args) {
        String str = "aabbcc";
        char result = findFirstNonRepeatedChar(str);

        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}