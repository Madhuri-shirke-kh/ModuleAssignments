import java.util.Stack;
import java.util.Scanner;

public class BalancedParentheses {
    
    public static boolean areParenthesesBalanced(String expr) {
      
        Stack<Character> stack = new Stack<>();
        
        
        for (int i = 0; i < expr.length(); i++) {
            char current = expr.charAt(i);
            
            
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            }
            
            else if (current == ')' || current == '}' || current == ']') {
               
                if (stack.isEmpty()) {
                    return false;
                }
                
               
                char top = stack.pop();
                if (!isMatchingPair(top, current)) {
                    return false;
                }
            }
        }
        
        
        return stack.isEmpty();
    }

    
    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || 
               (open == '{' && close == '}') || 
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter an expression with parentheses: ");
        String expression = scanner.nextLine();
        
        
        if (areParenthesesBalanced(expression)) {
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("The parentheses are not balanced.");
        }

        scanner.close();
    }
}