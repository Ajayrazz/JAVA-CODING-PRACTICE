import java.util.*;
public class Valid_Stack_Sequence {
    public static void main(String args[]){
        int pushed[] = {1,2,3,4,5};
        int poped[] = {4,5,3,2,1};

        //implement
        Stack<Integer> stack = new Stack<>();
        int n = pushed.length;
        int j = 0;
        
        for(int i=0; i<n; i++){
            while(!stack.empty() && poped[j] == stack.peek()){
                stack.pop();
                j++;
            }
            stack.push(pushed[i]);
        }

        while(!stack.empty() && poped[j] == stack.peek()){
            stack.pop();
            j++;
        }

        System.out.println(stack.empty() && n == j);
    }
}
