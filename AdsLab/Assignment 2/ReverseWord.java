import java.util.Scanner;

public class ReverseWord {

    
    public static String reverseWords(String sentence) {
        
        String[] words = sentence.split(" ");
        
        
        StringBuilder reversedSentence = new StringBuilder();
        
       
        for (int i = words.length - 1; i >= 0; i--) {
            
            reversedSentence.append(words[i]);
            
            
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }
        
        return reversedSentence.toString();
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        
        String result = reverseWords(sentence);
        System.out.println("Reversed sentence: " + result);
    }
}