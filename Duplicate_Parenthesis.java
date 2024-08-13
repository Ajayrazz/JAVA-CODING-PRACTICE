import java.util.*;
public class Duplicate_Parenthesis {
    public static boolean Check_Duplicate( String str ){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return false;
                } else {
                    s.pop();
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str = "((a+b+c))";
        System.out.println(Check_Duplicate(str));
    }
}
