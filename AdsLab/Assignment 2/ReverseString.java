public class ReverseString {

    public static void main(String[] args) {
     
        String input = "Hello World";
        
        
        char[] chars = input.toCharArray();
        
        
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        
        
        String reversedString = new String(chars);
        
        
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);
    }
}