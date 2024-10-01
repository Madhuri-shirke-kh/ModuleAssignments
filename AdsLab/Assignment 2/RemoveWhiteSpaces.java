public class RemoveWhiteSpaces {

    public static void main(String[] args) {
       
        String input = "Java programming language";
        
        
        String result = input.replaceAll("\\s", "");
        
       
        System.out.println("Original String: " + input);
        System.out.println("String after removing white spaces: " + result);
    }
}