package java401challenges.stacksandqueues;
import java.util.Stack;

public class MultiBracketValidation {

    static Stack<Character> stack = new Stack<>();


    public static boolean multiBracketValidation(String input) {
        try {
            int i = 0;
            while(i < input.length()) {

                if(input.charAt(i) == '}' || input.charAt(i) == ')' || input.charAt(i) == ']' ){
                    stack.pop();
                }else if(input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i) == '[') {
                    stack.push(input.charAt(i));
                }
                i++;
            }
            if(stack.isEmpty()) return true;
            else return false;
        } catch (Exception e) {
            return false;
        }
    }
}
