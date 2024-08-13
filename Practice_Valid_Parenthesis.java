import java.util.*;
public class Practice_Valid_Parenthesis {
    
    public static boolean validParenthesis(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            //opening bracket case
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            } else {
                //case of empty stack
                if(stack.isEmpty()){
                    return false;
                } else if((stack.peek() == '(' && ch == ')') || (stack.peek() == '{' && ch == '}') || ( stack.peek() == '[' && ch == ']')){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    public static void main(String args[]){
        String str = "[({{((([{{[]({}([]){})}}])))}()(())})]" ;

        System.out.println("Given character of string is valid -> " + validParenthesis(str));
    }
}
