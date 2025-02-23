//Program for finding whether valid parenthesis are given or not
import java.util.*;
public class Valid_Parenthesis {
    public static boolean isValid (String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //opening bracket case
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            } else {
                //closinf
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && ch==')') || (s.peek()=='{' && ch=='}') || (s.peek()=='[' && ch==']')){
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]){
        String str = "(({}[][[[](]]))";
        System.out.println(isValid(str));
    }
}
